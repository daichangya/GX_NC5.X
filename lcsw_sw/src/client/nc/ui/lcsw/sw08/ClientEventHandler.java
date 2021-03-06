package nc.ui.lcsw.sw08;

import nc.ui.lcsw.sw10.SW10ManageEventHandler;
import nc.ui.pub.ClientEnvironment;
import nc.ui.trade.base.IBillOperate;
import nc.ui.trade.controller.IControllerBase;
import nc.ui.trade.manage.BillManageUI;
import nc.ui.trade.manage.ManageEventHandler;
import nc.vo.lcsw.sw04.KcfksjHVO;
import nc.vo.lcsw.sw07.AzxxfkHVO;
import nc.vo.lcsw.sw08.YsfksjBVO;
import nc.vo.lcsw.sw08.YsfksjHVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;

/**
 * <b>验收反馈信息事件类</b>
 * @version 1.0
 * @since 1.0
 * @author xuns
 * @time 2014-08-21 11:55:18
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
//		if(clientUI.getBillCardPanel().getHeadItem("pk_ysfksjhid").getValue() != null
//				&& !clientUI.getBillCardPanel().getHeadItem("pk_ysfksjhid").getValue().equals("")){
//			clientUI.getBillCardPanel().setTailItem("modifier", ClientEnvironment.getInstance().getUser().getPrimaryKey());
//			clientUI.getBillCardPanel().setTailItem("dmodify", ClientEnvironment.getInstance().getDate());
//		}
//		
		if(!checkDate())
			return;
		
		
		assignBodyByHead();
		super.onBoSave();
	}

	/**
	 * [移交表位验收日期]<=[资料反馈日期]<=[当前日期]
	   [移交表位验收日期]<=[验收日期]<=[当前日期]
	 */
	private boolean checkDate() {
		//资料反馈日期
		String zlfkrq = getBillCardPanelWrapper().getBillCardPanel().getHeadItem(YsfksjHVO.ZLFKRQ).getValue();
		//验收日期
		String ysrq = getBillCardPanelWrapper().getBillCardPanel().getHeadItem(YsfksjHVO.YSRQ).getValue();
		//移交表位验收日期
		String yjbwysrq = getBillCardPanelWrapper().getBillCardPanel().getHeadItem(YsfksjHVO.YJBWYSRQ).getValue();
		//当前日期
//		UFDate today = ClientEnvironment.getInstance().getBusinessDate();
		UFDate today = ClientEnvironment.getInstance().getServerTime().getDate();
		
		//[移交表位验收日期]<=[资料反馈日期]
		if(new UFDate(yjbwysrq).after(new UFDate(zlfkrq))){
			getBillUI().showErrorMessage("[资料反馈日期]不能小于[移交表位验收日期]！");
			return false;
		}
		//[资料反馈日期]<=[当前日期]
		if(new UFDate(zlfkrq).after(today)){
			getBillUI().showErrorMessage("[资料反馈日期]不能大于[当前日期]！");
			return false;
		}
		
		//[移交表位验收日期]<=[验收日期]
		if(new UFDate(yjbwysrq).after(new UFDate(ysrq))){
			getBillUI().showErrorMessage("[验收日期]不能小于[移交表位验收日期]！");
			return false;
		}
		
		//[验收日期]<=[当前日期]
		if(new UFDate(ysrq).after(today)){
			getBillUI().showErrorMessage("[验收日期]不能大于[当前日期]！");
			return false;
		}
		return true;
	}
	
	@Override
	protected void onBoQuery() throws Exception {
		super.onBoQuery();
		clientUI.getBillListPanel().getHeadBillModel().sortByColumn("jobcode", true);//排序
	}
	
	@Override
	protected void onBoEdit() throws Exception {
		super.onBoEdit();
		if (getBillUI().getBillOperate() == IBillOperate.OP_EDIT){
			clientUI.getBillCardPanel().getTailItem(YsfksjHVO.MODIFIER).setValue(ClientEnvironment.getInstance().getUser().getPrimaryKey());
			clientUI.getBillCardPanel().getTailItem(YsfksjHVO.DMODIFY).setValue(ClientEnvironment.getInstance().getDate());
		}
	}
	
	/**
	 * 根据表头字段  如空则给表体同名字段赋值 
	 */
	@SuppressWarnings("deprecation")
	private void assignBodyByHead() {
		//项目
		
		String pk_jobbasfil=this.clientUI.getBillCardPanel().getHeadItem(YsfksjHVO.PK_JOBBASFIL).getValue();
		if(pk_jobbasfil!=null && pk_jobbasfil.length() > 0)
		{
			int row=this.clientUI.getBillCardPanel().getBillModel().getRowCount();
			for (int i = 0; i < row; i++) {
				if(this.clientUI.getBillCardPanel().getBodyValueAt(i,YsfksjHVO.PK_JOBBASFIL)==null){
					this.clientUI.getBillCardPanel().setBodyValueAt(pk_jobbasfil, i, YsfksjHVO.PK_JOBBASFIL);
				}
			}
		}
		
		
		
		//装表日期
		String zbrq=this.clientUI.getBillCardPanel().getHeadItem(YsfksjHVO.ZBRQ).getValue();
		if(zbrq!=null && zbrq.length() > 0)
		{
			int row=this.clientUI.getBillCardPanel().getBillModel().getRowCount();
			for (int i = 0; i < row; i++) {
				if(this.clientUI.getBillCardPanel().getBodyValueAt(i,YsfksjHVO.ZBRQ)==null){
					this.clientUI.getBillCardPanel().setBodyValueAt(zbrq, i, YsfksjHVO.ZBRQ);
				}
			}
		}
		//编码
		String bianma=this.clientUI.getBillCardPanel().getHeadItem(YsfksjHVO.BIANMA).getValue();
		if(bianma!=null && bianma.length() > 0)
		{
			int row=this.clientUI.getBillCardPanel().getBillModel().getRowCount();
			for (int i = 0; i < row; i++) {
				if(this.clientUI.getBillCardPanel().getBodyValueAt(i,YsfksjHVO.BIANMA)==null){
					this.clientUI.getBillCardPanel().setBodyValueAt(bianma, i, YsfksjHVO.BIANMA);
				}
			}
		}
		//表别
		String biaobie=this.clientUI.getBillCardPanel().getHeadItem(YsfksjHVO.BIAOBIE).getValue();
		if(biaobie!=null && biaobie.length() > 0)
		{
			int row=this.clientUI.getBillCardPanel().getBillModel().getRowCount();
			for (int i = 0; i < row; i++) {
				if(this.clientUI.getBillCardPanel().getBodyValueAt(i,YsfksjHVO.BIAOBIE)==null){
					this.clientUI.getBillCardPanel().setBodyValueAt(biaobie, i, YsfksjHVO.BIAOBIE);
				}
			}
		}
		//表位
		String biaowei=this.clientUI.getBillCardPanel().getHeadItem(YsfksjHVO.BIAOWEI).getValue();
		if(biaowei!=null && biaowei.length() > 0)
		{
			int row=this.clientUI.getBillCardPanel().getBillModel().getRowCount();
			for (int i = 0; i < row; i++) {
				if(this.clientUI.getBillCardPanel().getBodyValueAt(i,YsfksjHVO.BIAOWEI)==null){
					this.clientUI.getBillCardPanel().setBodyValueAt(biaowei, i, YsfksjHVO.BIAOWEI);
				}
			}
		}
		
		//产地
		String chandi=this.clientUI.getBillCardPanel().getHeadItem(YsfksjHVO.CHANDI).getValue();
		if(chandi!=null && chandi.length() > 0)
		{
			int row=this.clientUI.getBillCardPanel().getBillModel().getRowCount();
			for (int i = 0; i < row; i++) {
				if(this.clientUI.getBillCardPanel().getBodyValueAt(i,YsfksjHVO.CHANDI)==null){
					this.clientUI.getBillCardPanel().setBodyValueAt(chandi, i, YsfksjHVO.CHANDI);
				}
			}
		}
		//备注
		String remark=this.clientUI.getBillCardPanel().getHeadItem(YsfksjHVO.REMARK).getValue();
		if(remark!=null && remark.length() > 0)
		{
			int row=this.clientUI.getBillCardPanel().getBillModel().getRowCount();
			for (int i = 0; i < row; i++) {
				if(this.clientUI.getBillCardPanel().getBodyValueAt(i,YsfksjHVO.REMARK)==null){
					this.clientUI.getBillCardPanel().setBodyValueAt(remark, i, YsfksjHVO.REMARK);
				}
			}
		}
		//完工延期天数
		String wgyqts=this.clientUI.getBillCardPanel().getHeadItem(YsfksjHVO.WGYQTS).getValue();
		if(wgyqts!=null && wgyqts.length() > 0)
		{
			int row=this.clientUI.getBillCardPanel().getBillModel().getRowCount();
			for (int i = 0; i < row; i++) {
				if(this.clientUI.getBillCardPanel().getBodyValueAt(i,YsfksjHVO.WGYQTS)==null){
					this.clientUI.getBillCardPanel().setBodyValueAt(wgyqts, i, YsfksjHVO.WGYQTS);
				}
			}
		}

		//延期修改人
		String yqxgr=this.clientUI.getBillCardPanel().getHeadItem(YsfksjHVO.YQXGR).getValue();
		if(yqxgr!=null && yqxgr.length() > 0)
		{
			int row=this.clientUI.getBillCardPanel().getBillModel().getRowCount();
			for (int i = 0; i < row; i++) {
				if(this.clientUI.getBillCardPanel().getBodyValueAt(i,YsfksjHVO.YQXGR)==null){
					this.clientUI.getBillCardPanel().setBodyValueAt(yqxgr, i, YsfksjHVO.YQXGR);
				}
			}
		}
		//延期修改日期
		String yqxgrq=this.clientUI.getBillCardPanel().getHeadItem(YsfksjHVO.YQXGRQ).getValue();
		if(yqxgrq!=null && yqxgrq.length() > 0)
		{
			int row=this.clientUI.getBillCardPanel().getBillModel().getRowCount();
			for (int i = 0; i < row; i++) {
				if(this.clientUI.getBillCardPanel().getBodyValueAt(i,YsfksjHVO.YQXGRQ)==null){
					this.clientUI.getBillCardPanel().setBodyValueAt(yqxgrq, i, YsfksjHVO.YQXGRQ);
				}
			}
		}
		
		//验收合格标志
		String yshgbz=this.clientUI.getBillCardPanel().getHeadItem(YsfksjHVO.YSHGBZ).getValue();
		UFBoolean bz = new UFBoolean(yshgbz);
		if(yshgbz!=null && yshgbz.length() > 0)
		{
			int row=this.clientUI.getBillCardPanel().getBillModel().getRowCount();
			for (int i = 0; i < row; i++) {
				//modify by crf 2015-06-15
				Boolean body_yshgbz = (Boolean) clientUI.getBillCardPanel().getBodyValueAt(i,YsfksjHVO.YSHGBZ);
				if(body_yshgbz==null || (body_yshgbz == bz.booleanValue())){
					this.clientUI.getBillCardPanel().setBodyValueAt(yshgbz, i, YsfksjHVO.YSHGBZ);
				}
				//----------end------------
			}
		}
		//不合格原因
		String bhgyy=this.clientUI.getBillCardPanel().getHeadItem(YsfksjHVO.BHGYY).getValue();
		if(bhgyy!=null && bhgyy.length() > 0)
		{
			int row=this.clientUI.getBillCardPanel().getBillModel().getRowCount();
			for (int i = 0; i < row; i++) {
				if(this.clientUI.getBillCardPanel().getBodyValueAt(i,YsfksjHVO.BHGYY)==null){
					this.clientUI.getBillCardPanel().setBodyValueAt(bhgyy, i, YsfksjHVO.BHGYY);
				}
			}
		}
		
		//移交整改日期
		String yjzgrq=this.clientUI.getBillCardPanel().getHeadItem(YsfksjHVO.YJZGRQ).getValue();
		if(yjzgrq!=null && yjzgrq.length() > 0)
		{
			int row=this.clientUI.getBillCardPanel().getBillModel().getRowCount();
			for (int i = 0; i < row; i++) {
				if(this.clientUI.getBillCardPanel().getBodyValueAt(i,YsfksjHVO.YJZGRQ)==null){
					this.clientUI.getBillCardPanel().setBodyValueAt(yjzgrq, i, YsfksjHVO.YJZGRQ);
				}
			}
		}
		//出库行度
		String cchd=this.clientUI.getBillCardPanel().getHeadItem(YsfksjHVO.CCHD).getValue();
		if(cchd!=null && cchd.length() > 0)
		{
			int row=this.clientUI.getBillCardPanel().getBillModel().getRowCount();
			for (int i = 0; i < row; i++) {
				if(this.clientUI.getBillCardPanel().getBodyValueAt(i,YsfksjHVO.CCHD)==null){
					this.clientUI.getBillCardPanel().setBodyValueAt(cchd, i, YsfksjHVO.CCHD);
				}
			}
		}
		//验收行度
		String ysxd=this.clientUI.getBillCardPanel().getHeadItem(YsfksjHVO.YSXD).getValue();
		if(ysxd!=null && ysxd.length() > 0)
		{
			int row=this.clientUI.getBillCardPanel().getBillModel().getRowCount();
			for (int i = 0; i < row; i++) {
				if(this.clientUI.getBillCardPanel().getBodyValueAt(i,YsfksjHVO.YSXD)==null){
					this.clientUI.getBillCardPanel().setBodyValueAt(ysxd, i, YsfksjHVO.YSXD);
				}
			}
		}
		
		//验收员
		String ysy=this.clientUI.getBillCardPanel().getHeadItem(YsfksjHVO.YSY).getValue();
		if(ysy!=null && ysy.length() > 0)
		{
			int row=this.clientUI.getBillCardPanel().getBillModel().getRowCount();
			for (int i = 0; i < row; i++) {
				if(this.clientUI.getBillCardPanel().getBodyValueAt(i,YsfksjHVO.YSY)==null){
					this.clientUI.getBillCardPanel().setBodyValueAt(ysy, i, YsfksjHVO.YSY);
				}
			}
		}
		//验收日期
		String ysrq=this.clientUI.getBillCardPanel().getHeadItem(YsfksjHVO.YSRQ).getValue();
		if(ysrq!=null && ysrq.length() > 0)
		{
			int row=this.clientUI.getBillCardPanel().getBillModel().getRowCount();
			for (int i = 0; i < row; i++) {
				if(this.clientUI.getBillCardPanel().getBodyValueAt(i,YsfksjHVO.YSRQ)==null){
					this.clientUI.getBillCardPanel().setBodyValueAt(ysrq, i, YsfksjHVO.YSRQ);
				}
			}
		}
		
		//验收联系电话
		String yslxdh=this.clientUI.getBillCardPanel().getHeadItem(YsfksjHVO.YSLXDH).getValue();
		if(yslxdh!=null && yslxdh.length() > 0)
		{
			int row=this.clientUI.getBillCardPanel().getBillModel().getRowCount();
			for (int i = 0; i < row; i++) {
				if(this.clientUI.getBillCardPanel().getBodyValueAt(i,YsfksjHVO.YSLXDH)==null){
					this.clientUI.getBillCardPanel().setBodyValueAt(yslxdh, i, YsfksjHVO.YSLXDH);
				}
			}
		}
		
		//modify by crf 2015-06-15
//		//验收结果
//		String ysjg=this.clientUI.getBillCardPanel().getHeadItem(YsfksjHVO.YSJG).getValue();
//		if(ysjg!=null && ysjg.length() > 0)
//		{
//			int row=this.clientUI.getBillCardPanel().getBillModel().getRowCount();
//			for (int i = 0; i < row; i++) {
//				if(ysjg.equals("0")){//验收合格  , 验收合格标志勾上
//					this.clientUI.getBillCardPanel().setBodyValueAt(UFBoolean.TRUE, i, YsfksjHVO.YSHGBZ);
//				}else{
//					this.clientUI.getBillCardPanel().setBodyValueAt(UFBoolean.FALSE, i, YsfksjHVO.YSHGBZ);
//				}
//			}
//		}
		
		//移交验收日期
		String yjysrq=this.clientUI.getBillCardPanel().getHeadItem(YsfksjHVO.YJBWYSRQ).getValue();
		if(yjysrq!=null && yjysrq.length() > 0)
		{
			int row=this.clientUI.getBillCardPanel().getBillModel().getRowCount();
			for (int i = 0; i < row; i++) {
				if(this.clientUI.getBillCardPanel().getBodyValueAt(i,YsfksjHVO.YJBWYSRQ)==null){
					this.clientUI.getBillCardPanel().setBodyValueAt(yjysrq, i, YsfksjBVO.YJYSRQ);
				}
			}
		}
	}
	
	
}
