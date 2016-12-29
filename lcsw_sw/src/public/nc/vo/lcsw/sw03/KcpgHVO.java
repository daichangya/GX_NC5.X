/***************************************************************\
 *     The skeleton of this class is generated by an automatic *
 * code generator for NC product. It is based on Velocity.     *
\***************************************************************/
package nc.vo.lcsw.sw03;

import nc.vo.pub.*;
import nc.vo.pub.lang.*;

/**
 * <b> �ڴ˴���Ҫ��������Ĺ��� </b>
 * <p>
 * �ڴ˴����Ӵ����������Ϣ
 * </p>
 * ��������:2014-08-08 11:00:47
 * 
 * @author Administrator
 * @version NCPrj 1.0
 */
@SuppressWarnings("serial")
public class KcpgHVO extends SuperVO {
	private String reserve19;
	private String reserve15;
	private String vlastbillid;
	private String pk_billtype;
	private String reserve16;
	private String reserve17;
	private String reserve18;
	private String remark;
	private String pk_jobbasfil;
	private String vlastbillrowid;
	private UFDateTime ts;
	private String vsourcebilltype;
	private String vapproveid;
	private String vapprovenote;
	private String reserve9;
	private UFDouble reserve8;
	private String pk_corp;
	private String vsourcebillno;
	private UFDouble reserve5;
	private String vbillcode;
	private String reserve4;
	private UFDouble reserve7;
	private UFDouble reserve6;
	private Integer dr;
	private String reserve1;
	private String reserve3;
	private String reserve2;
	private String pk_busitype;
	private String modifier;
	private String vlastbilltype;
	private String reserve20;
	private String vsourcebillid;
	private String kcpgry;
	private UFDate dmodify;
	private String vsourcebillrowid;
	private String voperatorid;
	private UFDate dmakedate;
	private Integer vbillstatus;
	private String pk_kcpghid;
	private UFDate kcpgrq;
	private String reserve10;
	private UFDate kcfhrq;
	private UFDate dbilldate;
	private String reserve14;
	private String reserve13;
	private UFDate dapprovedate;
	private String reserve12;
	private String reserve11;
	private String pk_bzsq;

	public static final String PK_BZSQ = "pk_bzsq";
	public static final String RESERVE19 = "reserve19";
	public static final String RESERVE15 = "reserve15";
	public static final String VLASTBILLID = "vlastbillid";
	public static final String PK_BILLTYPE = "pk_billtype";
	public static final String RESERVE16 = "reserve16";
	public static final String RESERVE17 = "reserve17";
	public static final String RESERVE18 = "reserve18";
	public static final String REMARK = "remark";
	public static final String PK_JOBBASFIL = "pk_jobbasfil";
	public static final String VLASTBILLROWID = "vlastbillrowid";
	public static final String VSOURCEBILLTYPE = "vsourcebilltype";
	public static final String VAPPROVEID = "vapproveid";
	public static final String VAPPROVENOTE = "vapprovenote";
	public static final String RESERVE9 = "reserve9";
	public static final String RESERVE8 = "reserve8";
	public static final String PK_CORP = "pk_corp";
	public static final String VSOURCEBILLNO = "vsourcebillno";
	public static final String RESERVE5 = "reserve5";
	public static final String VBILLCODE = "vbillcode";
	public static final String RESERVE4 = "reserve4";
	public static final String RESERVE7 = "reserve7";
	public static final String RESERVE6 = "reserve6";
	public static final String RESERVE1 = "reserve1";
	public static final String RESERVE3 = "reserve3";
	public static final String RESERVE2 = "reserve2";
	public static final String PK_BUSITYPE = "pk_busitype";
	public static final String MODIFIER = "modifier";
	public static final String VLASTBILLTYPE = "vlastbilltype";
	public static final String RESERVE20 = "reserve20";
	public static final String VSOURCEBILLID = "vsourcebillid";
	public static final String KCPGRY = "kcpgry";
	public static final String DMODIFY = "dmodify";
	public static final String VSOURCEBILLROWID = "vsourcebillrowid";
	public static final String VOPERATORID = "voperatorid";
	public static final String DMAKEDATE = "dmakedate";
	public static final String VBILLSTATUS = "vbillstatus";
	public static final String PK_KCPGHID = "pk_kcpghid";
	public static final String KCPGRQ = "kcpgrq";
	public static final String RESERVE10 = "reserve10";
	public static final String KCFHRQ = "kcfhrq";
	public static final String DBILLDATE = "dbilldate";
	public static final String RESERVE14 = "reserve14";
	public static final String RESERVE13 = "reserve13";
	public static final String DAPPROVEDATE = "dapprovedate";
	public static final String RESERVE12 = "reserve12";
	public static final String RESERVE11 = "reserve11";

	/**
	 * 
	 * @return String
	 */
	public String getPk_bzsq() {
		return pk_bzsq;
	}

	/**
	 * 
	 * @param newReserve19
	 *            String
	 */
	public void setPk_bzsq(String pk_bzsq) {
		this.pk_bzsq = pk_bzsq;
	}

	/**
	 * ����reserve19��Getter����. ��������:2014-08-08 11:00:47
	 * 
	 * @return String
	 */
	public String getReserve19() {
		return reserve19;
	}

	/**
	 * ����reserve19��Setter����. ��������:2014-08-08 11:00:47
	 * 
	 * @param newReserve19
	 *            String
	 */
	public void setReserve19(String newReserve19) {
		this.reserve19 = newReserve19;
	}

	/**
	 * ����reserve15��Getter����. ��������:2014-08-08 11:00:47
	 * 
	 * @return String
	 */
	public String getReserve15() {
		return reserve15;
	}

	/**
	 * ����reserve15��Setter����. ��������:2014-08-08 11:00:47
	 * 
	 * @param newReserve15
	 *            String
	 */
	public void setReserve15(String newReserve15) {
		this.reserve15 = newReserve15;
	}

	/**
	 * ����vlastbillid��Getter����. ��������:2014-08-08 11:00:47
	 * 
	 * @return String
	 */
	public String getVlastbillid() {
		return vlastbillid;
	}

	/**
	 * ����vlastbillid��Setter����. ��������:2014-08-08 11:00:47
	 * 
	 * @param newVlastbillid
	 *            String
	 */
	public void setVlastbillid(String newVlastbillid) {
		this.vlastbillid = newVlastbillid;
	}

	/**
	 * ����pk_billtype��Getter����. ��������:2014-08-08 11:00:47
	 * 
	 * @return String
	 */
	public String getPk_billtype() {
		return pk_billtype;
	}

	/**
	 * ����pk_billtype��Setter����. ��������:2014-08-08 11:00:47
	 * 
	 * @param newPk_billtype
	 *            String
	 */
	public void setPk_billtype(String newPk_billtype) {
		this.pk_billtype = newPk_billtype;
	}

	/**
	 * ����reserve16��Getter����. ��������:2014-08-08 11:00:47
	 * 
	 * @return String
	 */
	public String getReserve16() {
		return reserve16;
	}

	/**
	 * ����reserve16��Setter����. ��������:2014-08-08 11:00:47
	 * 
	 * @param newReserve16
	 *            String
	 */
	public void setReserve16(String newReserve16) {
		this.reserve16 = newReserve16;
	}

	/**
	 * ����reserve17��Getter����. ��������:2014-08-08 11:00:47
	 * 
	 * @return String
	 */
	public String getReserve17() {
		return reserve17;
	}

	/**
	 * ����reserve17��Setter����. ��������:2014-08-08 11:00:47
	 * 
	 * @param newReserve17
	 *            String
	 */
	public void setReserve17(String newReserve17) {
		this.reserve17 = newReserve17;
	}

	/**
	 * ����reserve18��Getter����. ��������:2014-08-08 11:00:47
	 * 
	 * @return String
	 */
	public String getReserve18() {
		return reserve18;
	}

	/**
	 * ����reserve18��Setter����. ��������:2014-08-08 11:00:47
	 * 
	 * @param newReserve18
	 *            String
	 */
	public void setReserve18(String newReserve18) {
		this.reserve18 = newReserve18;
	}

	/**
	 * ����remark��Getter����. ��������:2014-08-08 11:00:47
	 * 
	 * @return String
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * ����remark��Setter����. ��������:2014-08-08 11:00:47
	 * 
	 * @param newRemark
	 *            String
	 */
	public void setRemark(String newRemark) {
		this.remark = newRemark;
	}

	/**
	 * ����pk_jobbasfil��Getter����. ��������:2014-08-08 11:00:47
	 * 
	 * @return String
	 */
	public String getPk_jobbasfil() {
		return pk_jobbasfil;
	}

	/**
	 * ����pk_jobbasfil��Setter����. ��������:2014-08-08 11:00:47
	 * 
	 * @param newPk_jobbasfil
	 *            String
	 */
	public void setPk_jobbasfil(String newPk_jobbasfil) {
		this.pk_jobbasfil = newPk_jobbasfil;
	}

	/**
	 * ����vlastbillrowid��Getter����. ��������:2014-08-08 11:00:47
	 * 
	 * @return String
	 */
	public String getVlastbillrowid() {
		return vlastbillrowid;
	}

	/**
	 * ����vlastbillrowid��Setter����. ��������:2014-08-08 11:00:47
	 * 
	 * @param newVlastbillrowid
	 *            String
	 */
	public void setVlastbillrowid(String newVlastbillrowid) {
		this.vlastbillrowid = newVlastbillrowid;
	}

	/**
	 * ����ts��Getter����. ��������:2014-08-08 11:00:47
	 * 
	 * @return UFDateTime
	 */
	public UFDateTime getTs() {
		return ts;
	}

	/**
	 * ����ts��Setter����. ��������:2014-08-08 11:00:47
	 * 
	 * @param newTs
	 *            UFDateTime
	 */
	public void setTs(UFDateTime newTs) {
		this.ts = newTs;
	}

	/**
	 * ����vsourcebilltype��Getter����. ��������:2014-08-08 11:00:47
	 * 
	 * @return String
	 */
	public String getVsourcebilltype() {
		return vsourcebilltype;
	}

	/**
	 * ����vsourcebilltype��Setter����. ��������:2014-08-08 11:00:47
	 * 
	 * @param newVsourcebilltype
	 *            String
	 */
	public void setVsourcebilltype(String newVsourcebilltype) {
		this.vsourcebilltype = newVsourcebilltype;
	}

	/**
	 * ����vapproveid��Getter����. ��������:2014-08-08 11:00:47
	 * 
	 * @return String
	 */
	public String getVapproveid() {
		return vapproveid;
	}

	/**
	 * ����vapproveid��Setter����. ��������:2014-08-08 11:00:47
	 * 
	 * @param newVapproveid
	 *            String
	 */
	public void setVapproveid(String newVapproveid) {
		this.vapproveid = newVapproveid;
	}

	/**
	 * ����vapprovenote��Getter����. ��������:2014-08-08 11:00:47
	 * 
	 * @return String
	 */
	public String getVapprovenote() {
		return vapprovenote;
	}

	/**
	 * ����vapprovenote��Setter����. ��������:2014-08-08 11:00:47
	 * 
	 * @param newVapprovenote
	 *            String
	 */
	public void setVapprovenote(String newVapprovenote) {
		this.vapprovenote = newVapprovenote;
	}

	/**
	 * ����reserve9��Getter����. ��������:2014-08-08 11:00:47
	 * 
	 * @return String
	 */
	public String getReserve9() {
		return reserve9;
	}

	/**
	 * ����reserve9��Setter����. ��������:2014-08-08 11:00:47
	 * 
	 * @param newReserve9
	 *            String
	 */
	public void setReserve9(String newReserve9) {
		this.reserve9 = newReserve9;
	}

	/**
	 * ����reserve8��Getter����. ��������:2014-08-08 11:00:47
	 * 
	 * @return UFDouble
	 */
	public UFDouble getReserve8() {
		return reserve8;
	}

	/**
	 * ����reserve8��Setter����. ��������:2014-08-08 11:00:47
	 * 
	 * @param newReserve8
	 *            UFDouble
	 */
	public void setReserve8(UFDouble newReserve8) {
		this.reserve8 = newReserve8;
	}

	/**
	 * ����pk_corp��Getter����. ��������:2014-08-08 11:00:47
	 * 
	 * @return String
	 */
	public String getPk_corp() {
		return pk_corp;
	}

	/**
	 * ����pk_corp��Setter����. ��������:2014-08-08 11:00:47
	 * 
	 * @param newPk_corp
	 *            String
	 */
	public void setPk_corp(String newPk_corp) {
		this.pk_corp = newPk_corp;
	}

	/**
	 * ����vsourcebillno��Getter����. ��������:2014-08-08 11:00:47
	 * 
	 * @return String
	 */
	public String getVsourcebillno() {
		return vsourcebillno;
	}

	/**
	 * ����vsourcebillno��Setter����. ��������:2014-08-08 11:00:47
	 * 
	 * @param newVsourcebillno
	 *            String
	 */
	public void setVsourcebillno(String newVsourcebillno) {
		this.vsourcebillno = newVsourcebillno;
	}

	/**
	 * ����reserve5��Getter����. ��������:2014-08-08 11:00:47
	 * 
	 * @return UFDouble
	 */
	public UFDouble getReserve5() {
		return reserve5;
	}

	/**
	 * ����reserve5��Setter����. ��������:2014-08-08 11:00:47
	 * 
	 * @param newReserve5
	 *            UFDouble
	 */
	public void setReserve5(UFDouble newReserve5) {
		this.reserve5 = newReserve5;
	}

	/**
	 * ����vbillcode��Getter����. ��������:2014-08-08 11:00:47
	 * 
	 * @return String
	 */
	public String getVbillcode() {
		return vbillcode;
	}

	/**
	 * ����vbillcode��Setter����. ��������:2014-08-08 11:00:47
	 * 
	 * @param newVbillcode
	 *            String
	 */
	public void setVbillcode(String newVbillcode) {
		this.vbillcode = newVbillcode;
	}

	/**
	 * ����reserve4��Getter����. ��������:2014-08-08 11:00:47
	 * 
	 * @return String
	 */
	public String getReserve4() {
		return reserve4;
	}

	/**
	 * ����reserve4��Setter����. ��������:2014-08-08 11:00:47
	 * 
	 * @param newReserve4
	 *            String
	 */
	public void setReserve4(String newReserve4) {
		this.reserve4 = newReserve4;
	}

	/**
	 * ����reserve7��Getter����. ��������:2014-08-08 11:00:47
	 * 
	 * @return UFDouble
	 */
	public UFDouble getReserve7() {
		return reserve7;
	}

	/**
	 * ����reserve7��Setter����. ��������:2014-08-08 11:00:47
	 * 
	 * @param newReserve7
	 *            UFDouble
	 */
	public void setReserve7(UFDouble newReserve7) {
		this.reserve7 = newReserve7;
	}

	/**
	 * ����reserve6��Getter����. ��������:2014-08-08 11:00:47
	 * 
	 * @return UFDouble
	 */
	public UFDouble getReserve6() {
		return reserve6;
	}

	/**
	 * ����reserve6��Setter����. ��������:2014-08-08 11:00:47
	 * 
	 * @param newReserve6
	 *            UFDouble
	 */
	public void setReserve6(UFDouble newReserve6) {
		this.reserve6 = newReserve6;
	}

	/**
	 * ����dr��Getter����. ��������:2014-08-08 11:00:47
	 * 
	 * @return UFDouble
	 */
	public Integer getDr() {
		return dr;
	}

	/**
	 * ����dr��Setter����. ��������:2014-08-08 11:00:47
	 * 
	 * @param newDr
	 *            UFDouble
	 */
	public void setDr(Integer newDr) {
		this.dr = newDr;
	}

	/**
	 * ����reserve1��Getter����. ��������:2014-08-08 11:00:47
	 * 
	 * @return String
	 */
	public String getReserve1() {
		return reserve1;
	}

	/**
	 * ����reserve1��Setter����. ��������:2014-08-08 11:00:47
	 * 
	 * @param newReserve1
	 *            String
	 */
	public void setReserve1(String newReserve1) {
		this.reserve1 = newReserve1;
	}

	/**
	 * ����reserve3��Getter����. ��������:2014-08-08 11:00:47
	 * 
	 * @return String
	 */
	public String getReserve3() {
		return reserve3;
	}

	/**
	 * ����reserve3��Setter����. ��������:2014-08-08 11:00:47
	 * 
	 * @param newReserve3
	 *            String
	 */
	public void setReserve3(String newReserve3) {
		this.reserve3 = newReserve3;
	}

	/**
	 * ����reserve2��Getter����. ��������:2014-08-08 11:00:47
	 * 
	 * @return String
	 */
	public String getReserve2() {
		return reserve2;
	}

	/**
	 * ����reserve2��Setter����. ��������:2014-08-08 11:00:47
	 * 
	 * @param newReserve2
	 *            String
	 */
	public void setReserve2(String newReserve2) {
		this.reserve2 = newReserve2;
	}

	/**
	 * ����pk_busitype��Getter����. ��������:2014-08-08 11:00:47
	 * 
	 * @return String
	 */
	public String getPk_busitype() {
		return pk_busitype;
	}

	/**
	 * ����pk_busitype��Setter����. ��������:2014-08-08 11:00:47
	 * 
	 * @param newPk_busitype
	 *            String
	 */
	public void setPk_busitype(String newPk_busitype) {
		this.pk_busitype = newPk_busitype;
	}

	/**
	 * ����modifier��Getter����. ��������:2014-08-08 11:00:47
	 * 
	 * @return String
	 */
	public String getModifier() {
		return modifier;
	}

	/**
	 * ����modifier��Setter����. ��������:2014-08-08 11:00:47
	 * 
	 * @param newModifier
	 *            String
	 */
	public void setModifier(String newModifier) {
		this.modifier = newModifier;
	}

	/**
	 * ����vlastbilltype��Getter����. ��������:2014-08-08 11:00:47
	 * 
	 * @return String
	 */
	public String getVlastbilltype() {
		return vlastbilltype;
	}

	/**
	 * ����vlastbilltype��Setter����. ��������:2014-08-08 11:00:47
	 * 
	 * @param newVlastbilltype
	 *            String
	 */
	public void setVlastbilltype(String newVlastbilltype) {
		this.vlastbilltype = newVlastbilltype;
	}

	/**
	 * ����reserve20��Getter����. ��������:2014-08-08 11:00:47
	 * 
	 * @return String
	 */
	public String getReserve20() {
		return reserve20;
	}

	/**
	 * ����reserve20��Setter����. ��������:2014-08-08 11:00:47
	 * 
	 * @param newReserve20
	 *            String
	 */
	public void setReserve20(String newReserve20) {
		this.reserve20 = newReserve20;
	}

	/**
	 * ����vsourcebillid��Getter����. ��������:2014-08-08 11:00:47
	 * 
	 * @return String
	 */
	public String getVsourcebillid() {
		return vsourcebillid;
	}

	/**
	 * ����vsourcebillid��Setter����. ��������:2014-08-08 11:00:47
	 * 
	 * @param newVsourcebillid
	 *            String
	 */
	public void setVsourcebillid(String newVsourcebillid) {
		this.vsourcebillid = newVsourcebillid;
	}

	/**
	 * ����kcpgry��Getter����. ��������:2014-08-08 11:00:47
	 * 
	 * @return String
	 */
	public String getKcpgry() {
		return kcpgry;
	}

	/**
	 * ����kcpgry��Setter����. ��������:2014-08-08 11:00:47
	 * 
	 * @param newKcpgry
	 *            String
	 */
	public void setKcpgry(String newKcpgry) {
		this.kcpgry = newKcpgry;
	}

	/**
	 * ����dmodify��Getter����. ��������:2014-08-08 11:00:47
	 * 
	 * @return UFDate
	 */
	public UFDate getDmodify() {
		return dmodify;
	}

	/**
	 * ����dmodify��Setter����. ��������:2014-08-08 11:00:47
	 * 
	 * @param newDmodify
	 *            UFDate
	 */
	public void setDmodify(UFDate newDmodify) {
		this.dmodify = newDmodify;
	}

	/**
	 * ����vsourcebillrowid��Getter����. ��������:2014-08-08 11:00:47
	 * 
	 * @return String
	 */
	public String getVsourcebillrowid() {
		return vsourcebillrowid;
	}

	/**
	 * ����vsourcebillrowid��Setter����. ��������:2014-08-08 11:00:47
	 * 
	 * @param newVsourcebillrowid
	 *            String
	 */
	public void setVsourcebillrowid(String newVsourcebillrowid) {
		this.vsourcebillrowid = newVsourcebillrowid;
	}

	/**
	 * ����voperatorid��Getter����. ��������:2014-08-08 11:00:47
	 * 
	 * @return String
	 */
	public String getVoperatorid() {
		return voperatorid;
	}

	/**
	 * ����voperatorid��Setter����. ��������:2014-08-08 11:00:47
	 * 
	 * @param newVoperatorid
	 *            String
	 */
	public void setVoperatorid(String newVoperatorid) {
		this.voperatorid = newVoperatorid;
	}

	/**
	 * ����dmakedate��Getter����. ��������:2014-08-08 11:00:47
	 * 
	 * @return UFDate
	 */
	public UFDate getDmakedate() {
		return dmakedate;
	}

	/**
	 * ����dmakedate��Setter����. ��������:2014-08-08 11:00:47
	 * 
	 * @param newDmakedate
	 *            UFDate
	 */
	public void setDmakedate(UFDate newDmakedate) {
		this.dmakedate = newDmakedate;
	}

	/**
	 * ����vbillstatus��Getter����. ��������:2014-08-08 11:00:47
	 * 
	 * @return UFDouble
	 */
	public Integer getVbillstatus() {
		return vbillstatus;
	}

	/**
	 * ����vbillstatus��Setter����. ��������:2014-08-08 11:00:47
	 * 
	 * @param newVbillstatus
	 *            UFDouble
	 */
	public void setVbillstatus(Integer newVbillstatus) {
		this.vbillstatus = newVbillstatus;
	}

	/**
	 * ����pk_kcpghid��Getter����. ��������:2014-08-08 11:00:47
	 * 
	 * @return String
	 */
	public String getPk_kcpghid() {
		return pk_kcpghid;
	}

	/**
	 * ����pk_kcpghid��Setter����. ��������:2014-08-08 11:00:47
	 * 
	 * @param newPk_kcpghid
	 *            String
	 */
	public void setPk_kcpghid(String newPk_kcpghid) {
		this.pk_kcpghid = newPk_kcpghid;
	}

	/**
	 * ����kcpgrq��Getter����. ��������:2014-08-08 11:00:47
	 * 
	 * @return UFDate
	 */
	public UFDate getKcpgrq() {
		return kcpgrq;
	}

	/**
	 * ����kcpgrq��Setter����. ��������:2014-08-08 11:00:47
	 * 
	 * @param newKcpgrq
	 *            UFDate
	 */
	public void setKcpgrq(UFDate newKcpgrq) {
		this.kcpgrq = newKcpgrq;
	}

	/**
	 * ����reserve10��Getter����. ��������:2014-08-08 11:00:47
	 * 
	 * @return String
	 */
	public String getReserve10() {
		return reserve10;
	}

	/**
	 * ����reserve10��Setter����. ��������:2014-08-08 11:00:47
	 * 
	 * @param newReserve10
	 *            String
	 */
	public void setReserve10(String newReserve10) {
		this.reserve10 = newReserve10;
	}

	/**
	 * ����kcfhrq��Getter����. ��������:2014-08-08 11:00:47
	 * 
	 * @return UFDate
	 */
	public UFDate getKcfhrq() {
		return kcfhrq;
	}

	/**
	 * ����kcfhrq��Setter����. ��������:2014-08-08 11:00:47
	 * 
	 * @param newKcfhrq
	 *            UFDate
	 */
	public void setKcfhrq(UFDate newKcfhrq) {
		this.kcfhrq = newKcfhrq;
	}

	/**
	 * ����dbilldate��Getter����. ��������:2014-08-08 11:00:47
	 * 
	 * @return UFDate
	 */
	public UFDate getDbilldate() {
		return dbilldate;
	}

	/**
	 * ����dbilldate��Setter����. ��������:2014-08-08 11:00:47
	 * 
	 * @param newDbilldate
	 *            UFDate
	 */
	public void setDbilldate(UFDate newDbilldate) {
		this.dbilldate = newDbilldate;
	}

	/**
	 * ����reserve14��Getter����. ��������:2014-08-08 11:00:47
	 * 
	 * @return String
	 */
	public String getReserve14() {
		return reserve14;
	}

	/**
	 * ����reserve14��Setter����. ��������:2014-08-08 11:00:47
	 * 
	 * @param newReserve14
	 *            String
	 */
	public void setReserve14(String newReserve14) {
		this.reserve14 = newReserve14;
	}

	/**
	 * ����reserve13��Getter����. ��������:2014-08-08 11:00:47
	 * 
	 * @return String
	 */
	public String getReserve13() {
		return reserve13;
	}

	/**
	 * ����reserve13��Setter����. ��������:2014-08-08 11:00:47
	 * 
	 * @param newReserve13
	 *            String
	 */
	public void setReserve13(String newReserve13) {
		this.reserve13 = newReserve13;
	}

	/**
	 * ����dapprovedate��Getter����. ��������:2014-08-08 11:00:47
	 * 
	 * @return UFDate
	 */
	public UFDate getDapprovedate() {
		return dapprovedate;
	}

	/**
	 * ����dapprovedate��Setter����. ��������:2014-08-08 11:00:47
	 * 
	 * @param newDapprovedate
	 *            UFDate
	 */
	public void setDapprovedate(UFDate newDapprovedate) {
		this.dapprovedate = newDapprovedate;
	}

	/**
	 * ����reserve12��Getter����. ��������:2014-08-08 11:00:47
	 * 
	 * @return String
	 */
	public String getReserve12() {
		return reserve12;
	}

	/**
	 * ����reserve12��Setter����. ��������:2014-08-08 11:00:47
	 * 
	 * @param newReserve12
	 *            String
	 */
	public void setReserve12(String newReserve12) {
		this.reserve12 = newReserve12;
	}

	/**
	 * ����reserve11��Getter����. ��������:2014-08-08 11:00:47
	 * 
	 * @return String
	 */
	public String getReserve11() {
		return reserve11;
	}

	/**
	 * ����reserve11��Setter����. ��������:2014-08-08 11:00:47
	 * 
	 * @param newReserve11
	 *            String
	 */
	public void setReserve11(String newReserve11) {
		this.reserve11 = newReserve11;
	}

	/**
	 * <p>
	 * ȡ�ø�VO�����ֶ�.
	 * <p>
	 * ��������:2014-08-08 11:00:47
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getParentPKFieldName() {
		return null;
	}

	/**
	 * <p>
	 * ȡ�ñ�����.
	 * <p>
	 * ��������:2014-08-08 11:00:47
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getPKFieldName() {
		return "pk_kcpghid";
	}

	/**
	 * <p>
	 * ���ر�����.
	 * <p>
	 * ��������:2014-08-08 11:00:47
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getTableName() {
		return "LCSW_KCPG_H";
	}

	/**
	 * ����Ĭ�Ϸ�ʽ����������.
	 * 
	 * ��������:2014-08-08 11:00:47
	 */
	public KcpgHVO() {
		super();
	}
}