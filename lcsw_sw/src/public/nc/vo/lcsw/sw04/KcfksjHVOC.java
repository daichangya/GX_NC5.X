/***************************************************************\
 *     The skeleton of this class is generated by an automatic *
 * code generator for NC product. It is based on Velocity.     *
\***************************************************************/
package nc.vo.lcsw.sw04;

import nc.vo.pub.*;
import nc.vo.pub.lang.*;

/**
 * <b> 在此处简要描述此类的功能 </b>
 * <p>
 * 在此处添加此类的描述信息
 * </p>
 * 创建日期:2014-08-13 15:40:51
 * 
 * @author Administrator
 * @version NCPrj 1.0
 */
@SuppressWarnings("serial")
public class KcfksjHVOC extends SuperVO {
	private UFDate yqxgrq;
	private UFDate yjsjrq;
	private String vlastbillid;
	private UFDate jhxtrq;
	private String remark;
	private String vlastbillrowid;
	private Integer wgyqts;
	private String vapproveid;
	private String reserve9;
	private UFDouble reserve8;
	private String vsourcebillno;
	private UFDouble reserve5;
	private String reserve4;
	private UFDouble reserve7;
	private Integer dr;
	private UFDouble reserve6;
	private String reserve1;
	private String reserve3;
	private String pk_busitype;
	private String reserve2;
	private UFDate yjsjpsrq;
	private String modifier;
	private String vsourcebillid;
	private UFDate dmodify;
	private String vsourcebillrowid;
	private String yqxgr;
	private String voperatorid;
	private UFDate sjpswcrq;
	private String reserve10;
	private UFDate dbilldate;
	private String reserve14;
	private String reserve13;
	private String reserve12;
	private String reserve11;
	private String reserve19;
	private String reserve15;
	private String reserve16;
	private String pk_billtype;
	private String reserve17;
	private String reserve18;
	private String pk_jobbasfil;
	private String pk_kcfksjhid;
	private UFDateTime ts;
	private String vsourcebilltype;
	private String vapprovenote;
	private String pk_corp;
	private String vbillcode;
	private UFDate kcfkrq;
	private String reserve20;
	private String vlastbilltype;
	private UFDate kcrq;
	private String kcsjry;
	private String kcry;
	private UFDate dmakedate;
	private String jbry;
	private Integer vbillstatus;
	private UFDate yjhhxrq;
	private UFDate dapprovedate;
	
	private UFBoolean sfyjsj;//是否移交设计
	//add by crf 2015-07-08 [计划勘察工期]、[计划勘察完成日期]、[实际勘察工期]
	private Integer jhkcgq;
	private UFDate jhkcwcrq;
	private Integer sjkcgq;

	public Integer getJhkcgq() {
		return jhkcgq;
	}

	public void setJhkcgq(Integer jhkcgq) {
		this.jhkcgq = jhkcgq;
	}

	public UFDate getJhkcwcrq() {
		return jhkcwcrq;
	}

	public void setJhkcwcrq(UFDate jhkcwcrq) {
		this.jhkcwcrq = jhkcwcrq;
	}

	public Integer getSjkcgq() {
		return sjkcgq;
	}

	public void setSjkcgq(Integer sjkcgq) {
		this.sjkcgq = sjkcgq;
	}
	//end

	public UFBoolean getSfyjsj() {
		return sfyjsj;
	}

	public void setSfyjsj(UFBoolean sfyjsj) {
		this.sfyjsj = sfyjsj;
	}

	public static final String SFYJSJ= "sfyjsj";
	public static final String YQXGRQ = "yqxgrq";
	public static final String YJSJRQ = "yjsjrq";
	public static final String VLASTBILLID = "vlastbillid";
	public static final String JHXTRQ = "jhxtrq";
	public static final String REMARK = "remark";
	public static final String VLASTBILLROWID = "vlastbillrowid";
	public static final String WGYQTS = "wgyqts";
	public static final String VAPPROVEID = "vapproveid";
	public static final String RESERVE9 = "reserve9";
	public static final String RESERVE8 = "reserve8";
	public static final String VSOURCEBILLNO = "vsourcebillno";
	public static final String RESERVE5 = "reserve5";
	public static final String RESERVE4 = "reserve4";
	public static final String RESERVE7 = "reserve7";
	public static final String RESERVE6 = "reserve6";
	public static final String RESERVE1 = "reserve1";
	public static final String RESERVE3 = "reserve3";
	public static final String PK_BUSITYPE = "pk_busitype";
	public static final String RESERVE2 = "reserve2";
	public static final String YJSJPSRQ = "yjsjpsrq";
	public static final String MODIFIER = "modifier";
	public static final String VSOURCEBILLID = "vsourcebillid";
	public static final String DMODIFY = "dmodify";
	public static final String VSOURCEBILLROWID = "vsourcebillrowid";
	public static final String YQXGR = "yqxgr";
	public static final String VOPERATORID = "voperatorid";
	public static final String SJPSWCRQ = "sjpswcrq";
	public static final String RESERVE10 = "reserve10";
	public static final String DBILLDATE = "dbilldate";
	public static final String RESERVE14 = "reserve14";
	public static final String RESERVE13 = "reserve13";
	public static final String RESERVE12 = "reserve12";
	public static final String RESERVE11 = "reserve11";
	public static final String RESERVE19 = "reserve19";
	public static final String RESERVE15 = "reserve15";
	public static final String RESERVE16 = "reserve16";
	public static final String PK_BILLTYPE = "pk_billtype";
	public static final String RESERVE17 = "reserve17";
	public static final String RESERVE18 = "reserve18";
	public static final String PK_JOBBASFIL = "pk_jobbasfil";
	public static final String PK_KCFKSJHID = "pk_kcfksjhid";
	public static final String VSOURCEBILLTYPE = "vsourcebilltype";
	public static final String VAPPROVENOTE = "vapprovenote";
	public static final String PK_CORP = "pk_corp";
	public static final String VBILLCODE = "vbillcode";
	public static final String KCFKRQ = "kcfkrq";
	public static final String RESERVE20 = "reserve20";
	public static final String VLASTBILLTYPE = "vlastbilltype";
	public static final String KCRQ = "kcrq";
	public static final String KCSJRY = "kcsjry";
	public static final String KCRY = "kcry";
	public static final String DMAKEDATE = "dmakedate";
	public static final String JBRY = "jbry";
	public static final String VBILLSTATUS = "vbillstatus";
	public static final String YJHHXRQ = "yjhhxrq";
	public static final String DAPPROVEDATE = "dapprovedate";

	/**
	 * 属性yqxgrq的Getter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @return UFDate
	 */
	public UFDate getYqxgrq() {
		return yqxgrq;
	}

	/**
	 * 属性yqxgrq的Setter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @param newYqxgrq
	 *            UFDate
	 */
	public void setYqxgrq(UFDate newYqxgrq) {
		this.yqxgrq = newYqxgrq;
	}

	/**
	 * 属性yjsjrq的Getter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @return UFDate
	 */
	public UFDate getYjsjrq() {
		return yjsjrq;
	}

	/**
	 * 属性yjsjrq的Setter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @param newYjsjrq
	 *            UFDate
	 */
	public void setYjsjrq(UFDate newYjsjrq) {
		this.yjsjrq = newYjsjrq;
	}

	/**
	 * 属性vlastbillid的Getter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @return String
	 */
	public String getVlastbillid() {
		return vlastbillid;
	}

	/**
	 * 属性vlastbillid的Setter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @param newVlastbillid
	 *            String
	 */
	public void setVlastbillid(String newVlastbillid) {
		this.vlastbillid = newVlastbillid;
	}

	/**
	 * 属性jhxtrq的Getter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @return UFDate
	 */
	public UFDate getJhxtrq() {
		return jhxtrq;
	}

	/**
	 * 属性jhxtrq的Setter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @param newJhxtrq
	 *            UFDate
	 */
	public void setJhxtrq(UFDate newJhxtrq) {
		this.jhxtrq = newJhxtrq;
	}

	/**
	 * 属性remark的Getter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @return String
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * 属性remark的Setter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @param newRemark
	 *            String
	 */
	public void setRemark(String newRemark) {
		this.remark = newRemark;
	}

	/**
	 * 属性vlastbillrowid的Getter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @return String
	 */
	public String getVlastbillrowid() {
		return vlastbillrowid;
	}

	/**
	 * 属性vlastbillrowid的Setter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @param newVlastbillrowid
	 *            String
	 */
	public void setVlastbillrowid(String newVlastbillrowid) {
		this.vlastbillrowid = newVlastbillrowid;
	}

	/**
	 * 属性wgyqts的Getter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @return UFDouble
	 */
	public Integer getWgyqts() {
		return wgyqts;
	}

	/**
	 * 属性wgyqts的Setter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @param newWgyqts
	 *            UFDouble
	 */
	public void setWgyqts(Integer newWgyqts) {
		this.wgyqts = newWgyqts;
	}

	/**
	 * 属性vapproveid的Getter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @return String
	 */
	public String getVapproveid() {
		return vapproveid;
	}

	/**
	 * 属性vapproveid的Setter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @param newVapproveid
	 *            String
	 */
	public void setVapproveid(String newVapproveid) {
		this.vapproveid = newVapproveid;
	}

	/**
	 * 属性reserve9的Getter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @return String
	 */
	public String getReserve9() {
		return reserve9;
	}

	/**
	 * 属性reserve9的Setter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @param newReserve9
	 *            String
	 */
	public void setReserve9(String newReserve9) {
		this.reserve9 = newReserve9;
	}

	/**
	 * 属性reserve8的Getter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @return UFDouble
	 */
	public UFDouble getReserve8() {
		return reserve8;
	}

	/**
	 * 属性reserve8的Setter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @param newReserve8
	 *            UFDouble
	 */
	public void setReserve8(UFDouble newReserve8) {
		this.reserve8 = newReserve8;
	}

	/**
	 * 属性vsourcebillno的Getter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @return String
	 */
	public String getVsourcebillno() {
		return vsourcebillno;
	}

	/**
	 * 属性vsourcebillno的Setter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @param newVsourcebillno
	 *            String
	 */
	public void setVsourcebillno(String newVsourcebillno) {
		this.vsourcebillno = newVsourcebillno;
	}

	/**
	 * 属性reserve5的Getter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @return UFDouble
	 */
	public UFDouble getReserve5() {
		return reserve5;
	}

	/**
	 * 属性reserve5的Setter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @param newReserve5
	 *            UFDouble
	 */
	public void setReserve5(UFDouble newReserve5) {
		this.reserve5 = newReserve5;
	}

	/**
	 * 属性reserve4的Getter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @return String
	 */
	public String getReserve4() {
		return reserve4;
	}

	/**
	 * 属性reserve4的Setter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @param newReserve4
	 *            String
	 */
	public void setReserve4(String newReserve4) {
		this.reserve4 = newReserve4;
	}

	/**
	 * 属性reserve7的Getter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @return UFDouble
	 */
	public UFDouble getReserve7() {
		return reserve7;
	}

	/**
	 * 属性reserve7的Setter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @param newReserve7
	 *            UFDouble
	 */
	public void setReserve7(UFDouble newReserve7) {
		this.reserve7 = newReserve7;
	}

	/**
	 * 属性dr的Getter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @return UFDouble
	 */
	public Integer getDr() {
		return dr;
	}

	/**
	 * 属性dr的Setter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @param newDr
	 *            UFDouble
	 */
	public void setDr(Integer newDr) {
		this.dr = newDr;
	}

	/**
	 * 属性reserve6的Getter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @return UFDouble
	 */
	public UFDouble getReserve6() {
		return reserve6;
	}

	/**
	 * 属性reserve6的Setter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @param newReserve6
	 *            UFDouble
	 */
	public void setReserve6(UFDouble newReserve6) {
		this.reserve6 = newReserve6;
	}

	/**
	 * 属性reserve1的Getter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @return String
	 */
	public String getReserve1() {
		return reserve1;
	}

	/**
	 * 属性reserve1的Setter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @param newReserve1
	 *            String
	 */
	public void setReserve1(String newReserve1) {
		this.reserve1 = newReserve1;
	}

	/**
	 * 属性reserve3的Getter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @return String
	 */
	public String getReserve3() {
		return reserve3;
	}

	/**
	 * 属性reserve3的Setter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @param newReserve3
	 *            String
	 */
	public void setReserve3(String newReserve3) {
		this.reserve3 = newReserve3;
	}

	/**
	 * 属性pk_busitype的Getter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @return String
	 */
	public String getPk_busitype() {
		return pk_busitype;
	}

	/**
	 * 属性pk_busitype的Setter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @param newPk_busitype
	 *            String
	 */
	public void setPk_busitype(String newPk_busitype) {
		this.pk_busitype = newPk_busitype;
	}

	/**
	 * 属性reserve2的Getter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @return String
	 */
	public String getReserve2() {
		return reserve2;
	}

	/**
	 * 属性reserve2的Setter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @param newReserve2
	 *            String
	 */
	public void setReserve2(String newReserve2) {
		this.reserve2 = newReserve2;
	}

	/**
	 * 属性yjsjpsrq的Getter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @return UFDate
	 */
	public UFDate getYjsjpsrq() {
		return yjsjpsrq;
	}

	/**
	 * 属性yjsjpsrq的Setter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @param newYjsjpsrq
	 *            UFDate
	 */
	public void setYjsjpsrq(UFDate newYjsjpsrq) {
		this.yjsjpsrq = newYjsjpsrq;
	}

	/**
	 * 属性modifier的Getter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @return String
	 */
	public String getModifier() {
		return modifier;
	}

	/**
	 * 属性modifier的Setter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @param newModifier
	 *            String
	 */
	public void setModifier(String newModifier) {
		this.modifier = newModifier;
	}

	/**
	 * 属性vsourcebillid的Getter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @return String
	 */
	public String getVsourcebillid() {
		return vsourcebillid;
	}

	/**
	 * 属性vsourcebillid的Setter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @param newVsourcebillid
	 *            String
	 */
	public void setVsourcebillid(String newVsourcebillid) {
		this.vsourcebillid = newVsourcebillid;
	}

	/**
	 * 属性dmodify的Getter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @return UFDate
	 */
	public UFDate getDmodify() {
		return dmodify;
	}

	/**
	 * 属性dmodify的Setter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @param newDmodify
	 *            UFDate
	 */
	public void setDmodify(UFDate newDmodify) {
		this.dmodify = newDmodify;
	}

	/**
	 * 属性vsourcebillrowid的Getter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @return String
	 */
	public String getVsourcebillrowid() {
		return vsourcebillrowid;
	}

	/**
	 * 属性vsourcebillrowid的Setter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @param newVsourcebillrowid
	 *            String
	 */
	public void setVsourcebillrowid(String newVsourcebillrowid) {
		this.vsourcebillrowid = newVsourcebillrowid;
	}

	/**
	 * 属性yqxgr的Getter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @return String
	 */
	public String getYqxgr() {
		return yqxgr;
	}

	/**
	 * 属性yqxgr的Setter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @param newYqxgr
	 *            String
	 */
	public void setYqxgr(String newYqxgr) {
		this.yqxgr = newYqxgr;
	}

	/**
	 * 属性voperatorid的Getter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @return String
	 */
	public String getVoperatorid() {
		return voperatorid;
	}

	/**
	 * 属性voperatorid的Setter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @param newVoperatorid
	 *            String
	 */
	public void setVoperatorid(String newVoperatorid) {
		this.voperatorid = newVoperatorid;
	}

	/**
	 * 属性sjpswcrq的Getter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @return UFDate
	 */
	public UFDate getSjpswcrq() {
		return sjpswcrq;
	}

	/**
	 * 属性sjpswcrq的Setter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @param newSjpswcrq
	 *            UFDate
	 */
	public void setSjpswcrq(UFDate newSjpswcrq) {
		this.sjpswcrq = newSjpswcrq;
	}

	/**
	 * 属性reserve10的Getter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @return String
	 */
	public String getReserve10() {
		return reserve10;
	}

	/**
	 * 属性reserve10的Setter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @param newReserve10
	 *            String
	 */
	public void setReserve10(String newReserve10) {
		this.reserve10 = newReserve10;
	}

	/**
	 * 属性dbilldate的Getter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @return UFDate
	 */
	public UFDate getDbilldate() {
		return dbilldate;
	}

	/**
	 * 属性dbilldate的Setter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @param newDbilldate
	 *            UFDate
	 */
	public void setDbilldate(UFDate newDbilldate) {
		this.dbilldate = newDbilldate;
	}

	/**
	 * 属性reserve14的Getter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @return String
	 */
	public String getReserve14() {
		return reserve14;
	}

	/**
	 * 属性reserve14的Setter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @param newReserve14
	 *            String
	 */
	public void setReserve14(String newReserve14) {
		this.reserve14 = newReserve14;
	}

	/**
	 * 属性reserve13的Getter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @return String
	 */
	public String getReserve13() {
		return reserve13;
	}

	/**
	 * 属性reserve13的Setter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @param newReserve13
	 *            String
	 */
	public void setReserve13(String newReserve13) {
		this.reserve13 = newReserve13;
	}

	/**
	 * 属性reserve12的Getter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @return String
	 */
	public String getReserve12() {
		return reserve12;
	}

	/**
	 * 属性reserve12的Setter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @param newReserve12
	 *            String
	 */
	public void setReserve12(String newReserve12) {
		this.reserve12 = newReserve12;
	}

	/**
	 * 属性reserve11的Getter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @return String
	 */
	public String getReserve11() {
		return reserve11;
	}

	/**
	 * 属性reserve11的Setter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @param newReserve11
	 *            String
	 */
	public void setReserve11(String newReserve11) {
		this.reserve11 = newReserve11;
	}

	/**
	 * 属性reserve19的Getter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @return String
	 */
	public String getReserve19() {
		return reserve19;
	}

	/**
	 * 属性reserve19的Setter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @param newReserve19
	 *            String
	 */
	public void setReserve19(String newReserve19) {
		this.reserve19 = newReserve19;
	}

	/**
	 * 属性reserve15的Getter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @return String
	 */
	public String getReserve15() {
		return reserve15;
	}

	/**
	 * 属性reserve15的Setter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @param newReserve15
	 *            String
	 */
	public void setReserve15(String newReserve15) {
		this.reserve15 = newReserve15;
	}

	/**
	 * 属性reserve16的Getter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @return String
	 */
	public String getReserve16() {
		return reserve16;
	}

	/**
	 * 属性reserve16的Setter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @param newReserve16
	 *            String
	 */
	public void setReserve16(String newReserve16) {
		this.reserve16 = newReserve16;
	}

	/**
	 * 属性pk_billtype的Getter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @return String
	 */
	public String getPk_billtype() {
		return pk_billtype;
	}

	/**
	 * 属性pk_billtype的Setter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @param newPk_billtype
	 *            String
	 */
	public void setPk_billtype(String newPk_billtype) {
		this.pk_billtype = newPk_billtype;
	}

	/**
	 * 属性reserve17的Getter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @return String
	 */
	public String getReserve17() {
		return reserve17;
	}

	/**
	 * 属性reserve17的Setter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @param newReserve17
	 *            String
	 */
	public void setReserve17(String newReserve17) {
		this.reserve17 = newReserve17;
	}

	/**
	 * 属性reserve18的Getter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @return String
	 */
	public String getReserve18() {
		return reserve18;
	}

	/**
	 * 属性reserve18的Setter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @param newReserve18
	 *            String
	 */
	public void setReserve18(String newReserve18) {
		this.reserve18 = newReserve18;
	}

	/**
	 * 属性pk_jobbasfil的Getter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @return String
	 */
	public String getPk_jobbasfil() {
		return pk_jobbasfil;
	}

	/**
	 * 属性pk_jobbasfil的Setter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @param newPk_jobbasfil
	 *            String
	 */
	public void setPk_jobbasfil(String newPk_jobbasfil) {
		this.pk_jobbasfil = newPk_jobbasfil;
	}

	/**
	 * 属性pk_kcfksjhid的Getter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @return String
	 */
	public String getPk_kcfksjhid() {
		return pk_kcfksjhid;
	}

	/**
	 * 属性pk_kcfksjhid的Setter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @param newPk_kcfksjhid
	 *            String
	 */
	public void setPk_kcfksjhid(String newPk_kcfksjhid) {
		this.pk_kcfksjhid = newPk_kcfksjhid;
	}

	/**
	 * 属性ts的Getter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @return UFDateTime
	 */
	public UFDateTime getTs() {
		return ts;
	}

	/**
	 * 属性ts的Setter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @param newTs
	 *            UFDateTime
	 */
	public void setTs(UFDateTime newTs) {
		this.ts = newTs;
	}

	/**
	 * 属性vsourcebilltype的Getter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @return String
	 */
	public String getVsourcebilltype() {
		return vsourcebilltype;
	}

	/**
	 * 属性vsourcebilltype的Setter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @param newVsourcebilltype
	 *            String
	 */
	public void setVsourcebilltype(String newVsourcebilltype) {
		this.vsourcebilltype = newVsourcebilltype;
	}

	/**
	 * 属性vapprovenote的Getter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @return String
	 */
	public String getVapprovenote() {
		return vapprovenote;
	}

	/**
	 * 属性vapprovenote的Setter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @param newVapprovenote
	 *            String
	 */
	public void setVapprovenote(String newVapprovenote) {
		this.vapprovenote = newVapprovenote;
	}

	/**
	 * 属性pk_corp的Getter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @return String
	 */
	public String getPk_corp() {
		return pk_corp;
	}

	/**
	 * 属性pk_corp的Setter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @param newPk_corp
	 *            String
	 */
	public void setPk_corp(String newPk_corp) {
		this.pk_corp = newPk_corp;
	}

	/**
	 * 属性vbillcode的Getter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @return String
	 */
	public String getVbillcode() {
		return vbillcode;
	}

	/**
	 * 属性vbillcode的Setter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @param newVbillcode
	 *            String
	 */
	public void setVbillcode(String newVbillcode) {
		this.vbillcode = newVbillcode;
	}

	/**
	 * 属性kcfkrq的Getter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @return UFDate
	 */
	public UFDate getKcfkrq() {
		return kcfkrq;
	}

	/**
	 * 属性kcfkrq的Setter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @param newKcfkrq
	 *            UFDate
	 */
	public void setKcfkrq(UFDate newKcfkrq) {
		this.kcfkrq = newKcfkrq;
	}

	/**
	 * 属性reserve20的Getter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @return String
	 */
	public String getReserve20() {
		return reserve20;
	}

	/**
	 * 属性reserve20的Setter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @param newReserve20
	 *            String
	 */
	public void setReserve20(String newReserve20) {
		this.reserve20 = newReserve20;
	}

	/**
	 * 属性vlastbilltype的Getter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @return String
	 */
	public String getVlastbilltype() {
		return vlastbilltype;
	}

	/**
	 * 属性vlastbilltype的Setter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @param newVlastbilltype
	 *            String
	 */
	public void setVlastbilltype(String newVlastbilltype) {
		this.vlastbilltype = newVlastbilltype;
	}

	/**
	 * 属性kcrq的Getter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @return UFDate
	 */
	public UFDate getKcrq() {
		return kcrq;
	}

	/**
	 * 属性kcrq的Setter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @param newKcrq
	 *            UFDate
	 */
	public void setKcrq(UFDate newKcrq) {
		this.kcrq = newKcrq;
	}

	/**
	 * 属性kcsjry的Getter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @return String
	 */
	public String getKcsjry() {
		return kcsjry;
	}

	/**
	 * 属性kcsjry的Setter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @param newKcsjry
	 *            String
	 */
	public void setKcsjry(String newKcsjry) {
		this.kcsjry = newKcsjry;
	}

	/**
	 * 属性kcry的Getter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @return String
	 */
	public String getKcry() {
		return kcry;
	}

	/**
	 * 属性kcry的Setter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @param newKcry
	 *            String
	 */
	public void setKcry(String newKcry) {
		this.kcry = newKcry;
	}

	/**
	 * 属性dmakedate的Getter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @return UFDate
	 */
	public UFDate getDmakedate() {
		return dmakedate;
	}

	/**
	 * 属性dmakedate的Setter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @param newDmakedate
	 *            UFDate
	 */
	public void setDmakedate(UFDate newDmakedate) {
		this.dmakedate = newDmakedate;
	}

	/**
	 * 属性jbry的Getter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @return String
	 */
	public String getJbry() {
		return jbry;
	}

	/**
	 * 属性jbry的Setter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @param newJbry
	 *            String
	 */
	public void setJbry(String newJbry) {
		this.jbry = newJbry;
	}

	/**
	 * 属性vbillstatus的Getter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @return UFDouble
	 */
	public Integer getVbillstatus() {
		return vbillstatus;
	}

	/**
	 * 属性vbillstatus的Setter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @param newVbillstatus
	 *            UFDouble
	 */
	public void setVbillstatus(Integer newVbillstatus) {
		this.vbillstatus = newVbillstatus;
	}

	/**
	 * 属性yjhhxrq的Getter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @return UFDate
	 */
	public UFDate getYjhhxrq() {
		return yjhhxrq;
	}

	/**
	 * 属性yjhhxrq的Setter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @param newYjhhxrq
	 *            UFDate
	 */
	public void setYjhhxrq(UFDate newYjhhxrq) {
		this.yjhhxrq = newYjhhxrq;
	}

	/**
	 * 属性dapprovedate的Getter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @return UFDate
	 */
	public UFDate getDapprovedate() {
		return dapprovedate;
	}

	/**
	 * 属性dapprovedate的Setter方法. 创建日期:2014-08-13 15:40:51
	 * 
	 * @param newDapprovedate
	 *            UFDate
	 */
	public void setDapprovedate(UFDate newDapprovedate) {
		this.dapprovedate = newDapprovedate;
	}

	/**
	 * <p>
	 * 取得父VO主键字段.
	 * <p>
	 * 创建日期:2014-08-13 15:40:51
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getParentPKFieldName() {
		return null;
	}

	/**
	 * <p>
	 * 取得表主键.
	 * <p>
	 * 创建日期:2014-08-13 15:40:51
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getPKFieldName() {
		return "pk_kcfksjhid";
	}

	/**
	 * <p>
	 * 返回表名称.
	 * <p>
	 * 创建日期:2014-08-13 15:40:51
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getTableName() {
		return "LCSW_KCFKSJ_HCopy";
	}

	/**
	 * 按照默认方式创建构造子.
	 * 
	 * 创建日期:2014-08-13 15:40:51
	 */
	public KcfksjHVOC() {
		super();
	}
}
