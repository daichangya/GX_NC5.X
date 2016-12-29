package nc.vo.lcsw.sw10;
/** 
 * <b> ��װ��������  </b>
 * <p>
 *     �ڴ˴����Ӵ����������Ϣ 
 * <p>
 * @author xuns
 * <b>����ʱ��: 2014-08-12 16:22:09</b>
 * 
 * 
*/ 
import nc.vo.lcsw.sw02.BzsqVO;
import nc.vo.pub.lang.*;
import nc.vo.pub.*;

public class BzfyHVO extends SuperVO implements Cloneable{
	
	public Object clone() {
		BzfyHVO o = null;
		try {
			o = (BzfyHVO) super.clone();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return o;
	}
	private String vlastbillid;
	private UFDouble jsgck;
	private String yhzh;
	private String reserve10;
	private UFDateTime ts;
	private String reserve11;
	private String remark;
	private String reserve12;
	private String reserve13;
	private UFDouble bjkcf;
	private UFDate dmakedate;
	private String reserve14;
	private String vsourcebillno;
	private String pk_billtype;
	private String reserve20;
	private UFDouble reserve7;
	private UFDouble kcsjf;
	private UFDouble reserve6;
	private UFDouble reserve5;
	private String reserve4;
	private String reserve9;
	private UFDouble reserve8;
	private String reserve3;
	private String reserve2;
	private String reserve1;
	private String modifier;
	private String reserve18;
	private UFDate dbilldate;
	private String fkfs;
	private String reserve17;
	private String reserve16;
	private String reserve15;
	private String reserve19;
	private String vlastbilltype;
	private Integer jyskqs;
	private String voperatorid;
	private String vapprovenote;
	private UFDouble ysgck3;
	private UFDouble ysgck1;
	private UFDouble ysgck2;
	private UFDate dmodify;
	private String pk_bzsq;
	private String vapproveid;
	private String khyh;
	private String pk_busitype;
	private Integer dr;
	private String pk_corp;
	private String jmlx;
	private String pk_bzfy_h;
	private String vsourcebilltype;
	private String vbillcode;
	private Integer vbillstatus;
	private UFDate dapprovedate;
	private String vsourcebillid;
	private String slbh;//�������
	private String gcmc;
	
	//add by crf 2015-06-17 ����[�Ƿ�ͬ����]��[�Ƿ�������]��[��ˮ����] 
	private UFBoolean sfsyx;
	private UFBoolean gtcz;
	private Integer yshs;
	
	
	public UFBoolean getSfsyx() {
		return sfsyx;
	}
	public void setSfsyx(UFBoolean sfsyx) {
		this.sfsyx = sfsyx;
	}
	public UFBoolean getGtcz() {
		return gtcz;
	}
	public void setGtcz(UFBoolean gtcz) {
		this.gtcz = gtcz;
	}
	public Integer getYshs() {
		return yshs;
	}
	public void setYshs(Integer yshs) {
		this.yshs = yshs;
	}
	
	//------------end 2015-06-17-------------
	
	public String getGcmc() {
		return gcmc;
	}
	public void setGcmc(String gcmc) {
		this.gcmc = gcmc;
	}
	public String getSlbh() {
		return slbh;
	}
	public void setSlbh(String slbh) {
		this.slbh = slbh;
	}
	
	public static final String GCMC = "gcmc";
	public static final String SLBH = "slbh";
	public static final String VLASTBILLID = "vlastbillid";
	public static final String JSGCK = "jsgck";
	public static final String YHZH = "yhzh";
	public static final String RESERVE10 = "reserve10";
	public static final String TS = "ts";
	public static final String RESERVE11 = "reserve11";
	public static final String REMARK = "remark";
	public static final String RESERVE12 = "reserve12";
	public static final String RESERVE13 = "reserve13";
	public static final String BJKCF = "bjkcf";
	public static final String DMAKEDATE = "dmakedate";
	public static final String RESERVE14 = "reserve14";
	public static final String VSOURCEBILLNO = "vsourcebillno";
	public static final String PK_BILLTYPE = "pk_billtype";
	public static final String RESERVE20 = "reserve20";
	public static final String RESERVE7 = "reserve7";
	public static final String KCSJF = "kcsjf";
	public static final String RESERVE6 = "reserve6";
	public static final String RESERVE5 = "reserve5";
	public static final String RESERVE4 = "reserve4";
	public static final String RESERVE9 = "reserve9";
	public static final String RESERVE8 = "reserve8";
	public static final String RESERVE3 = "reserve3";
	public static final String RESERVE2 = "reserve2";
	public static final String RESERVE1 = "reserve1";
	public static final String MODIFIER = "modifier";
	public static final String RESERVE18 = "reserve18";
	public static final String DBILLDATE = "dbilldate";
	public static final String FKFS = "fkfs";
	public static final String RESERVE17 = "reserve17";
	public static final String RESERVE16 = "reserve16";
	public static final String RESERVE15 = "reserve15";
	public static final String RESERVE19 = "reserve19";
	public static final String VLASTBILLTYPE = "vlastbilltype";
	public static final String JYSKQS = "jyskqs";
	public static final String VOPERATORID = "voperatorid";
	public static final String VAPPROVENOTE = "vapprovenote";
	public static final String YSGCK3 = "ysgck3";
	public static final String YSGCK1 = "ysgck1";
	public static final String YSGCK2 = "ysgck2";
	public static final String DMODIFY = "dmodify";
	public static final String PK_BZSQ = "pk_bzsq";
	public static final String VAPPROVEID = "vapproveid";
	public static final String KHYH = "khyh";
	public static final String PK_BUSITYPE = "pk_busitype";
	public static final String DR = "dr";
	public static final String PK_CORP = "pk_corp";
	public static final String JMLX = "jmlx";
	public static final String PK_BZFY_H = "pk_bzfy_h";
	public static final String VSOURCEBILLTYPE = "vsourcebilltype";
	public static final String VBILLCODE = "vbillcode";
	public static final String VBILLSTATUS = "vbillstatus";
	public static final String DAPPROVEDATE = "dapprovedate";
	public static final String VSOURCEBILLID = "vsourcebillid";

	/** 
	 * 
	 * ����<���ε���ID>��Getter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public String getVlastbillid(){
		 return vlastbillid;
	}
	/** 
	 * 
	 * ����<���ε���ID>��Setter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public void setVlastbillid(String newVlastbillid){
		 this.vlastbillid = newVlastbillid;
	}
	/** 
	 * 
	 * ����<���㹤�̿�>��Getter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public UFDouble getJsgck(){
		 return jsgck;
	}
	/** 
	 * 
	 * ����<���㹤�̿�>��Setter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public void setJsgck(UFDouble newJsgck){
		 this.jsgck = newJsgck;
	}
	/** 
	 * 
	 * ����<�����˺�>��Getter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public String getYhzh(){
		 return yhzh;
	}
	/** 
	 * 
	 * ����<�����˺�>��Setter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public void setYhzh(String newYhzh){
		 this.yhzh = newYhzh;
	}
	/** 
	 * 
	 * ����<Ԥ���ֶ�10>��Getter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public String getReserve10(){
		 return reserve10;
	}
	/** 
	 * 
	 * ����<Ԥ���ֶ�10>��Setter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public void setReserve10(String newReserve10){
		 this.reserve10 = newReserve10;
	}
	/** 
	 * 
	 * ����<ʱ��>��Getter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public UFDateTime getTs(){
		 return ts;
	}
	/** 
	 * 
	 * ����<ʱ��>��Setter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public void setTs(UFDateTime newTs){
		 this.ts = newTs;
	}
	/** 
	 * 
	 * ����<Ԥ���ֶ�11>��Getter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public String getReserve11(){
		 return reserve11;
	}
	/** 
	 * 
	 * ����<Ԥ���ֶ�11>��Setter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public void setReserve11(String newReserve11){
		 this.reserve11 = newReserve11;
	}
	/** 
	 * 
	 * ����<��ע>��Getter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public String getRemark(){
		 return remark;
	}
	/** 
	 * 
	 * ����<��ע>��Setter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public void setRemark(String newRemark){
		 this.remark = newRemark;
	}
	/** 
	 * 
	 * ����<Ԥ���ֶ�12>��Getter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public String getReserve12(){
		 return reserve12;
	}
	/** 
	 * 
	 * ����<Ԥ���ֶ�12>��Setter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public void setReserve12(String newReserve12){
		 this.reserve12 = newReserve12;
	}
	/** 
	 * 
	 * ����<Ԥ���ֶ�13>��Getter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public String getReserve13(){
		 return reserve13;
	}
	/** 
	 * 
	 * ����<Ԥ���ֶ�13>��Setter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public void setReserve13(String newReserve13){
		 this.reserve13 = newReserve13;
	}
	/** 
	 * 
	 * ����<���������>��Getter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public UFDouble getBjkcf(){
		 return bjkcf;
	}
	/** 
	 * 
	 * ����<���������>��Setter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public void setBjkcf(UFDouble newBjkcf){
		 this.bjkcf = newBjkcf;
	}
	/** 
	 * 
	 * ����<�Ƶ�����>��Getter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public UFDate getDmakedate(){
		 return dmakedate;
	}
	/** 
	 * 
	 * ����<�Ƶ�����>��Setter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public void setDmakedate(UFDate newDmakedate){
		 this.dmakedate = newDmakedate;
	}
	/** 
	 * 
	 * ����<Ԥ���ֶ�14>��Getter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public String getReserve14(){
		 return reserve14;
	}
	/** 
	 * 
	 * ����<Ԥ���ֶ�14>��Setter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public void setReserve14(String newReserve14){
		 this.reserve14 = newReserve14;
	}
	/** 
	 * 
	 * ����<���ε��ݺ�>��Getter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public String getVsourcebillno(){
		 return vsourcebillno;
	}
	/** 
	 * 
	 * ����<���ε��ݺ�>��Setter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public void setVsourcebillno(String newVsourcebillno){
		 this.vsourcebillno = newVsourcebillno;
	}
	/** 
	 * 
	 * ����<��������>��Getter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public String getPk_billtype(){
		 return pk_billtype;
	}
	/** 
	 * 
	 * ����<��������>��Setter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public void setPk_billtype(String newPk_billtype){
		 this.pk_billtype = newPk_billtype;
	}
	/** 
	 * 
	 * ����<Ԥ���ֶ�20>��Getter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public String getReserve20(){
		 return reserve20;
	}
	/** 
	 * 
	 * ����<Ԥ���ֶ�20>��Setter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public void setReserve20(String newReserve20){
		 this.reserve20 = newReserve20;
	}
	/** 
	 * 
	 * ����<Ԥ���ֶ�7>��Getter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public UFDouble getReserve7(){
		 return reserve7;
	}
	/** 
	 * 
	 * ����<Ԥ���ֶ�7>��Setter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public void setReserve7(UFDouble newReserve7){
		 this.reserve7 = newReserve7;
	}
	/** 
	 * 
	 * ����<������Ʒ�>��Getter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public UFDouble getKcsjf(){
		 return kcsjf;
	}
	/** 
	 * 
	 * ����<������Ʒ�>��Setter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public void setKcsjf(UFDouble newKcsjf){
		 this.kcsjf = newKcsjf;
	}
	/** 
	 * 
	 * ����<Ԥ���ֶ�6>��Getter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public UFDouble getReserve6(){
		 return reserve6;
	}
	/** 
	 * 
	 * ����<Ԥ���ֶ�6>��Setter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public void setReserve6(UFDouble newReserve6){
		 this.reserve6 = newReserve6;
	}
	/** 
	 * 
	 * ����<Ԥ���ֶ�5>��Getter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public UFDouble getReserve5(){
		 return reserve5;
	}
	/** 
	 * 
	 * ����<Ԥ���ֶ�5>��Setter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public void setReserve5(UFDouble newReserve5){
		 this.reserve5 = newReserve5;
	}
	/** 
	 * 
	 * ����<Ԥ���ֶ�4>��Getter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public String getReserve4(){
		 return reserve4;
	}
	/** 
	 * 
	 * ����<Ԥ���ֶ�4>��Setter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public void setReserve4(String newReserve4){
		 this.reserve4 = newReserve4;
	}
	/** 
	 * 
	 * ����<Ԥ���ֶ�9>��Getter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public String getReserve9(){
		 return reserve9;
	}
	/** 
	 * 
	 * ����<Ԥ���ֶ�9>��Setter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public void setReserve9(String newReserve9){
		 this.reserve9 = newReserve9;
	}
	/** 
	 * 
	 * ����<Ԥ���ֶ�8>��Getter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public UFDouble getReserve8(){
		 return reserve8;
	}
	/** 
	 * 
	 * ����<Ԥ���ֶ�8>��Setter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public void setReserve8(UFDouble newReserve8){
		 this.reserve8 = newReserve8;
	}
	/** 
	 * 
	 * ����<Ԥ���ֶ�3>��Getter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public String getReserve3(){
		 return reserve3;
	}
	/** 
	 * 
	 * ����<Ԥ���ֶ�3>��Setter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public void setReserve3(String newReserve3){
		 this.reserve3 = newReserve3;
	}
	/** 
	 * 
	 * ����<Ԥ���ֶ�2>��Getter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public String getReserve2(){
		 return reserve2;
	}
	/** 
	 * 
	 * ����<Ԥ���ֶ�2>��Setter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public void setReserve2(String newReserve2){
		 this.reserve2 = newReserve2;
	}
	/** 
	 * 
	 * ����<Ԥ���ֶ�1>��Getter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public String getReserve1(){
		 return reserve1;
	}
	/** 
	 * 
	 * ����<Ԥ���ֶ�1>��Setter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public void setReserve1(String newReserve1){
		 this.reserve1 = newReserve1;
	}
	/** 
	 * 
	 * ����<�޸���>��Getter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public String getModifier(){
		 return modifier;
	}
	/** 
	 * 
	 * ����<�޸���>��Setter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public void setModifier(String newModifier){
		 this.modifier = newModifier;
	}
	/** 
	 * 
	 * ����<Ԥ���ֶ�18>��Getter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public String getReserve18(){
		 return reserve18;
	}
	/** 
	 * 
	 * ����<Ԥ���ֶ�18>��Setter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public void setReserve18(String newReserve18){
		 this.reserve18 = newReserve18;
	}
	/** 
	 * 
	 * ����<ҵ������>��Getter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public UFDate getDbilldate(){
		 return dbilldate;
	}
	/** 
	 * 
	 * ����<ҵ������>��Setter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public void setDbilldate(UFDate newDbilldate){
		 this.dbilldate = newDbilldate;
	}
	/** 
	 * 
	 * ����<���ʽ>��Getter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public String getFkfs(){
		 return fkfs;
	}
	/** 
	 * 
	 * ����<���ʽ>��Setter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public void setFkfs(String newFkfs){
		 this.fkfs = newFkfs;
	}
	/** 
	 * 
	 * ����<Ԥ���ֶ�17>��Getter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public String getReserve17(){
		 return reserve17;
	}
	/** 
	 * 
	 * ����<Ԥ���ֶ�17>��Setter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public void setReserve17(String newReserve17){
		 this.reserve17 = newReserve17;
	}
	/** 
	 * 
	 * ����<Ԥ���ֶ�16>��Getter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public String getReserve16(){
		 return reserve16;
	}
	/** 
	 * 
	 * ����<Ԥ���ֶ�16>��Setter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public void setReserve16(String newReserve16){
		 this.reserve16 = newReserve16;
	}
	/** 
	 * 
	 * ����<Ԥ���ֶ�15>��Getter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public String getReserve15(){
		 return reserve15;
	}
	/** 
	 * 
	 * ����<Ԥ���ֶ�15>��Setter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public void setReserve15(String newReserve15){
		 this.reserve15 = newReserve15;
	}
	/** 
	 * 
	 * ����<Ԥ���ֶ�19>��Getter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public String getReserve19(){
		 return reserve19;
	}
	/** 
	 * 
	 * ����<Ԥ���ֶ�19>��Setter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public void setReserve19(String newReserve19){
		 this.reserve19 = newReserve19;
	}
	/** 
	 * 
	 * ����<���ε�������>��Getter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public String getVlastbilltype(){
		 return vlastbilltype;
	}
	/** 
	 * 
	 * ����<���ε�������>��Setter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public void setVlastbilltype(String newVlastbilltype){
		 this.vlastbilltype = newVlastbilltype;
	}
	/** 
	 * 
	 * ����<��Ԥ�������>��Getter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public Integer getJyskqs(){
		 return jyskqs;
	}
	/** 
	 * 
	 * ����<��Ԥ�������>��Setter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public void setJyskqs(Integer newJyskqs){
		 this.jyskqs = newJyskqs;
	}
	/** 
	 * 
	 * ����<�Ƶ���>��Getter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public String getVoperatorid(){
		 return voperatorid;
	}
	/** 
	 * 
	 * ����<�Ƶ���>��Setter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public void setVoperatorid(String newVoperatorid){
		 this.voperatorid = newVoperatorid;
	}
	/** 
	 * 
	 * ����<�������>��Getter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public String getVapprovenote(){
		 return vapprovenote;
	}
	/** 
	 * 
	 * ����<�������>��Setter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public void setVapprovenote(String newVapprovenote){
		 this.vapprovenote = newVapprovenote;
	}
	/** 
	 * 
	 * ����<Ԥ�㹤�̿�3��>��Getter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public UFDouble getYsgck3(){
		 return ysgck3;
	}
	/** 
	 * 
	 * ����<Ԥ�㹤�̿�3��>��Setter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public void setYsgck3(UFDouble newYsgck3){
		 this.ysgck3 = newYsgck3;
	}
	/** 
	 * 
	 * ����<Ԥ�㹤�̿�1��>��Getter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public UFDouble getYsgck1(){
		 return ysgck1;
	}
	/** 
	 * 
	 * ����<Ԥ�㹤�̿�1��>��Setter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public void setYsgck1(UFDouble newYsgck1){
		 this.ysgck1 = newYsgck1;
	}
	/** 
	 * 
	 * ����<Ԥ�㹤�̿�2��>��Getter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public UFDouble getYsgck2(){
		 return ysgck2;
	}
	/** 
	 * 
	 * ����<Ԥ�㹤�̿�2��>��Setter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public void setYsgck2(UFDouble newYsgck2){
		 this.ysgck2 = newYsgck2;
	}
	/** 
	 * 
	 * ����<�޸�����>��Getter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public UFDate getDmodify(){
		 return dmodify;
	}
	/** 
	 * 
	 * ����<�޸�����>��Setter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public void setDmodify(UFDate newDmodify){
		 this.dmodify = newDmodify;
	}
	/** 
	 * 
	 * ����<��װ�����>��Getter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public String getPk_bzsq(){
		 return pk_bzsq;
	}
	/** 
	 * 
	 * ����<��װ�����>��Setter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public void setPk_bzsq(String newPk_bzsq){
		 this.pk_bzsq = newPk_bzsq;
	}
	/** 
	 * 
	 * ����<�����>��Getter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public String getVapproveid(){
		 return vapproveid;
	}
	/** 
	 * 
	 * ����<�����>��Setter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public void setVapproveid(String newVapproveid){
		 this.vapproveid = newVapproveid;
	}
	/** 
	 * 
	 * ����<��������>��Getter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public String getKhyh(){
		 return khyh;
	}
	/** 
	 * 
	 * ����<��������>��Setter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public void setKhyh(String newKhyh){
		 this.khyh = newKhyh;
	}
	/** 
	 * 
	 * ����<ҵ������>��Getter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public String getPk_busitype(){
		 return pk_busitype;
	}
	/** 
	 * 
	 * ����<ҵ������>��Setter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public void setPk_busitype(String newPk_busitype){
		 this.pk_busitype = newPk_busitype;
	}
	/** 
	 * 
	 * ����<ɾ��>��Getter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public Integer getDr(){
		 return dr;
	}
	/** 
	 * 
	 * ����<ɾ��>��Setter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public void setDr(Integer newDr){
		 this.dr = newDr;
	}
	/** 
	 * 
	 * ����<��˾ID>��Getter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public String getPk_corp(){
		 return pk_corp;
	}
	/** 
	 * 
	 * ����<��˾ID>��Setter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public void setPk_corp(String newPk_corp){
		 this.pk_corp = newPk_corp;
	}
	/** 
	 * 
	 * ����<��������>��Getter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public String getJmlx(){
		 return jmlx;
	}
	/** 
	 * 
	 * ����<��������>��Setter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public void setJmlx(String newJmlx){
		 this.jmlx = newJmlx;
	}
	/** 
	 * 
	 * ����<����>��Getter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public String getPk_bzfy_h(){
		 return pk_bzfy_h;
	}
	/** 
	 * 
	 * ����<����>��Setter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public void setPk_bzfy_h(String newPk_bzfy_h){
		 this.pk_bzfy_h = newPk_bzfy_h;
	}
	/** 
	 * 
	 * ����<��Դ��������>��Getter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public String getVsourcebilltype(){
		 return vsourcebilltype;
	}
	/** 
	 * 
	 * ����<��Դ��������>��Setter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public void setVsourcebilltype(String newVsourcebilltype){
		 this.vsourcebilltype = newVsourcebilltype;
	}
	/** 
	 * 
	 * ����<���ݺ�>��Getter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public String getVbillcode(){
		 return vbillcode;
	}
	/** 
	 * 
	 * ����<���ݺ�>��Setter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public void setVbillcode(String newVbillcode){
		 this.vbillcode = newVbillcode;
	}
	/** 
	 * 
	 * ����<����״̬>��Getter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public Integer getVbillstatus(){
		 return vbillstatus;
	}
	/** 
	 * 
	 * ����<����״̬>��Setter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public void setVbillstatus(Integer newVbillstatus){
		 this.vbillstatus = newVbillstatus;
	}
	/** 
	 * 
	 * ����<�������>��Getter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public UFDate getDapprovedate(){
		 return dapprovedate;
	}
	/** 
	 * 
	 * ����<�������>��Setter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public void setDapprovedate(UFDate newDapprovedate){
		 this.dapprovedate = newDapprovedate;
	}
	/** 
	 * 
	 * ����<��Դ����ID>��Getter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public String getVsourcebillid(){
		 return vsourcebillid;
	}
	/** 
	 * 
	 * ����<��Դ����ID>��Setter����
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	 * 
	 */ 
	public void setVsourcebillid(String newVsourcebillid){
		 this.vsourcebillid = newVsourcebillid;
	}



	

	/** 
	 * ȡ�ø�VO�����ֶ�
	 * 
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	*/ 
	public java.lang.String getParentPKFieldName() {
		return null;
	}
	/** 
	 * ȡ�ñ�����
	 * 
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	*/ 
	public java.lang.String getPKFieldName() {
		return "pk_bzfy_h";
	}
	/** 
	 * ���ر�����
	 * 
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	*/ 
	public java.lang.String getTableName() {
		return "lcsw_bzfy_h";
	}
	/** 
	 * ����Ĭ�Ϸ�ʽ����������
	 * 
	 * <b>����ʱ��   2014-08-13 15:49:37</b>
	*/ 
	public BzfyHVO() {
		super();
	}
}