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
 * 创建日期:2014-08-13 15:40:32
 * 
 * @author Administrator
 * @version NCPrj 1.0
 */
@SuppressWarnings("serial")
public class KcfksjBVO extends SuperVO {
	private UFDate yqxgrq;
	private String reserve19;
	private UFDate yjsjrq;
	private String reserve15;
	private String reserve16;
	private String reserve17;
	private String reserve18;
	private UFDate jhxtrq;
	private String remark;
	private String pk_jobbasfil;
	private String pk_kcfksjhid;
	private Integer wgyqts;
	private UFDateTime ts;
	private String reserve9;
	private UFDouble reserve8;
	private UFDouble reserve5;
	private String reserve4;
	private UFDouble reserve7;
	private UFDouble reserve6;
	private String pk_bzxx;
	private Integer dr;
	private String reserve1;
	private UFDate kcfkrq;
	private String reserve3;
	private String reserve2;
	private UFDate yjsjpsrq;
	private String reserve20;
	private UFDate kcrq;
	private String kcsjry;
	private String yqxgr;
	private String pk_kcfksjbid;
	private String kcry;
	private String jbry;
	private UFDate yjhhxrq;
	private UFDate sjpswcrq;
	private String reserve10;
	private String reserve14;
	private String reserve13;
	private String reserve12;
	private String reserve11;
	private String pk_bzsq;
	private String hm;
	private String pk_corp;
	private String zgsyz;
	private String zdsyz;

	public static final String ZDSYZ = "zdsyz";
	public static final String ZGSYZ = "zgsyz";
	public static final String PK_CORP = "pk_corp";
	public static final String HM = "hm";
	public static final String PK_BZSQ = "pk_bzsq";

	public static final String YQXGRQ = "yqxgrq";
	public static final String RESERVE19 = "reserve19";
	public static final String YJSJRQ = "yjsjrq";
	public static final String RESERVE15 = "reserve15";
	public static final String RESERVE16 = "reserve16";
	public static final String RESERVE17 = "reserve17";
	public static final String RESERVE18 = "reserve18";
	public static final String JHXTRQ = "jhxtrq";
	public static final String REMARK = "remark";
	public static final String PK_JOBBASFIL = "pk_jobbasfil";
	public static final String PK_KCFKSJHID = "pk_kcfksjhid";
	public static final String WGYQTS = "wgyqts";
	public static final String RESERVE9 = "reserve9";
	public static final String RESERVE8 = "reserve8";
	public static final String RESERVE5 = "reserve5";
	public static final String RESERVE4 = "reserve4";
	public static final String RESERVE7 = "reserve7";
	public static final String RESERVE6 = "reserve6";
	public static final String PK_BZXX = "pk_bzxx";
	public static final String RESERVE1 = "reserve1";
	public static final String KCFKRQ = "kcfkrq";
	public static final String RESERVE3 = "reserve3";
	public static final String RESERVE2 = "reserve2";
	public static final String YJSJPSRQ = "yjsjpsrq";
	public static final String RESERVE20 = "reserve20";
	public static final String KCRQ = "kcrq";
	public static final String KCSJRY = "kcsjry";
	public static final String YQXGR = "yqxgr";
	public static final String PK_KCFKSJBID = "pk_kcfksjbid";
	public static final String KCRY = "kcry";
	public static final String JBRY = "jbry";
	public static final String YJHHXRQ = "yjhhxrq";
	public static final String SJPSWCRQ = "sjpswcrq";
	public static final String RESERVE10 = "reserve10";
	public static final String RESERVE14 = "reserve14";
	public static final String RESERVE13 = "reserve13";
	public static final String RESERVE12 = "reserve12";
	public static final String RESERVE11 = "reserve11";

	/**
	 * 最高水压
	 */
	public String getZgsyz() {
		return zgsyz;
	}

	/**
	 * 最高水压
	 */
	public void setZgsyz(String zgsyz) {
		this.zgsyz = zgsyz;
	}

	/**
	 * 最低水压
	 */
	public String getZdsyz() {
		return zdsyz;
	}

	/**
	 * 最低水压
	 */
	public void setZdsyz(String zdsyz) {
		this.zdsyz = zdsyz;
	}

	/**
	 * 属性pk_corp的Getter方法. 创建日期:2014-08-08 11:00:47
	 * 
	 * @return String
	 */
	public String getPk_corp() {
		return pk_corp;
	}

	/**
	 * 属性pk_corp的Setter方法. 创建日期:2014-08-08 11:00:47
	 * 
	 * @param newPk_corp
	 *            String
	 */
	public void setPk_corp(String newPk_corp) {
		this.pk_corp = newPk_corp;
	}

	/**
	 * 
	 * @return String
	 */
	public String getHm() {
		return hm;
	}

	/**
	 * 
	 * @param newReserve19
	 *            String
	 */
	public void setHm(String hm) {
		this.hm = hm;
	}

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
	 * 属性yqxgrq的Getter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @return UFDate
	 */
	public UFDate getYqxgrq() {
		return yqxgrq;
	}

	/**
	 * 属性yqxgrq的Setter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @param newYqxgrq
	 *            UFDate
	 */
	public void setYqxgrq(UFDate newYqxgrq) {
		this.yqxgrq = newYqxgrq;
	}

	/**
	 * 属性reserve19的Getter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @return String
	 */
	public String getReserve19() {
		return reserve19;
	}

	/**
	 * 属性reserve19的Setter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @param newReserve19
	 *            String
	 */
	public void setReserve19(String newReserve19) {
		this.reserve19 = newReserve19;
	}

	/**
	 * 属性yjsjrq的Getter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @return UFDate
	 */
	public UFDate getYjsjrq() {
		return yjsjrq;
	}

	/**
	 * 属性yjsjrq的Setter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @param newYjsjrq
	 *            UFDate
	 */
	public void setYjsjrq(UFDate newYjsjrq) {
		this.yjsjrq = newYjsjrq;
	}

	/**
	 * 属性reserve15的Getter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @return String
	 */
	public String getReserve15() {
		return reserve15;
	}

	/**
	 * 属性reserve15的Setter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @param newReserve15
	 *            String
	 */
	public void setReserve15(String newReserve15) {
		this.reserve15 = newReserve15;
	}

	/**
	 * 属性reserve16的Getter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @return String
	 */
	public String getReserve16() {
		return reserve16;
	}

	/**
	 * 属性reserve16的Setter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @param newReserve16
	 *            String
	 */
	public void setReserve16(String newReserve16) {
		this.reserve16 = newReserve16;
	}

	/**
	 * 属性reserve17的Getter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @return String
	 */
	public String getReserve17() {
		return reserve17;
	}

	/**
	 * 属性reserve17的Setter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @param newReserve17
	 *            String
	 */
	public void setReserve17(String newReserve17) {
		this.reserve17 = newReserve17;
	}

	/**
	 * 属性reserve18的Getter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @return String
	 */
	public String getReserve18() {
		return reserve18;
	}

	/**
	 * 属性reserve18的Setter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @param newReserve18
	 *            String
	 */
	public void setReserve18(String newReserve18) {
		this.reserve18 = newReserve18;
	}

	/**
	 * 属性jhxtrq的Getter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @return UFDate
	 */
	public UFDate getJhxtrq() {
		return jhxtrq;
	}

	/**
	 * 属性jhxtrq的Setter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @param newJhxtrq
	 *            UFDate
	 */
	public void setJhxtrq(UFDate newJhxtrq) {
		this.jhxtrq = newJhxtrq;
	}

	/**
	 * 属性remark的Getter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @return String
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * 属性remark的Setter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @param newRemark
	 *            String
	 */
	public void setRemark(String newRemark) {
		this.remark = newRemark;
	}

	/**
	 * 属性pk_jobbasfil的Getter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @return String
	 */
	public String getPk_jobbasfil() {
		return pk_jobbasfil;
	}

	/**
	 * 属性pk_jobbasfil的Setter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @param newPk_jobbasfil
	 *            String
	 */
	public void setPk_jobbasfil(String newPk_jobbasfil) {
		this.pk_jobbasfil = newPk_jobbasfil;
	}

	/**
	 * 属性pk_kcfksjhid的Getter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @return String
	 */
	public String getPk_kcfksjhid() {
		return pk_kcfksjhid;
	}

	/**
	 * 属性pk_kcfksjhid的Setter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @param newPk_kcfksjhid
	 *            String
	 */
	public void setPk_kcfksjhid(String newPk_kcfksjhid) {
		this.pk_kcfksjhid = newPk_kcfksjhid;
	}

	/**
	 * 属性wgyqts的Getter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @return UFDouble
	 */
	public Integer getWgyqts() {
		return wgyqts;
	}

	/**
	 * 属性wgyqts的Setter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @param newWgyqts
	 *            UFDouble
	 */
	public void setWgyqts(Integer newWgyqts) {
		this.wgyqts = newWgyqts;
	}

	/**
	 * 属性ts的Getter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @return UFDateTime
	 */
	public UFDateTime getTs() {
		return ts;
	}

	/**
	 * 属性ts的Setter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @param newTs
	 *            UFDateTime
	 */
	public void setTs(UFDateTime newTs) {
		this.ts = newTs;
	}

	/**
	 * 属性reserve9的Getter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @return String
	 */
	public String getReserve9() {
		return reserve9;
	}

	/**
	 * 属性reserve9的Setter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @param newReserve9
	 *            String
	 */
	public void setReserve9(String newReserve9) {
		this.reserve9 = newReserve9;
	}

	/**
	 * 属性reserve8的Getter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @return UFDouble
	 */
	public UFDouble getReserve8() {
		return reserve8;
	}

	/**
	 * 属性reserve8的Setter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @param newReserve8
	 *            UFDouble
	 */
	public void setReserve8(UFDouble newReserve8) {
		this.reserve8 = newReserve8;
	}

	/**
	 * 属性reserve5的Getter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @return UFDouble
	 */
	public UFDouble getReserve5() {
		return reserve5;
	}

	/**
	 * 属性reserve5的Setter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @param newReserve5
	 *            UFDouble
	 */
	public void setReserve5(UFDouble newReserve5) {
		this.reserve5 = newReserve5;
	}

	/**
	 * 属性reserve4的Getter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @return String
	 */
	public String getReserve4() {
		return reserve4;
	}

	/**
	 * 属性reserve4的Setter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @param newReserve4
	 *            String
	 */
	public void setReserve4(String newReserve4) {
		this.reserve4 = newReserve4;
	}

	/**
	 * 属性reserve7的Getter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @return UFDouble
	 */
	public UFDouble getReserve7() {
		return reserve7;
	}

	/**
	 * 属性reserve7的Setter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @param newReserve7
	 *            UFDouble
	 */
	public void setReserve7(UFDouble newReserve7) {
		this.reserve7 = newReserve7;
	}

	/**
	 * 属性reserve6的Getter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @return UFDouble
	 */
	public UFDouble getReserve6() {
		return reserve6;
	}

	/**
	 * 属性reserve6的Setter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @param newReserve6
	 *            UFDouble
	 */
	public void setReserve6(UFDouble newReserve6) {
		this.reserve6 = newReserve6;
	}

	/**
	 * 属性pk_bzxx的Getter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @return String
	 */
	public String getPk_bzxx() {
		return pk_bzxx;
	}

	/**
	 * 属性pk_bzxx的Setter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @param newPk_bzxx
	 *            String
	 */
	public void setPk_bzxx(String newPk_bzxx) {
		this.pk_bzxx = newPk_bzxx;
	}

	/**
	 * 属性dr的Getter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @return UFDouble
	 */
	public Integer getDr() {
		return dr;
	}

	/**
	 * 属性dr的Setter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @param newDr
	 *            UFDouble
	 */
	public void setDr(Integer newDr) {
		this.dr = newDr;
	}

	/**
	 * 属性reserve1的Getter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @return String
	 */
	public String getReserve1() {
		return reserve1;
	}

	/**
	 * 属性reserve1的Setter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @param newReserve1
	 *            String
	 */
	public void setReserve1(String newReserve1) {
		this.reserve1 = newReserve1;
	}

	/**
	 * 属性kcfkrq的Getter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @return UFDate
	 */
	public UFDate getKcfkrq() {
		return kcfkrq;
	}

	/**
	 * 属性kcfkrq的Setter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @param newKcfkrq
	 *            UFDate
	 */
	public void setKcfkrq(UFDate newKcfkrq) {
		this.kcfkrq = newKcfkrq;
	}

	/**
	 * 属性reserve3的Getter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @return String
	 */
	public String getReserve3() {
		return reserve3;
	}

	/**
	 * 属性reserve3的Setter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @param newReserve3
	 *            String
	 */
	public void setReserve3(String newReserve3) {
		this.reserve3 = newReserve3;
	}

	/**
	 * 属性reserve2的Getter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @return String
	 */
	public String getReserve2() {
		return reserve2;
	}

	/**
	 * 属性reserve2的Setter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @param newReserve2
	 *            String
	 */
	public void setReserve2(String newReserve2) {
		this.reserve2 = newReserve2;
	}

	/**
	 * 属性yjsjpsrq的Getter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @return UFDate
	 */
	public UFDate getYjsjpsrq() {
		return yjsjpsrq;
	}

	/**
	 * 属性yjsjpsrq的Setter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @param newYjsjpsrq
	 *            UFDate
	 */
	public void setYjsjpsrq(UFDate newYjsjpsrq) {
		this.yjsjpsrq = newYjsjpsrq;
	}

	/**
	 * 属性reserve20的Getter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @return String
	 */
	public String getReserve20() {
		return reserve20;
	}

	/**
	 * 属性reserve20的Setter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @param newReserve20
	 *            String
	 */
	public void setReserve20(String newReserve20) {
		this.reserve20 = newReserve20;
	}

	/**
	 * 属性kcrq的Getter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @return UFDate
	 */
	public UFDate getKcrq() {
		return kcrq;
	}

	/**
	 * 属性kcrq的Setter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @param newKcrq
	 *            UFDate
	 */
	public void setKcrq(UFDate newKcrq) {
		this.kcrq = newKcrq;
	}

	/**
	 * 属性kcsjry的Getter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @return String
	 */
	public String getKcsjry() {
		return kcsjry;
	}

	/**
	 * 属性kcsjry的Setter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @param newKcsjry
	 *            String
	 */
	public void setKcsjry(String newKcsjry) {
		this.kcsjry = newKcsjry;
	}

	/**
	 * 属性yqxgr的Getter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @return String
	 */
	public String getYqxgr() {
		return yqxgr;
	}

	/**
	 * 属性yqxgr的Setter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @param newYqxgr
	 *            String
	 */
	public void setYqxgr(String newYqxgr) {
		this.yqxgr = newYqxgr;
	}

	/**
	 * 属性pk_kcfksjbid的Getter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @return String
	 */
	public String getPk_kcfksjbid() {
		return pk_kcfksjbid;
	}

	/**
	 * 属性pk_kcfksjbid的Setter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @param newPk_kcfksjbid
	 *            String
	 */
	public void setPk_kcfksjbid(String newPk_kcfksjbid) {
		this.pk_kcfksjbid = newPk_kcfksjbid;
	}

	/**
	 * 属性kcry的Getter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @return String
	 */
	public String getKcry() {
		return kcry;
	}

	/**
	 * 属性kcry的Setter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @param newKcry
	 *            String
	 */
	public void setKcry(String newKcry) {
		this.kcry = newKcry;
	}

	/**
	 * 属性jbry的Getter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @return String
	 */
	public String getJbry() {
		return jbry;
	}

	/**
	 * 属性jbry的Setter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @param newJbry
	 *            String
	 */
	public void setJbry(String newJbry) {
		this.jbry = newJbry;
	}

	/**
	 * 属性yjhhxrq的Getter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @return UFDate
	 */
	public UFDate getYjhhxrq() {
		return yjhhxrq;
	}

	/**
	 * 属性yjhhxrq的Setter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @param newYjhhxrq
	 *            UFDate
	 */
	public void setYjhhxrq(UFDate newYjhhxrq) {
		this.yjhhxrq = newYjhhxrq;
	}

	/**
	 * 属性sjpswcrq的Getter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @return UFDate
	 */
	public UFDate getSjpswcrq() {
		return sjpswcrq;
	}

	/**
	 * 属性sjpswcrq的Setter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @param newSjpswcrq
	 *            UFDate
	 */
	public void setSjpswcrq(UFDate newSjpswcrq) {
		this.sjpswcrq = newSjpswcrq;
	}

	/**
	 * 属性reserve10的Getter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @return String
	 */
	public String getReserve10() {
		return reserve10;
	}

	/**
	 * 属性reserve10的Setter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @param newReserve10
	 *            String
	 */
	public void setReserve10(String newReserve10) {
		this.reserve10 = newReserve10;
	}

	/**
	 * 属性reserve14的Getter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @return String
	 */
	public String getReserve14() {
		return reserve14;
	}

	/**
	 * 属性reserve14的Setter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @param newReserve14
	 *            String
	 */
	public void setReserve14(String newReserve14) {
		this.reserve14 = newReserve14;
	}

	/**
	 * 属性reserve13的Getter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @return String
	 */
	public String getReserve13() {
		return reserve13;
	}

	/**
	 * 属性reserve13的Setter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @param newReserve13
	 *            String
	 */
	public void setReserve13(String newReserve13) {
		this.reserve13 = newReserve13;
	}

	/**
	 * 属性reserve12的Getter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @return String
	 */
	public String getReserve12() {
		return reserve12;
	}

	/**
	 * 属性reserve12的Setter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @param newReserve12
	 *            String
	 */
	public void setReserve12(String newReserve12) {
		this.reserve12 = newReserve12;
	}

	/**
	 * 属性reserve11的Getter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @return String
	 */
	public String getReserve11() {
		return reserve11;
	}

	/**
	 * 属性reserve11的Setter方法. 创建日期:2014-08-13 15:40:32
	 * 
	 * @param newReserve11
	 *            String
	 */
	public void setReserve11(String newReserve11) {
		this.reserve11 = newReserve11;
	}

	/**
	 * <p>
	 * 取得父VO主键字段.
	 * <p>
	 * 创建日期:2014-08-13 15:40:32
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
	 * 创建日期:2014-08-13 15:40:32
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getPKFieldName() {
		return "pk_kcfksjbid";
	}

	/**
	 * <p>
	 * 返回表名称.
	 * <p>
	 * 创建日期:2014-08-13 15:40:32
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getTableName() {
		return "LCSW_KCFKSJ_B";
	}

	/**
	 * 按照默认方式创建构造子.
	 * 
	 * 创建日期:2014-08-13 15:40:32
	 */
	public KcfksjBVO() {
		super();
	}
}
