// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   BillEventHandler.java

package nc.ui.trade.bill;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import nc.bs.logging.Logger;
import nc.ui.ml.NCLangRes;
import nc.ui.pub.ButtonObject;
import nc.ui.pub.ClientEnvironment;
import nc.ui.pub.beans.*;
import nc.ui.pub.bill.*;
import nc.ui.pub.pf.PfUtilClient;
import nc.ui.pub.print.PrintEntry;
import nc.ui.pub.workflownote.FlowStateDlg;
import nc.ui.trade.base.AbstractBillUI;
import nc.ui.trade.bsdelegate.*;
import nc.ui.trade.buffer.BillUIBuffer;
import nc.ui.trade.buffer.RecordNotFoundExcetption;
import nc.ui.trade.businessaction.*;
import nc.ui.trade.button.ButtonManager;
import nc.ui.trade.controller.IControllerBase;
import nc.ui.trade.handler.EventHandler;
import nc.ui.trade.pub.*;
import nc.ui.trade.query.INormalQuery;
import nc.vo.bd.CorpVO;
import nc.vo.format.Format;
import nc.vo.jcom.lang.StringUtil;
import nc.vo.pf.pub.BusitypeVO;
import nc.vo.pub.*;
import nc.vo.pub.lang.*;
import nc.vo.trade.button.ButtonVO;
import nc.vo.trade.field.IBillField;
import nc.vo.trade.pub.HYBillVO;
import nc.vo.trade.pub.IExAggVO;
import nc.vo.trade.summarize.Hashlize;
import nc.vo.trade.summarize.VOHashPrimaryKeyAdapter;

// Referenced classes of package nc.ui.trade.bill:
//			BusiTypeChangeEvent, IBillBusiListener, RefBillTypeChangeEvent, BillCardPanelWrapper, 
//			ISingleController

public abstract class BillEventHandler extends EventHandler
{

	private static final String staticACTION = "BOACTION";
	private static final String staticASS = "BOASS";
	private IBillBusiListener m_bbl;

	public BillEventHandler(AbstractBillUI billUI, IControllerBase control)
	{
		super(billUI, control);
		m_bbl = null;
	}

	protected void afterOnBoAction(int i, AggregatedValueObject aggregatedvalueobject)
		throws Exception
	{
	}

	protected void afterOnBoAss(ButtonObject buttonobject)
		throws Exception
	{
	}

	protected void beforeOnBoAction(int intBtn, AggregatedValueObject billVo)
		throws Exception
	{
		if (billVo instanceof HYBillVO)
			((HYBillVO)billVo).setM_billField(getBillField());
	}

	protected void beforeOnBoAss(ButtonObject buttonobject)
		throws Exception
	{
	}

	protected void busiTypeBefore(AbstractBillUI abstractbillui, ButtonObject buttonobject)
		throws Exception
	{
	}

	private void clearChildPk(CircularlyAccessibleValueObject vos[])
		throws Exception
	{
		if (vos == null || vos.length == 0)
			return;
		for (int i = 0; i < vos.length; i++)
			vos[i].setPrimaryKey(null);

	}

	private void complexOnButton(int intBtn, ButtonObject bo)
		throws Exception
	{
		switch (intBtn)
		{
		case 2: // '\002'
			getBillUI().showHintMessage(NCLangRes.getInstance().getStrByID("uifactory", "UPPuifactory-000060"));
			onBoBusiType(bo);
			break;

		case 1: // '\001'
			getBillUI().showHintMessage(NCLangRes.getInstance().getStrByID("uifactory", "UPPuifactory-000061"));
			onBoBusiTypeAdd(bo, null);
			break;

		case 25: // '\031'
			onBoAction(bo);
			break;

		case 29: // '\035'
			getBillUI().showHintMessage(NCLangRes.getInstance().getStrByID("uifactory", "UPPuifactory-000062"));
			onBoAss(bo);
			break;

		case 10: // '\n'
			onBoLine(bo);
			break;

		case 16: // '\020'
			onBoFile(bo);
			// fall through

		case 20: // '\024'
			onBoBrow(bo);
			break;

		case 33: // '!'
			onBoNodekey(bo);
			break;

		case 9: // '\t'
			ButtonVO btnVo = (ButtonVO)bo.getData();
			onBoElse(btnVo.getBtnNo());
			break;

		default:
			if (bo.getData() != null && (bo.getData() instanceof ButtonVO))
			{
				ButtonVO btnVo2 = (ButtonVO)bo.getData();
				onBoElse(btnVo2.getBtnNo());
			}
			break;
		}
	}

	protected IBusinessController createBusinessAction()
	{
		switch (getUIController().getBusinessActionType())
		{
		case 0: // '\0'
			return new BusinessAction(getBillUI());

		case 1: // '\001'
			return new BdBusinessAction(getBillUI());
		}
		return new BusinessAction(getBillUI());
	}

	protected abstract BillCardPanelWrapper getBillCardPanelWrapper();

	protected final BusinessDelegator getBusiDelegator()
	{
		return getBillUI().getBusiDelegator();
	}

	public final void initActionButton()
	{
		try
		{
			ButtonObject boAction = getButtonManager().getButton(25);
			if (getBillUI().isBusinessType().booleanValue())
			{
				ButtonObject boBusitype = getButtonManager().getButton(2);
				ButtonObject boAdd = getButtonManager().getButton(1);
				ButtonObject boSelectBusitype = null;
				if (boBusitype != null)
				{
					getBusiDelegator().retBusinessBtn(boBusitype, _getCorp().getPrimaryKey(), getUIController().getBillType());
					if (boBusitype.getChildButtonGroup() != null && boBusitype.getChildButtonGroup().length > 0)
					{
						boBusitype.getChildButtonGroup()[0].setSelected(true);
						boBusitype.setCheckboxGroup(true);
						ButtonObject bo = boBusitype.getChildButtonGroup()[0];
						BusitypeVO vo = (BusitypeVO)bo.getData();
						getBillUI().setBusinessType(vo.getPrimaryKey());
						getBillUI().setBusicode(vo.getBusicode());
						boSelectBusitype = boBusitype.getChildButtonGroup()[0];
						if (boAction != null)
							getBusiDelegator().retElseBtn(boAction, getUIController().getBillType(), "BOACTION");
						initAssButton(boSelectBusitype);
					}
				}
				if (boAdd != null)
					getBusiDelegator().retAddBtn(boAdd, _getCorp().getPrimaryKey(), getUIController().getBillType(), boSelectBusitype);
			} else
			if (boAction != null)
				getBusiDelegator().retElseBtn(boAction, getUIController().getBillType(), "BOACTION");
			if (boAction != null)
				getButtonManager().setActionButtonVO(getBillUI().isSaveAndCommitTogether());
		}
		catch (Exception ex)
		{
			Logger.error(ex.getMessage(), ex);
			getBillUI().showHintMessage(NCLangRes.getInstance().getStrByID("uifactory", "UPPuifactory-000063"));
		}
	}

	private void initAssButton(ButtonObject bo)
		throws Exception
	{
		ButtonObject boAss = getButtonManager().getButton(29);
		if (boAss == null)
		{
			return;
		} else
		{
			getBusiDelegator().retElseBtn(boAss, getUIController().getBillType(), "BOASS");
			return;
		}
	}

	public boolean isAdding()
	{
		return getBillUI().getBillOperate() == 1 || getBillUI().getBillOperate() == 3;
	}

	public boolean isEditing()
	{
		return getBillUI().getBillOperate() == 0;
	}

	public void onBillRef()
		throws Exception
	{
		ButtonObject btn = getButtonManager().getButton(9);
		btn.setTag((new StringBuilder(String.valueOf(getBillUI().getRefBillType()))).append(":").toString());
		onBoBusiTypeAdd(btn, null);
	}

	private final void onBoAction(ButtonObject bo)
		throws Exception
	{
		ButtonVO btnVo = (ButtonVO)bo.getData();
		if (btnVo == null)
			return;
		switch (btnVo.getBtnNo())
		{
		case 26: // '\032'
			onBoAudit();
			break;

		case 27: // '\033'
			onBoCancelAudit();
			break;

		case 28: // '\034'
			onBoCommit();
			break;

		case 4: // '\004'
			onBoDel();
			break;

		default:
			onBoActionElse(bo);
			break;
		}
	}

	public void onBoActionElse(ButtonObject bo)
		throws Exception
	{
		AggregatedValueObject modelVo = getBufferData().getCurrentVOClone();
		int intBtn = 0;
		if (bo.getData() != null)
			intBtn = ((ButtonVO)bo.getData()).getBtnNo();
		beforeOnBoAction(intBtn, modelVo);
		Object retObj = getBusinessAction().processAction(bo.getTag(), modelVo, getUIController().getBillType(), getBillUI()._getDate().toString(), getBillUI().getUserObject());
		if (PfUtilClient.isSuccess())
		{
			if (retObj instanceof AggregatedValueObject)
			{
				AggregatedValueObject retVo = (AggregatedValueObject)retObj;
				afterOnBoAction(intBtn, retVo);
				CircularlyAccessibleValueObject childVos[] = getChildVO(retVo);
				if (childVos == null)
					modelVo.setParentVO(retVo.getParentVO());
				else
					modelVo = retVo;
			}
			getBufferData().setVOAt(getBufferData().getCurrentRow(), modelVo);
			getBufferData().setCurrentRow(getBufferData().getCurrentRow());
		}
	}

	public void onBoAdd(ButtonObject bo)
		throws Exception
	{
		getBillUI().setBillOperate(1);
	}

	private final void onBoAss(ButtonObject bo)
		throws Exception
	{
		beforeOnBoAss(bo);
		AggregatedValueObject modelVo = getBufferData().getCurrentVO();
		if (modelVo != null)
		{
			Object ret = getBusinessAction().processAction(bo.getTag(), modelVo, getUIController().getBillType(), getBillUI()._getDate().toString(), getBillUI().getUserObject());
			if (ret != null && (ret instanceof AggregatedValueObject))
			{
				AggregatedValueObject vo = (AggregatedValueObject)ret;
				modelVo.getParentVO().setAttributeValue(getBillField().getField_BillStatus(), vo.getParentVO().getAttributeValue(getBillField().getField_BillStatus()));
				modelVo.getParentVO().setAttributeValue("ts", vo.getParentVO().getAttributeValue("ts"));
				getBufferData().setVOAt(getBufferData().getCurrentRow(), modelVo);
				getBufferData().setCurrentRow(getBufferData().getCurrentRow());
			}
			afterOnBoAss(bo);
		}
	}

	protected void onBoAssign()
		throws Exception
	{
	}

	public void onBoAudit()
		throws Exception
	{
		AggregatedValueObject modelVo = getBufferData().getCurrentVOClone();
		setCheckManAndDate(modelVo);
		if (checkVOStatus(modelVo, new int[] {
	1
}))
		{
			Logger.error("无效的鼠标处理机制");
			return;
		}
		beforeOnBoAction(26, modelVo);
		AggregatedValueObject retVo = getBusinessAction().approve(modelVo, getUIController().getBillType(), getBillUI()._getDate().toString(), getBillUI().getUserObject());
		if (PfUtilClient.isSuccess())
		{
			afterOnBoAction(26, retVo);
			CircularlyAccessibleValueObject childVos[] = getChildVO(retVo);
			if (childVos == null)
				modelVo.setParentVO(retVo.getParentVO());
			else
				modelVo = retVo;
			getBufferData().setVOAt(getBufferData().getCurrentRow(), modelVo);
			getBufferData().setCurrentRow(getBufferData().getCurrentRow());
		}
	}

	protected void onBoBodyQuery()
		throws Exception
	{
		StringBuffer strWhere = new StringBuffer();
		if (!askForBodyQueryCondition(strWhere))
		{
			return;
		} else
		{
			doBodyQuery(strWhere.toString());
			return;
		}
	}

	protected void doBodyQuery(String strWhere)
		throws Exception, ClassNotFoundException, InstantiationException, IllegalAccessException
	{
		SuperVO queryVos[] = getBusiDelegator().queryByCondition(Class.forName(getUIController().getBillVoName()[2]), strWhere != null ? strWhere : "");
		getBufferData().clear();
		AggregatedValueObject vo = (AggregatedValueObject)Class.forName(getUIController().getBillVoName()[0]).newInstance();
		vo.setChildrenVO(queryVos);
		getBufferData().addVOToBuffer(vo);
		updateBuffer();
	}

	protected boolean askForBodyQueryCondition(StringBuffer sqlWhereBuf)
		throws Exception
	{
		if (sqlWhereBuf == null)
			throw new IllegalArgumentException("askForQueryCondition().sqlWhereBuf cann't be null");
		UIDialog querydialog = getQueryUI();
		if (querydialog.showModal() != 1)
			return false;
		INormalQuery query = (INormalQuery)querydialog;
		String strWhere = query.getWhereSql();
		if (strWhere == null)
			strWhere = "1=1";
		strWhere = (new StringBuilder("(")).append(strWhere).append(") and (isnull(dr,0)=0)").toString();
		if (getUIController().getBodyCondition() != null)
			strWhere = (new StringBuilder(String.valueOf(strWhere))).append(" and ").append(getUIController().getBodyCondition()).toString();
		sqlWhereBuf.append(strWhere);
		return true;
	}

	private void onBoBrow(ButtonObject bo)
		throws Exception
	{
		int intBtn = Integer.parseInt(bo.getTag());
		buttonActionBefore(getBillUI(), intBtn);
		switch (intBtn)
		{
		case 21: // '\025'
			getBufferData().first();
			break;

		case 23: // '\027'
			getBufferData().prev();
			break;

		case 22: // '\026'
			getBufferData().next();
			break;

		case 24: // '\030'
			getBufferData().last();
			break;
		}
		buttonActionAfter(getBillUI(), intBtn);
		getBillUI().showHintMessage(NCLangRes.getInstance().getStrByID("uifactory", "UPPuifactory-000503", null, new String[] {
			Format.indexFormat(getBufferData().getCurrentRow() + 1)
		}));
	}

	private final void onBoBusiType(ButtonObject bo)
		throws Exception
	{
		busiTypeBefore(getBillUI(), bo);
		bo.setSelected(true);
		BusitypeVO vo = (BusitypeVO)bo.getData();
		getBusiDelegator().retAddBtn(getButtonManager().getButton(1), _getCorp().getPrimaryKey(), getUIController().getBillType(), bo);
		getBusiDelegator().retElseBtn(getButtonManager().getButton(25), getUIController().getBillType(), "BOACTION");
		getButtonManager().setActionButtonVO(getBillUI().isSaveAndCommitTogether());
		String oldtype = getBillUI().getBusinessType();
		String newtype = vo.getPrimaryKey();
		String oldcode = getBillUI().getBusicode();
		String newcode = vo.getBusicode();
		getBillUI().setBusinessType(newtype);
		getBillUI().setBusicode(newcode);
		getBillUI().initUI();
		getBillUI().getBufferData().clear();
		getBillUI().getBufferData().setCurrentRow(-1);
		getBillUI().updateButtonUI();
		if (m_bbl != null)
		{
			BusiTypeChangeEvent e = new BusiTypeChangeEvent(this, oldtype, newtype, oldcode, newcode);
			m_bbl.busiTypeChange(e);
		}
	}

	public final void onBoRefAdd(String strRefBillType, String sourceBillId)
		throws Exception
	{
		onBoBusiTypeAdd(getBusiDelegator().getRefButton(getButtonManager().getButton(1), strRefBillType), sourceBillId);
	}

	private final void onBoBusiTypeAdd(ButtonObject bo, String sourceBillId)
		throws Exception
	{
		getBusiDelegator().childButtonClicked(bo, _getCorp().getPrimaryKey(), getBillUI()._getModuleCode(), _getOperator(), getUIController().getBillType(), getBillUI(), getBillUI().getUserObject(), sourceBillId);
		if (PfUtilClient.makeFlag)
		{
			getBillUI().setCardUIState();
			getBillUI().setBillOperate(1);
		} else
		if (PfUtilClient.isCloseOK())
		{
			if (m_bbl != null)
			{
				String tmpString = bo.getTag();
				int findIndex = tmpString.indexOf(":");
				String newtype = tmpString.substring(0, findIndex);
				RefBillTypeChangeEvent e = new RefBillTypeChangeEvent(this, null, newtype);
				m_bbl.refBillTypeChange(e);
			}
			if (isDataChange())
				setRefData(PfUtilClient.getRetVos());
			else
				setRefData(PfUtilClient.getRetOldVos());
		}
	}

	protected void onBoCancel()
		throws Exception
	{
		if (getBufferData().isVOBufferEmpty())
		{
			getBillUI().setBillOperate(4);
		} else
		{
			getBillUI().setBillOperate(2);
			if (getBufferData().getCurrentRow() == -1)
				getBufferData().setCurrentRow(0);
			else
				getBufferData().setCurrentRow(getBufferData().getCurrentRow());
		}
	}

	protected void onBoCancelAudit()
		throws Exception
	{
		AggregatedValueObject modelVo = getBufferData().getCurrentVOClone();
		setCheckManAndDate(modelVo);
		if (checkVOStatus(modelVo, new int[] {
	8
}))
		{
			Logger.error("无效的鼠标处理机制");
			return;
		}
		beforeOnBoAction(27, modelVo);
		AggregatedValueObject retVo = getBusinessAction().unapprove(modelVo, getUIController().getBillType(), getBillUI()._getDate().toString(), getBillUI().getUserObject());
		if (PfUtilClient.isSuccess())
		{
			afterOnBoAction(27, retVo);
			CircularlyAccessibleValueObject childVos[] = getChildVO(retVo);
			if (childVos == null)
				modelVo.setParentVO(retVo.getParentVO());
			else
				modelVo = retVo;
			Integer intState = (Integer)modelVo.getParentVO().getAttributeValue(getBillField().getField_BillStatus());
			if (intState.intValue() == 8)
			{
				modelVo.getParentVO().setAttributeValue(getBillField().getField_CheckMan(), null);
				modelVo.getParentVO().setAttributeValue(getBillField().getField_CheckDate(), null);
			}
			getBufferData().setVOAt(getBufferData().getCurrentRow(), modelVo);
			getBufferData().setCurrentRow(getBufferData().getCurrentRow());
		}
	}

	protected void onBoCard()
		throws Exception
	{
	}

	protected void onBoCommit()
		throws Exception
	{
		AggregatedValueObject modelVo = getBufferData().getCurrentVOClone();
		modelVo.getParentVO().setAttributeValue(getBillField().getField_Operator(), getBillUI()._getOperator());
		beforeOnBoAction(28, modelVo);
		String strTime = ClientEnvironment.getServerTime().toString();
		ArrayList retList = getBusinessAction().commit(modelVo, getUIController().getBillType(), (new StringBuilder(String.valueOf(getBillUI()._getDate().toString()))).append(strTime.substring(10)).toString(), getBillUI().getUserObject());
		if (PfUtilClient.isSuccess())
		{
			Object o = retList.get(1);
			if (o instanceof AggregatedValueObject)
			{
				AggregatedValueObject retVo = (AggregatedValueObject)o;
				afterOnBoAction(28, retVo);
				CircularlyAccessibleValueObject childVos[] = getChildVO(retVo);
				if (childVos == null)
					modelVo.setParentVO(retVo.getParentVO());
				else
					modelVo = retVo;
			}
			getBufferData().setVOAt(getBufferData().getCurrentRow(), modelVo);
			getBufferData().setCurrentRow(getBufferData().getCurrentRow());
		}
	}

	protected void onBoCopy()
		throws Exception
	{
		AggregatedValueObject copyVo = getBufferData().getCurrentVOClone();
		copyVo.getParentVO().setPrimaryKey(null);
		if (copyVo instanceof IExAggVO)
			clearChildPk(((IExAggVO)copyVo).getAllChildrenVO());
		else
			clearChildPk(copyVo.getChildrenVO());
		getBillUI().setBillOperate(1);
		String noField = getBillUI().getBillField().getField_BillNo();
		BillItem noitem = getBillCardPanelWrapper().getBillCardPanel().getHeadItem(noField);
		if (noitem != null)
			copyVo.getParentVO().setAttributeValue(noField, noitem.getValueObject());
		getBillUI().setCardUIData(copyVo);
	}

	protected void onBoDel()
		throws Exception
	{
		AggregatedValueObject modelVo = getBufferData().getCurrentVO();
		if (modelVo instanceof HYBillVO)
			((HYBillVO)modelVo).setM_billField(getBillField());
		AggregatedValueObject delVo = getBusinessAction().delete(modelVo, getUIController().getBillType(), getBillUI()._getDate().toString(), getBillUI().getUserObject());
		if (PfUtilClient.isSuccess())
		{
			getBillUI().setBillOperate(2);
			modelVo.getParentVO().setAttributeValue(getBillField().getField_BillStatus(), new Integer(4));
			modelVo.getParentVO().setAttributeValue("ts", delVo.getParentVO().getAttributeValue("ts"));
			getBufferData().setVOAt(getBufferData().getCurrentRow(), modelVo);
			getBufferData().setCurrentRow(getBufferData().getCurrentRow());
		}
	}

	protected void onBoDelete()
		throws Exception
	{
		if (getBufferData().getCurrentVO() == null)
			return;
		if (MessageDialog.showOkCancelDlg(getBillUI(), NCLangRes.getInstance().getStrByID("uifactory", "UPPuifactory-000064"), NCLangRes.getInstance().getStrByID("uifactory", "UPPuifactory-000065"), 2) != 1)
			return;
		AggregatedValueObject modelVo = getBufferData().getCurrentVO();
		getBusinessAction().delete(modelVo, getUIController().getBillType(), getBillUI()._getDate().toString(), getBillUI().getUserObject());
		if (PfUtilClient.isSuccess())
		{
			getBillUI().removeListHeadData(getBufferData().getCurrentRow());
			if (getUIController() instanceof ISingleController)
			{
				ISingleController sctl = (ISingleController)getUIController();
				if (!sctl.isSingleDetail())
					getBufferData().removeCurrentRow();
			} else
			{
				getBufferData().removeCurrentRow();
			}
		}
		if (getBufferData().getVOBufferSize() == 0)
			getBillUI().setBillOperate(4);
		else
			getBillUI().setBillOperate(2);
		getBufferData().setCurrentRow(getBufferData().getCurrentRow());
	}

	protected void onBoEdit()
		throws Exception
	{
		if (getBufferData().getCurrentVO() == null)
			return;
		String strTime = getBillUI()._getServerTime().toString();
		AggregatedValueObject modelVo = getBufferData().getCurrentVO();
		Object o = getBusinessAction().edit(modelVo, getUIController().getBillType(), (new StringBuilder(String.valueOf(getBillUI()._getDate().toString()))).append(strTime.substring(10)).toString(), null);
		if (o instanceof AggregatedValueObject)
		{
			AggregatedValueObject retVo = (AggregatedValueObject)o;
			if (retVo.getChildrenVO() == null)
				modelVo.setParentVO(retVo.getParentVO());
			else
				modelVo = retVo;
			getBufferData().setVOAt(getBufferData().getCurrentRow(), modelVo);
			getBufferData().setCurrentRow(getBufferData().getCurrentRow());
		}
		getBillUI().setBillOperate(0);
	}

	protected void onBoElse(int i)
		throws Exception
	{
	}

	private void onBoLine(ButtonObject bo)
		throws Exception
	{
		int intBtn = -1;
		if (bo.getData() != null && (bo.getData() instanceof ButtonVO))
		{
			ButtonVO btnVo2 = (ButtonVO)bo.getData();
			intBtn = btnVo2.getBtnNo();
		} else
		{
			intBtn = Integer.parseInt(bo.getTag());
		}
		buttonActionBefore(getBillUI(), intBtn);
		getBillUI().showHintMessage(bo.getName());
		switch (intBtn)
		{
		case 11: // '\013'
			onBoLineAdd();
			break;

		case 12: // '\f'
			onBoLineDel();
			break;

		case 13: // '\r'
			onBoLineCopy();
			break;

		case 15: // '\017'
			onBoLineIns();
			break;

		case 14: // '\016'
			onBoLinePaste();
			break;

		case 54: // '6'
			onBoLinePasteToTail();
			break;

		default:
			onBoElse(intBtn);
			break;
		}
		buttonActionAfter(getBillUI(), intBtn);
	}

	protected void onBoLineAdd()
		throws Exception
	{
		getBillCardPanelWrapper().addLine();
		postProcessOfAddNewLine();
	}

	protected void postProcessOfAddNewLine()
	{
		try
		{
			CircularlyAccessibleValueObject vo = processNewBodyVO(getBillCardPanelWrapper().getSelectedBodyVOs()[0]);
			int row = getBillCardPanelWrapper().getBillCardPanel().getBillTable().getSelectedRow();
			if (row == -1)
				row = getBillCardPanelWrapper().getBillCardPanel().getBillModel().getRowCount() - 1;
			if (row < 0)
				throw new RuntimeException("cann't get selected row");
			if (vo != null)
				getBillCardPanelWrapper().getBillCardPanel().getBillModel().setBodyRowVO(vo, row);
		}
		catch (NullPointerException e)
		{
			Logger.error("错误：增行或删行后没有获取到被选择的VO");
			Logger.error(e.getMessage(), e);
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			Logger.error("错误：增行或删行后没有获取到被选择的VO");
			Logger.error(e.getMessage(), e);
		}
	}

	protected void onBoLineCopy()
		throws Exception
	{
		getBillCardPanelWrapper().copySelectedLines();
	}

	protected void onBoLineDel()
		throws Exception
	{
		getBillCardPanelWrapper().deleteSelectedLines();
	}

	protected void onBoLineIns()
		throws Exception
	{
		getBillCardPanelWrapper().insertLine();
		if (getBillCardPanelWrapper().getBillCardPanel().getRowCount() > 0)
			postProcessOfAddNewLine();
	}

	protected CircularlyAccessibleValueObject processNewBodyVO(CircularlyAccessibleValueObject newBodyVO)
	{
		return newBodyVO;
	}

	protected void onBoLinePaste()
		throws Exception
	{
		processCopyedBodyVOsBeforePaste(getBillCardPanelWrapper().getCopyedBodyVOs());
		getBillCardPanelWrapper().pasteLines();
	}

	protected void onBoLinePasteToTail()
		throws Exception
	{
		processCopyedBodyVOsBeforePaste(getBillCardPanelWrapper().getCopyedBodyVOs());
		getBillCardPanelWrapper().pasteLinesToTail();
	}

	protected void onBoPrint()
		throws Exception
	{
//		nc.ui.pub.print.IDataSource dataSource = new CardPanelPRTS(getBillUI()._getModuleCode(), getBillCardPanelWrapper().getBillCardPanel());
//		PrintEntry print = new PrintEntry(null);
//		print.setTemplateID(getBillUI()._getCorp().getPrimaryKey(), getBillUI()._getModuleCode(), getBillUI()._getOperator(), getBillUI().getBusinessType(), getBillUI().getNodeKey());
//		if (print.selectTemplate() == 1) {
//			print.setDataSource(dataSource);
//			print.preview();
//		}
		
		nc.ui.pub.print.IDataSource dataSource = new CardPanelPRTS(getBillUI()._getModuleCode(), getBillCardPanelWrapper().getBillCardPanel());
		PrintEntry print = new PrintEntry(null, dataSource);
		print.setTemplateID(getBillUI()._getCorp().getPrimaryKey(), getBillUI()._getModuleCode(), getBillUI()._getOperator(), getBillUI().getBusinessType(), getBillUI().getNodeKey());
		if (print.selectTemplate() == 1)
			print.preview();
	}

	protected void onBoDirectPrint()
		throws Exception
	{
		BillModel billmodel = getBillCardPanelWrapper().getBillCardPanel().getBillModel();
		if (billmodel == null)
			return;
		if (billmodel instanceof ReportTreeTableModelAdapter)
			((ReportTreeTableModelAdapter)billmodel).setPrinting(true);
		BillDirectPrint print = new BillDirectPrint(getBillCardPanelWrapper().getBillCardPanel(), getBillCardPanelWrapper().getBillCardPanel().getTitle());
		print.onPrint();
		if (billmodel instanceof ReportTreeTableModelAdapter)
			((ReportTreeTableModelAdapter)billmodel).setPrinting(false);
	}

	protected void onBoQuery()
		throws Exception
	{
		StringBuffer strWhere = new StringBuffer();
		if (!askForQueryCondition(strWhere))
		{
			return;
		} else
		{
			SuperVO queryVos[] = queryHeadVOs(strWhere.toString());
			getBufferData().clear();
			addDataToBuffer(queryVos);
			updateBuffer();
			return;
		}
	}

	protected SuperVO[] queryHeadVOs(String strWhere)
		throws Exception, ClassNotFoundException
	{
		SuperVO queryVos[] = getBusiDelegator().queryHeadAllData(Class.forName(getUIController().getBillVoName()[1]), getUIController().getBillType(), strWhere.toString());
		return queryVos;
	}

	protected boolean askForQueryCondition(StringBuffer sqlWhereBuf)
		throws Exception
	{
		if (sqlWhereBuf == null)
			throw new IllegalArgumentException("askForQueryCondition().sqlWhereBuf cann't be null");
		UIDialog querydialog = getQueryUI();
		if (querydialog.showModal() != 1)
			return false;
		INormalQuery query = (INormalQuery)querydialog;
		String strWhere = query.getWhereSql();
		if (strWhere == null || strWhere.trim().length() == 0)
			strWhere = "1=1";
		if (getButtonManager().getButton(2) != null)
			if (getBillIsUseBusiCode().booleanValue())
				strWhere = (new StringBuilder("(")).append(strWhere).append(") and ").append(getBillField().getField_BusiCode()).append("='").append(getBillUI().getBusicode()).append("'").toString();
			else
				strWhere = (new StringBuilder("(")).append(strWhere).append(") and ").append(getBillField().getField_Busitype()).append("='").append(getBillUI().getBusinessType()).append("'").toString();
		strWhere = (new StringBuilder("(")).append(strWhere).append(") and (isnull(dr,0)=0)").toString();
		if (getHeadCondition() != null)
			strWhere = (new StringBuilder(String.valueOf(strWhere))).append(" and ").append(getHeadCondition()).toString();
		sqlWhereBuf.append(strWhere);
		return true;
	}

	protected final void updateBuffer()
		throws Exception
	{
		if (getBufferData().getVOBufferSize() != 0)
		{
			getBillUI().setListHeadData(getBufferData().getAllHeadVOsFromBuffer());
			getBillUI().setBillOperate(2);
			getBufferData().setCurrentRow(0);
		} else
		{
			getBillUI().setListHeadData(null);
			getBillUI().setBillOperate(4);
			getBufferData().setCurrentRow(-1);
			getBillUI().showHintMessage(NCLangRes.getInstance().getStrByID("uifactory", "UPPuifactory-000066"));
		}
	}

	protected void addDataToBuffer(SuperVO queryVos[])
		throws Exception
	{
		if (queryVos == null)
		{
			getBufferData().clear();
			return;
		}
		for (int i = 0; i < queryVos.length; i++)
		{
			AggregatedValueObject aVo = (AggregatedValueObject)Class.forName(getUIController().getBillVoName()[0]).newInstance();
			aVo.setParentVO(queryVos[i]);
			getBufferData().addVOToBuffer(aVo);
		}

	}

	protected void onBoRefresh()
		throws Exception
	{
		try
		{
			getBufferData().refresh();
		}
		catch (RecordNotFoundExcetption e)
		{
			if (getBillUI().showYesNoMessage(NCLangRes.getInstance().getStrByID("uifactory", "UPPuifactory-000185")) != 4)
				getBufferData().removeCurrentRow();
		}
	}

	protected void onBoReturn()
		throws Exception
	{
	}

	protected void onBoSave()
		throws Exception
	{
		AggregatedValueObject billVO = getBillUI().getChangedVOFromUI();
		setTSFormBufferToVO(billVO);
		AggregatedValueObject checkVO = getBillUI().getVOFromUI();
		setTSFormBufferToVO(checkVO);
		Object o = null;
		ISingleController sCtrl = null;
		if (getUIController() instanceof ISingleController)
		{
			sCtrl = (ISingleController)getUIController();
			if (sCtrl.isSingleDetail())
			{
				o = billVO.getParentVO();
				billVO.setParentVO(null);
			} else
			{
				o = billVO.getChildrenVO();
				billVO.setChildrenVO(null);
			}
		}
		boolean isSave = true;
		if (billVO.getParentVO() == null && (billVO.getChildrenVO() == null || billVO.getChildrenVO().length == 0))
			isSave = false;
		else
		if (getBillUI().isSaveAndCommitTogether())
			billVO = getBusinessAction().saveAndCommit(billVO, getUIController().getBillType(), _getDate().toString(), getBillUI().getUserObject(), checkVO);
		else
			billVO = getBusinessAction().save(billVO, getUIController().getBillType(), _getDate().toString(), getBillUI().getUserObject(), checkVO);
		if (sCtrl != null && sCtrl.isSingleDetail())
			billVO.setParentVO((CircularlyAccessibleValueObject)o);
		int nCurrentRow = -1;
		if (isSave)
			if (isEditing())
			{
				if (getBufferData().isVOBufferEmpty())
				{
					getBufferData().addVOToBuffer(billVO);
					nCurrentRow = 0;
				} else
				{
					getBufferData().setCurrentVO(billVO);
					nCurrentRow = getBufferData().getCurrentRow();
				}
			} else
			{
				getBufferData().addVOsToBuffer(new AggregatedValueObject[] {
					billVO
				});
				nCurrentRow = getBufferData().getVOBufferSize() - 1;
			}
		if (nCurrentRow >= 0)
			getBufferData().setCurrentRow(nCurrentRow);
		setAddNewOperate(isAdding(), billVO);
		setSaveOperateState();
	}

	protected void onBusinessException(BusinessException e)
	{
		MessageDialog.showErrorDlg(getBillUI(), null, e.getMessage());
		Logger.error(e.getMessage(), e);
	}

	public void onButton(ButtonObject bo)
	{
		if ((getBillUI().getBillOperate() == 1 || getBillUI().getBillOperate() == 0) && getBillCardPanelWrapper() != null)
			getBillCardPanelWrapper().getBillCardPanel().stopEditing();
		try
		{
			ButtonObject parentBtn = bo.getParent();
			if (parentBtn != null && Integer.parseInt(parentBtn.getTag()) < 100)
			{
				int intParentBtn = Integer.parseInt(parentBtn.getTag());
				complexOnButton(intParentBtn, bo);
			} else
			{
				if (bo.getTag() == null)
					Logger.error("新增按钮必须设置TAG,TAG>100的整数.....");
				int intBtn = Integer.parseInt(bo.getTag());
				if (intBtn > 100)
					onBoElse(intBtn);
				else
					simpleOnButton(intBtn, bo);
			}
		}
		catch (BusinessException ex)
		{
			onBusinessException(ex);
		}
		catch (SQLException ex)
		{
			getBillUI().showErrorMessage(ex.getMessage());
		}
		catch (Exception e)
		{
			getBillUI().showErrorMessage(e.getMessage());
			Logger.error(e.getMessage(), e);
		}
	}

	protected AggregatedValueObject[] onSplitBillVos(AggregatedValueObject refVos[])
		throws Exception
	{
		return null;
	}

	protected void processCopyedBodyVOsBeforePaste(CircularlyAccessibleValueObject vos[])
	{
		if (vos == null)
			return;
		for (int i = 0; i < vos.length; i++)
		{
			vos[i].setAttributeValue(getUIController().getPkField(), null);
			vos[i].setAttributeValue(getUIController().getChildPkField(), null);
		}

	}

	protected AggregatedValueObject refVOChange(AggregatedValueObject vos[])
		throws Exception
	{
		return vos[0];
	}

	private void setCheckManAndDate(AggregatedValueObject vo)
		throws Exception
	{
		vo.getParentVO().setAttributeValue(getBillField().getField_CheckDate(), getBillUI()._getDate());
		vo.getParentVO().setAttributeValue(getBillField().getField_CheckMan(), getBillUI()._getOperator());
	}

	private void simpleOnButton(int intBtn, ButtonObject bo)
		throws Exception
	{
		buttonActionBefore(getBillUI(), intBtn);
		switch (intBtn)
		{
		case 1: // '\001'
			if (!getBillUI().isBusinessType().booleanValue())
			{
				getBillUI().showHintMessage(NCLangRes.getInstance().getStrByID("uifactory", "UPPuifactory-000061"));
				onBoAdd(bo);
				buttonActionAfter(getBillUI(), intBtn);
			}
			break;

		case 3: // '\003'
			getBillUI().showHintMessage(NCLangRes.getInstance().getStrByID("uifactory", "UPPuifactory-000067"));
			onBoEdit();
			buttonActionAfter(getBillUI(), intBtn);
			break;

		case 4: // '\004'
			getBillUI().showHintMessage(NCLangRes.getInstance().getStrByID("uifactory", "UPPuifactory-000068"));
			onBoDel();
			buttonActionAfter(getBillUI(), intBtn);
			getBillUI().showHintMessage(NCLangRes.getInstance().getStrByID("uifactory", "UPPuifactory-000069"));
			break;

		case 32: // ' '
			getBillUI().showHintMessage(NCLangRes.getInstance().getStrByID("uifactory", "UPPuifactory-000070"));
			onBoDelete();
			buttonActionAfter(getBillUI(), intBtn);
			getBillUI().showHintMessage(NCLangRes.getInstance().getStrByID("uifactory", "UPPuifactory-000071"));
			break;

		case 5: // '\005'
			getBillUI().showHintMessage(bo.getName());
			if (super.getUIController() instanceof ISingleController)
			{
				ISingleController strl = (ISingleController)super.getUIController();
				if (strl.isSingleDetail())
					onBoBodyQuery();
				else
					onBoQuery();
			} else
			{
				onBoQuery();
			}
			buttonActionAfter(getBillUI(), intBtn);
			break;

		case 0: // '\0'
			getBillUI().showHintMessage(NCLangRes.getInstance().getStrByID("uifactory", "UPPuifactory-000072"));
			onBoSave();
			buttonActionAfter(getBillUI(), intBtn);
			getBillUI().showHintMessage(NCLangRes.getInstance().getStrByID("uifactory", "UPPuifactory-000073"));
			break;

		case 7: // '\007'
			onBoCancel();
			getBillUI().showHintMessage("");
			buttonActionAfter(getBillUI(), intBtn);
			break;

		case 6: // '\006'
			getBillUI().showHintMessage(NCLangRes.getInstance().getStrByID("uifactory", "UPPuifactory-000074"));
			onBoPrint();
			buttonActionAfter(getBillUI(), intBtn);
			getBillUI().showHintMessage(NCLangRes.getInstance().getStrByID("uifactory", "UPPuifactory-000075"));
			break;

		case 50: // '2'
			getBillUI().showHintMessage(NCLangRes.getInstance().getStrByID("uifactory", "UPPuifactory-000074"));
			onBoDirectPrint();
			buttonActionAfter(getBillUI(), intBtn);
			getBillUI().showHintMessage(NCLangRes.getInstance().getStrByID("uifactory", "UPPuifactory-000075"));
			break;

		case 31: // '\037'
			onBoReturn();
			buttonActionAfter(getBillUI(), intBtn);
			break;

		case 30: // '\036'
			onBoCard();
			buttonActionAfter(getBillUI(), intBtn);
			break;

		case 8: // '\b'
			getBillUI().showHintMessage(NCLangRes.getInstance().getStrByID("uifactory", "UPPuifactory-000076"));
			onBoRefresh();
			buttonActionAfter(getBillUI(), intBtn);
			getBillUI().showHintMessage(NCLangRes.getInstance().getStrByID("uifactory", "UPPuifactory-000077"));
			break;

		case 9: // '\t'
			getBillUI().showHintMessage(NCLangRes.getInstance().getStrByID("uifactory", "UPPuifactory-000078"));
			onBillRef();
			buttonActionAfter(getBillUI(), intBtn);
			getBillUI().showHintMessage(NCLangRes.getInstance().getStrByID("uifactory", "UPPuifactory-000079"));
			break;

		case 41: // ')'
			getBillUI().showHintMessage(NCLangRes.getInstance().getStrByID("uifactory", "UPPuifactory-000080"));
			onBoCopy();
			buttonActionAfter(getBillUI(), intBtn);
			getBillUI().showHintMessage(NCLangRes.getInstance().getStrByID("uifactory", "UPPuifactory-000081"));
			break;

		case 26: // '\032'
			onBoAudit();
			break;

		case 27: // '\033'
			onBoCancelAudit();
			break;

		case 28: // '\034'
			onBoCommit();
			break;

		case 35: // '#'
			onBoSelAll();
			break;

		case 36: // '$'
			onBoSelNone();
			break;

		case 51: // '3'
			onBoImport();
			break;

		case 52: // '4'
			onBoExport();
			break;

		case 53: // '5'
			onBoApproveInfo();
			break;

		case 2: // '\002'
		case 10: // '\n'
		case 11: // '\013'
		case 12: // '\f'
		case 13: // '\r'
		case 14: // '\016'
		case 15: // '\017'
		case 16: // '\020'
		case 17: // '\021'
		case 18: // '\022'
		case 19: // '\023'
		case 20: // '\024'
		case 21: // '\025'
		case 22: // '\026'
		case 23: // '\027'
		case 24: // '\030'
		case 25: // '\031'
		case 29: // '\035'
		case 33: // '!'
		case 34: // '"'
		case 37: // '%'
		case 38: // '&'
		case 39: // '\''
		case 40: // '('
		case 42: // '*'
		case 43: // '+'
		case 44: // ','
		case 45: // '-'
		case 46: // '.'
		case 47: // '/'
		case 48: // '0'
		case 49: // '1'
		default:
			onBoActionElse(bo);
			break;
		}
	}

	public void onBoApproveInfo()
		throws Exception
	{
		if (getBufferData().getCurrentVO() == null)
			return;
		String strBilltype = getBillField().getField_Billtype();
		String billType = (String)getBufferData().getCurrentVO().getParentVO().getAttributeValue(strBilltype);
		String billId = getBufferData().getCurrentVO().getParentVO().getPrimaryKey();
		if (StringUtil.isEmptyWithTrim(billType))
			billType = getUIController().getBillType();
		FlowStateDlg dlg = new FlowStateDlg(getBillUI().getParent(), billType, "KHHH0000000000000001", billId);
		dlg.setVisible(true);
	}

	protected void onBoExport()
		throws Exception
	{
	}

	protected void onBoImport()
		throws Exception
	{
	}

	protected void addBillBusiListener(IBillBusiListener bbl)
	{
		m_bbl = bbl;
	}

	protected boolean checkVOStatus(AggregatedValueObject vo, int intStatus[])
		throws Exception
	{
		if (vo == null || vo.getParentVO() == null)
			return true;
		Integer intState = (Integer)vo.getParentVO().getAttributeValue(getBillField().getField_BillStatus());
		if (intState == null)
			throw new BusinessException(NCLangRes.getInstance().getStrByID("uifactory", "UPPuifactory-000082"));
		int intCurrentState = intState.intValue();
		for (int i = 0; i < intStatus.length; i++)
			if (intStatus[i] == intCurrentState)
				return true;

		return false;
	}

	protected IBusinessSplit createBusinessSplit()
	{
		return new DefaultBusinessSplit();
	}

	public UFBoolean getBillIsUseBusiCode()
	{
		return new UFBoolean(false);
	}

	private CircularlyAccessibleValueObject[] getChildVO(AggregatedValueObject retVo)
	{
		CircularlyAccessibleValueObject childVos[] = (CircularlyAccessibleValueObject[])null;
		if (retVo instanceof IExAggVO)
			childVos = ((IExAggVO)retVo).getAllChildrenVO();
		else
			childVos = retVo.getChildrenVO();
		return childVos;
	}

	protected String getHeadCondition()
	{
		if (getBillCardPanelWrapper() != null && getBillCardPanelWrapper().getBillCardPanel().getHeadTailItem(getBillField().getField_Corp()) != null)
			return (new StringBuilder(String.valueOf(getBillField().getField_Corp()))).append("='").append(getBillUI()._getCorp().getPrimaryKey()).append("'").toString();
		else
			return null;
	}

	public final void initNodeKeyButton()
	{
		try
		{
			ButtonObject boNodeKey = getButtonManager().getButton(33);
			if (boNodeKey != null)
				if (boNodeKey.getChildButtonGroup() != null && boNodeKey.getChildButtonGroup().length > 0)
				{
					ButtonObject bo = boNodeKey.getChildButtonGroup()[0];
					bo.setSelected(true);
					getBillUI().setNodeKey(bo.getTag());
				} else
				{
					Logger.error("没有初始化NodeKey类型!");
				}
		}
		catch (Exception ex)
		{
			Logger.error(ex.getMessage(), ex);
			getBillUI().showHintMessage(NCLangRes.getInstance().getStrByID("uifactory", "UPPuifactory-000083"));
		}
	}

	protected boolean isDataChange()
	{
		return true;
	}

	protected void onBillRef(int intBtn, String refBilltype)
		throws Exception
	{
		ButtonObject btn = getButtonManager().getButton(intBtn);
		btn.setTag((new StringBuilder(String.valueOf(refBilltype))).append(":").toString());
		onBoBusiTypeAdd(btn, null);
	}

	private final void onBoNodekey(ButtonObject bo)
		throws Exception
	{
		bo.setSelected(true);
		getBillUI().setNodeKey(bo.getTag());
		getBillUI().initUI();
		setQueryUI(null);
		getBillUI().getBufferData().clear();
		getBillUI().getBufferData().setCurrentRow(-1);
		getBillUI().updateButtonUI();
	}

	protected void onBoSelAll()
		throws Exception
	{
	}

	protected void onBoSelNone()
		throws Exception
	{
	}

	protected void removeBillBusiListener()
	{
		m_bbl = null;
	}

	protected void setAddNewOperate(boolean flag, AggregatedValueObject aggregatedvalueobject)
		throws Exception
	{
	}

	protected void setRefData(AggregatedValueObject vos[])
		throws Exception
	{
		getBillUI().setCardUIState();
		AggregatedValueObject vo = refVOChange(vos);
		if (vo == null)
		{
			throw new BusinessException(NCLangRes.getInstance().getStrByID("uifactory", "UPPuifactory-000084"));
		} else
		{
			getBillUI().setBillOperate(3);
			getBillCardPanelWrapper().setCardData(vo);
			return;
		}
	}

	protected void setSaveOperateState()
		throws Exception
	{
		getBillUI().setBillOperate(2);
	}

	protected void setTSFormBufferToVO(AggregatedValueObject setVo)
		throws Exception
	{
		if (setVo == null)
			return;
		AggregatedValueObject vo = getBufferData().getCurrentVO();
		if (vo == null)
			return;
		if (getBillUI().getBillOperate() == 0)
		{
			if (vo.getParentVO() != null && setVo.getParentVO() != null)
				setVo.getParentVO().setAttributeValue("ts", vo.getParentVO().getAttributeValue("ts"));
			SuperVO changedvos[] = (SuperVO[])getChildVO(setVo);
			if (changedvos != null && changedvos.length != 0)
			{
				HashMap bufferedVOMap = null;
				SuperVO bufferedVOs[] = (SuperVO[])getChildVO(vo);
				if (bufferedVOs != null && bufferedVOs.length != 0)
				{
					bufferedVOMap = Hashlize.hashlizeObjects(bufferedVOs, new VOHashPrimaryKeyAdapter());
					for (int i = 0; i < changedvos.length; i++)
						if (changedvos[i].getPrimaryKey() != null)
						{
							ArrayList bufferedAl = (ArrayList)bufferedVOMap.get(changedvos[i].getPrimaryKey());
							if (bufferedAl != null)
							{
								SuperVO bufferedVO = (SuperVO)bufferedAl.get(0);
								changedvos[i].setAttributeValue("ts", bufferedVO.getAttributeValue("ts"));
							}
						}

				}
			}
		}
	}

	public IBillBusiListener getBillBusiListener()
	{
		return m_bbl;
	}
}