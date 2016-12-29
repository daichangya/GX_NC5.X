package nc.ui.lcsw.sw11;

import nc.ui.lcsw.sw10.SW10ManageEventHandler;
import nc.ui.lcsw.sw11.print.ZZSHBDataSourceNew;
import nc.ui.pub.ClientEnvironment;
import nc.ui.pub.bill.BillItem;
import nc.ui.pub.print.PrintEntry;
import nc.ui.trade.base.IBillOperate;
import nc.ui.trade.business.HYPubBO_Client;
import nc.ui.trade.controller.IControllerBase;
import nc.ui.trade.manage.BillManageUI;
import nc.ui.trade.manage.ManageEventHandler;
import nc.vo.jcom.lang.StringUtil;
import nc.vo.lcsw.sw01.LcswBzxxHVO;
import nc.vo.lcsw.sw04.KcfksjHVO;
import nc.vo.lcsw.sw11.SjfksjBVO;
import nc.vo.lcsw.sw11.SjfksjHVO;
import nc.vo.pub.lang.UFDate;

/**
 * <b>��Ʒ��������¼���</b>
 * @version 1.0
 * @since 1.0
 * @author ��չ��
 * @time 2014-08-14 15:16:25
 */
public class ClientEventHandler extends SW10ManageEventHandler  {

	private ClientUI clientUI; 
	public ClientEventHandler(BillManageUI billUI,IControllerBase control) {
		super(billUI, control);
		this.clientUI = (ClientUI) billUI;
	}

	@Override
	protected void onBoSave() throws Exception {
		clientUI.getBillCardPanel().dataNotNullValidate();
		
		UFDate today = ClientEnvironment.getInstance().getBusinessDate();
		String jtrq =this.clientUI.getBillCardPanel().getHeadItem(SjfksjHVO.ATRQ).getValue();
		String fdrq =this.clientUI.getBillCardPanel().getHeadItem(SjfksjHVO.FDRQ).getValue();
		String qsrq =this.clientUI.getBillCardPanel().getHeadItem(SjfksjHVO.QSRQ).getValue();
		String yqxgrq =this.clientUI.getBillCardPanel().getHeadItem(SjfksjHVO.YQXGRQ).getValue();
		//����У�� [��ͼ����]<=[��ǰ����]��
		if(!StringUtil.isEmptyWithTrim(jtrq) && today.before(new UFDate(jtrq))){
			getBillUI().showErrorMessage("[��ͼ����]���ܴ���[��ǰ����]��");
			return;
		}		
		//���췴����[�������]<=[��ͼ����]
		String pk_jobbasfil = getBillCardPanelWrapper().getBillCardPanel().getHeadItem(SjfksjHVO.PK_JOBBASFIL).getValue();
		KcfksjHVO[] sjhvos = (KcfksjHVO[])HYPubBO_Client.queryByCondition(KcfksjHVO.class," vbillstatus = 1 and pk_jobbasfil = '"+pk_jobbasfil+"' order by ts desc");
		if(!StringUtil.isEmptyWithTrim(jtrq) && sjhvos.length > 0 && sjhvos[0].getDapprovedate().after(new UFDate(jtrq))){
			getBillUI().showErrorMessage("[��ͼ����]����С��[�ƽ��������]��");
			return;
		}
		//[��������]<=[��ǰ����]
		if(!StringUtil.isEmptyWithTrim(fdrq) && today.before(new UFDate(fdrq))){
			getBillUI().showErrorMessage("[��������]���ܴ���[��ǰ����]��");
			return;
		}
		//[��ͼ����]<=[��������]��
		if(!StringUtil.isEmptyWithTrim(fdrq) && !StringUtil.isEmptyWithTrim(jtrq) && new UFDate(fdrq).before(new UFDate(jtrq))){
			getBillUI().showErrorMessage("[��������]����С��[��ͼ����]��");
			return;
		}
		//[ǩ������]<=[��ǰ����]
		if(!StringUtil.isEmptyWithTrim(qsrq) && today.before(new UFDate(qsrq))){
			getBillUI().showErrorMessage("[ǩ������]���ܴ���[��ǰ����]��");
			return;
		}
		//[��ͼ����]<=[ǩ������]��
		if(!StringUtil.isEmptyWithTrim(qsrq) && !StringUtil.isEmptyWithTrim(jtrq) && new UFDate(qsrq).before(new UFDate(jtrq))){
			getBillUI().showErrorMessage("[ǩ������]����С��[��ͼ����]��");
			return;
		}
		//��������<=[��ǰ����]��
		if(yqxgrq != null && !yqxgrq.equals("") &&today.before(new UFDate(yqxgrq))){
			getBillUI().showErrorMessage("[�����޸�����]���ܴ���[��ǰ����]��");
			return;
		}
		
		assignBodyByHead();
		super.onBoSave();
	}

	/**
	 * ���ݱ�ͷ�ֶ�  ����������ͬ���ֶθ�ֵ 
	 */
	private void assignBodyByHead() {
		//��Ŀ
		String pk_jobbasfil=this.clientUI.getBillCardPanel().getHeadItem(SjfksjHVO.PK_JOBBASFIL).getValue();
		if(pk_jobbasfil!=null && pk_jobbasfil.length() > 0)
		{
			int row=this.clientUI.getBillCardPanel().getBillModel().getRowCount();
			for (int i = 0; i < row; i++) {
				if(this.clientUI.getBillCardPanel().getBodyValueAt(i,SjfksjHVO.PK_JOBBASFIL)==null){
					this.clientUI.getBillCardPanel().setBodyValueAt(pk_jobbasfil, i, SjfksjHVO.PK_JOBBASFIL);
				}
			}
		}
		//������Ա
		String jbry=this.clientUI.getBillCardPanel().getHeadItem(SjfksjHVO.JBRY).getValue();
		if(jbry!=null && jbry.length() > 0)
		{
			int row=this.clientUI.getBillCardPanel().getBillModel().getRowCount();
			for (int i = 0; i < row; i++) {
//				if(this.clientUI.getBillCardPanel().getBodyValueAt(i,SjfksjHVO.JBRY)==null){
//					this.clientUI.getBillCardPanel().setBodyValueAt(jbry, i, SjfksjHVO.JBRY);
//				}
				//modify by crf 2015-07-08
				this.clientUI.getBillCardPanel().setBodyValueAt(jbry, i, SjfksjHVO.JBRY);
			}
		}
		//�����Ա
		String sjry=this.clientUI.getBillCardPanel().getHeadItem(SjfksjHVO.SJRY).getValue();
		if(sjry!=null && sjry.length() > 0)
		{
			int row=this.clientUI.getBillCardPanel().getBillModel().getRowCount();
			for (int i = 0; i < row; i++) {
//				if(this.clientUI.getBillCardPanel().getBodyValueAt(i,SjfksjHVO.SJRY)==null){
//					this.clientUI.getBillCardPanel().setBodyValueAt(sjry, i, SjfksjHVO.SJRY);
//				}
				//modify by crf 2015-07-08
				this.clientUI.getBillCardPanel().setBodyValueAt(sjry, i, SjfksjHVO.SJRY);
			}
		}
		//���ͼ��
		String sjth=this.clientUI.getBillCardPanel().getHeadItem(SjfksjHVO.SJTH).getValue();
		if(sjth!=null && sjth.length() > 0)
		{
			int row=this.clientUI.getBillCardPanel().getBillModel().getRowCount();
			for (int i = 0; i < row; i++) {
//				if(this.clientUI.getBillCardPanel().getBodyValueAt(i,SjfksjHVO.SJTH)==null){
//					this.clientUI.getBillCardPanel().setBodyValueAt(sjth, i, SjfksjHVO.SJTH);
//				}
				//modify by crf 2015-07-08
				this.clientUI.getBillCardPanel().setBodyValueAt(sjth, i, SjfksjHVO.SJTH);
			}
		}
		//ǩ������
		String qsrq=this.clientUI.getBillCardPanel().getHeadItem(SjfksjHVO.QSRQ).getValue();
		if(qsrq!=null && qsrq.length() > 0)
		{
			int row=this.clientUI.getBillCardPanel().getBillModel().getRowCount();
			for (int i = 0; i < row; i++) {
//				if(this.clientUI.getBillCardPanel().getBodyValueAt(i,SjfksjHVO.QSRQ)==null){
//					this.clientUI.getBillCardPanel().setBodyValueAt(qsrq, i, SjfksjHVO.QSRQ);
//				}
				//modify by crf 2015-07-08
				this.clientUI.getBillCardPanel().setBodyValueAt(qsrq, i, SjfksjHVO.QSRQ);
			}
		}
		//��������
		String fdrq=this.clientUI.getBillCardPanel().getHeadItem(SjfksjHVO.FDRQ).getValue();
		if(fdrq!=null && fdrq.length() > 0)
		{
			int row=this.clientUI.getBillCardPanel().getBillModel().getRowCount();
			for (int i = 0; i < row; i++) {
//				if(this.clientUI.getBillCardPanel().getBodyValueAt(i,SjfksjHVO.FDRQ)==null){
//					this.clientUI.getBillCardPanel().setBodyValueAt(fdrq, i, SjfksjHVO.FDRQ);
//				}
				//modify by crf 2015-07-08
				this.clientUI.getBillCardPanel().setBodyValueAt(fdrq, i, SjfksjHVO.FDRQ);
			}
		}
		//��ͼ����
		String atrq=this.clientUI.getBillCardPanel().getHeadItem(SjfksjHVO.ATRQ).getValue();
		if(atrq!=null && atrq.length() > 0)
		{
			int row=this.clientUI.getBillCardPanel().getBillModel().getRowCount();
			for (int i = 0; i < row; i++) {
//				if(this.clientUI.getBillCardPanel().getBodyValueAt(i,SjfksjHVO.ATRQ)==null){
//					this.clientUI.getBillCardPanel().setBodyValueAt(atrq, i, SjfksjHVO.ATRQ);
//				}
				//modify by crf 2015-07-08
				this.clientUI.getBillCardPanel().setBodyValueAt(atrq, i, SjfksjHVO.ATRQ);
			}
		}
		//�깤��������
		String wgyqts=this.clientUI.getBillCardPanel().getHeadItem(SjfksjHVO.WGYQTS).getValue();
		if(wgyqts!=null && wgyqts.length() > 0)
		{
			int row=this.clientUI.getBillCardPanel().getBillModel().getRowCount();
			for (int i = 0; i < row; i++) {
//				if(this.clientUI.getBillCardPanel().getBodyValueAt(i,SjfksjHVO.WGYQTS)==null){
//					this.clientUI.getBillCardPanel().setBodyValueAt(wgyqts, i, SjfksjHVO.WGYQTS);
//				}
				//modify by crf 2015-07-08
				this.clientUI.getBillCardPanel().setBodyValueAt(wgyqts, i, SjfksjHVO.WGYQTS);
			}
		}
		//�����޸���
		String yqxgr=this.clientUI.getBillCardPanel().getHeadItem(SjfksjHVO.YQXGR).getValue();
		if(yqxgr!=null && yqxgr.length() > 0)
		{
			int row=this.clientUI.getBillCardPanel().getBillModel().getRowCount();
			for (int i = 0; i < row; i++) {
//				if(this.clientUI.getBillCardPanel().getBodyValueAt(i,SjfksjHVO.YQXGR)==null){
//					this.clientUI.getBillCardPanel().setBodyValueAt(yqxgr, i, SjfksjHVO.YQXGR);
//				}
				//modify by crf 2015-07-08
				this.clientUI.getBillCardPanel().setBodyValueAt(yqxgr, i, SjfksjHVO.YQXGR);
			}
		}
		//�����޸�����
		String yqxgrq=this.clientUI.getBillCardPanel().getHeadItem(SjfksjHVO.YQXGRQ).getValue();
		if(yqxgrq!=null && yqxgrq.length() > 0)
		{
			int row=this.clientUI.getBillCardPanel().getBillModel().getRowCount();
			for (int i = 0; i < row; i++) {
//				if(this.clientUI.getBillCardPanel().getBodyValueAt(i,SjfksjHVO.YQXGRQ)==null){
//					this.clientUI.getBillCardPanel().setBodyValueAt(yqxgrq, i, SjfksjHVO.YQXGRQ);
//				}
				//modify by crf 2015-07-08
				this.clientUI.getBillCardPanel().setBodyValueAt(yqxgrq, i, SjfksjHVO.YQXGRQ);
			}
		}
		//��ע
		String remark=this.clientUI.getBillCardPanel().getHeadItem(SjfksjHVO.REMARK).getValue();
		if(remark!=null && remark.length() > 0)
		{
			int row=this.clientUI.getBillCardPanel().getBillModel().getRowCount();
			for (int i = 0; i < row; i++) {
//				if(this.clientUI.getBillCardPanel().getBodyValueAt(i,SjfksjHVO.REMARK)==null){
//					this.clientUI.getBillCardPanel().setBodyValueAt(remark, i, SjfksjHVO.REMARK);
//				}
				//modify by crf 2015-07-08
				this.clientUI.getBillCardPanel().setBodyValueAt(remark, i, SjfksjHVO.REMARK);
			}
		}
	}
	
	@Override
	protected void onBoQuery() throws Exception {
		super.onBoQuery();
	}
	
	@Override
	protected void onBoEdit() throws Exception {
		super.onBoEdit();
		if (getBillUI().getBillOperate() == IBillOperate.OP_EDIT){
			clientUI.getBillCardPanel().getTailItem(SjfksjHVO.MODIFIER).setValue(ClientEnvironment.getInstance().getUser().getPrimaryKey());
			clientUI.getBillCardPanel().getTailItem(SjfksjHVO.DMODIFY).setValue(ClientEnvironment.getInstance().getDate());
		}
	}
	
	@Override
	protected void onBoPrint() throws Exception {
		
		int row=clientUI.getBillListPanel().getHeadTable().getSelectedRow();
		SjfksjHVO sjfksjvo =(SjfksjHVO) getBufferData().getVOByRowNo(row).getParentVO();
		
		
//		String pk_sjfksjhid = clientUI.getBillCardPanel().getHeadItem("pk_sjfksjhid").getValue();
		String pk_sjfksjhid =sjfksjvo.getPk_sjfksjhid();
		if(pk_sjfksjhid == null) {
			throw new Exception("�Ҳ�����Ӧ����Ʒ������ݵ��������޷���ӡ");
		}
		 
		nc.ui.pub.print.IDataSource dataSource = new ZZSHBDataSourceNew(pk_sjfksjhid);
		PrintEntry print = new PrintEntry(null, dataSource);
		print.setTemplateID(getBillUI()._getCorp().getPrimaryKey(), getBillUI()._getModuleCode(), getBillUI()._getOperator(), getBillUI().getBusinessType(), getBillUI().getNodeKey());
		if (print.selectTemplate() == 1)
			print.preview();
	}
}