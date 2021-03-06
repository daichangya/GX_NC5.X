package nc.vo.lcsw.sw07;
/** 
 * <b> 在此处简要描述此类的功能  </b>
 * <p>
 *     在此处添加此类的描述信息 
 * <p>
 * @author 梁展轩
 * <b>创建时间: 2014-09-03 17:11:19</b>
 * 
 * 
*/ 
import nc.vo.pub.lang.*;
import nc.vo.pub.*;

@SuppressWarnings("serial")
public class AzxxfkHVOC extends SuperVO {
	private String ysdh;
	private String vlastbillid;
	private String reserve10;
	private String reserve11;
	private String remark;
	private String reserve12;
	private String reserve13;
	private String reserve14;
	private UFDate dmakedate;
	private String vsourcebillno;
	private String vlastbillrowid;
	private UFDate yqxgrq;
	private UFDate jgrq;
	private String pk_billtype;
	private String reserve20;
	private UFDate yjazrq;
	private String hth;
	private UFDouble reserve7;
	private UFDouble reserve6;
	private UFDouble reserve5;
	private String reserve4;
	private String reserve9;
	private UFDouble reserve8;
	private String reserve3;
	private String reserve2;
	private UFDate azrq;
	private UFDate zlfkrq;
	private String reserve1;
	private String modifier;
	private String reserve18;
	private UFDate dbilldate;
	private String reserve17;
	private String reserve16;
	private String reserve15;
	private String reserve19;
	private String vlastbilltype;
	private String ysry;
	private String yqxgr;
	private String voperatorid;
	private String vapprovenote;
	private UFDate dmodify;
	private String vapproveid;
	private String pk_busitype;
	private Integer wgyqts;
	private String pk_corp;
	private UFDate azfkrq;
	private String vsourcebilltype;
	private String pk_jobbasfil;
	private String vbillcode;
	private Integer vbillstatus;
	private UFDate dapprovedate;
	private String vsourcebillrowid;
	private String vsourcebillid;
	private String pk_azxxfkhid;
	private UFDateTime ts;
	private Integer dr;
	
	private UFDate kgrq;
	private UFDate zbrq;
	private UFDate yjbwysrq;
	private String sgbm;
	private String sgfzr;
	private String sglxdh;
	private String azbj;
	private String ckxd;
	private String ld;
	private String ldqd;
	private String ldzd;
	private String sggcai;
	private UFDouble sggchang;
	private String biaoma;
	private String chandi;
	private String bianma;
	private String biaobie;
	private String biaowei;
	private UFBoolean sfyjsy;
	private String sjth;
	
	//add by crf 2015-07-08 [计划安装工期]、[计划安装完成日期]、[实际安装工期]
	private Integer jhazgq;
	private UFDate jhazwcrq;
	private Integer sjazgq;
	public Integer getJhazgq() {
		return jhazgq;
	}
	public void setJhazgq(Integer jhazgq) {
		this.jhazgq = jhazgq;
	}
	public UFDate getJhazwcrq() {
		return jhazwcrq;
	}
	public void setJhazwcrq(UFDate jhazwcrq) {
		this.jhazwcrq = jhazwcrq;
	}
	public Integer getSjazgq() {
		return sjazgq;
	}
	public void setSjazgq(Integer sjazgq) {
		this.sjazgq = sjazgq;
	}
	//end
	public UFBoolean getSfyjsy() {
		return sfyjsy;
	}
	public void setSfyjsy(UFBoolean sfyjsy) {
		this.sfyjsy = sfyjsy;
	}
	
	public String getSjth() {
		return sjth;
	}
	public void setSjth(String sjth) {
		this.sjth = sjth;
	}

	public static final String SJTH = "sjth";
	public static final String SFYJSY = "sfyjsy";
	public static final String KGRQ = "kgrq";
	public static final String ZBRQ = "zbrq";
	public static final String YJBWYSRQ = "yjbwysrq";
	public static final String SGBM = "sgbm";
	public static final String SGFZR = "sgfzr";
	public static final String SGLXDH = "sglxdh";
	public static final String AZBJ = "azbj";
	public static final String CKXD = "ckxd";
	public static final String LD = "ld";
	public static final String LDQD = "ldqd";
	public static final String LDZD = "ldzd";
	public static final String SGGCAI = "sggcai";
	public static final String SGGCHANG = "sggchang";
	public static final String BIAOMA = "biaoma";
	public static final String CHANDI = "chandi";
	public static final String BIANMA = "bianma";
	public static final String BIAOBIE = "biaobie";
	public static final String BIAOWEI = "biaowei";
	
	
	
	

	public UFDate getKgrq() {
		return kgrq;
	}
	public void setKgrq(UFDate kgrq) {
		this.kgrq = kgrq;
	}
	public UFDate getZbrq() {
		return zbrq;
	}
	public void setZbrq(UFDate zbrq) {
		this.zbrq = zbrq;
	}
	public UFDate getYjbwysrq() {
		return yjbwysrq;
	}
	public void setYjbwysrq(UFDate yjbwysrq) {
		this.yjbwysrq = yjbwysrq;
	}
	public String getSgbm() {
		return sgbm;
	}
	public void setSgbm(String sgbm) {
		this.sgbm = sgbm;
	}
	public String getSgfzr() {
		return sgfzr;
	}
	public void setSgfzr(String sgfzr) {
		this.sgfzr = sgfzr;
	}
	public String getSglxdh() {
		return sglxdh;
	}
	public void setSglxdh(String sglxdh) {
		this.sglxdh = sglxdh;
	}
	public String getAzbj() {
		return azbj;
	}
	public void setAzbj(String azbj) {
		this.azbj = azbj;
	}
	public String getCkxd() {
		return ckxd;
	}
	public void setCkxd(String ckxd) {
		this.ckxd = ckxd;
	}
	public String getLd() {
		return ld;
	}
	public void setLd(String ld) {
		this.ld = ld;
	}
	public String getLdqd() {
		return ldqd;
	}
	public void setLdqd(String ldqd) {
		this.ldqd = ldqd;
	}
	public String getLdzd() {
		return ldzd;
	}
	public void setLdzd(String ldzd) {
		this.ldzd = ldzd;
	}
	public String getSggcai() {
		return sggcai;
	}
	public void setSggcai(String sggcai) {
		this.sggcai = sggcai;
	}
	public UFDouble getSggchang() {
		return sggchang;
	}
	public void setSggchang(UFDouble sggchang) {
		this.sggchang = sggchang;
	}
	public String getBiaoma() {
		return biaoma;
	}
	public void setBiaoma(String biaoma) {
		this.biaoma = biaoma;
	}
	public String getChandi() {
		return chandi;
	}
	public void setChandi(String chandi) {
		this.chandi = chandi;
	}
	public String getBianma() {
		return bianma;
	}
	public void setBianma(String bianma) {
		this.bianma = bianma;
	}
	public String getBiaobie() {
		return biaobie;
	}
	public void setBiaobie(String biaobie) {
		this.biaobie = biaobie;
	}
	public String getBiaowei() {
		return biaowei;
	}
	public void setBiaowei(String biaowei) {
		this.biaowei = biaowei;
	}
	public static final String YSDH = "ysdh";
	public static final String VLASTBILLID = "vlastbillid";
	public static final String RESERVE10 = "reserve10";
	public static final String TS = "ts";
	public static final String RESERVE11 = "reserve11";
	public static final String REMARK = "remark";
	public static final String RESERVE12 = "reserve12";
	public static final String RESERVE13 = "reserve13";
	public static final String RESERVE14 = "reserve14";
	public static final String DMAKEDATE = "dmakedate";
	public static final String VSOURCEBILLNO = "vsourcebillno";
	public static final String VLASTBILLROWID = "vlastbillrowid";
	public static final String YQXGRQ = "yqxgrq";
	public static final String JGRQ = "jgrq";
	public static final String PK_BILLTYPE = "pk_billtype";
	public static final String RESERVE20 = "reserve20";
	public static final String YJAZRQ = "yjazrq";
	public static final String HTH = "hth";
	public static final String RESERVE7 = "reserve7";
	public static final String RESERVE6 = "reserve6";
	public static final String RESERVE5 = "reserve5";
	public static final String RESERVE4 = "reserve4";
	public static final String RESERVE9 = "reserve9";
	public static final String RESERVE8 = "reserve8";
	public static final String RESERVE3 = "reserve3";
	public static final String RESERVE2 = "reserve2";
	public static final String AZRQ = "azrq";
	public static final String ZLFKRQ = "zlfkrq";
	public static final String RESERVE1 = "reserve1";
	public static final String MODIFIER = "modifier";
	public static final String RESERVE18 = "reserve18";
	public static final String DBILLDATE = "dbilldate";
	public static final String RESERVE17 = "reserve17";
	public static final String RESERVE16 = "reserve16";
	public static final String RESERVE15 = "reserve15";
	public static final String RESERVE19 = "reserve19";
	public static final String VLASTBILLTYPE = "vlastbilltype";
	public static final String YSRY = "ysry";
	public static final String YQXGR = "yqxgr";
	public static final String VOPERATORID = "voperatorid";
	public static final String VAPPROVENOTE = "vapprovenote";
	public static final String DMODIFY = "dmodify";
	public static final String VAPPROVEID = "vapproveid";
	public static final String PK_BUSITYPE = "pk_busitype";
	public static final String WGYQTS = "wgyqts";
	public static final String DR = "dr";
	public static final String PK_CORP = "pk_corp";
	public static final String AZFKRQ = "azfkrq";
	public static final String VSOURCEBILLTYPE = "vsourcebilltype";
	public static final String PK_JOBBASFIL = "pk_jobbasfil";
	public static final String VBILLCODE = "vbillcode";
	public static final String VBILLSTATUS = "vbillstatus";
	public static final String DAPPROVEDATE = "dapprovedate";
	public static final String VSOURCEBILLROWID = "vsourcebillrowid";
	public static final String VSOURCEBILLID = "vsourcebillid";
	public static final String PK_AZXXFKHID = "pk_azxxfkhid";

	/** 
	 * 
	 * 属性<验收电话>的Getter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public String getYsdh(){
		 return ysdh;
	}
	/** 
	 * 
	 * 属性<验收电话>的Setter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public void setYsdh(String newYsdh){
		 this.ysdh = newYsdh;
	}
	/** 
	 * 
	 * 属性<下游单据ID>的Getter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public String getVlastbillid(){
		 return vlastbillid;
	}
	/** 
	 * 
	 * 属性<下游单据ID>的Setter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public void setVlastbillid(String newVlastbillid){
		 this.vlastbillid = newVlastbillid;
	}
	/** 
	 * 
	 * 属性<预留字段10>的Getter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public String getReserve10(){
		 return reserve10;
	}
	/** 
	 * 
	 * 属性<预留字段10>的Setter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public void setReserve10(String newReserve10){
		 this.reserve10 = newReserve10;
	}
	/** 
	 * 
	 * 属性<预留字段11>的Getter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public String getReserve11(){
		 return reserve11;
	}
	/** 
	 * 
	 * 属性<预留字段11>的Setter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public void setReserve11(String newReserve11){
		 this.reserve11 = newReserve11;
	}
	/** 
	 * 
	 * 属性<备注>的Getter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public String getRemark(){
		 return remark;
	}
	/** 
	 * 
	 * 属性<备注>的Setter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public void setRemark(String newRemark){
		 this.remark = newRemark;
	}
	/** 
	 * 
	 * 属性<预留字段12>的Getter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public String getReserve12(){
		 return reserve12;
	}
	/** 
	 * 
	 * 属性<预留字段12>的Setter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public void setReserve12(String newReserve12){
		 this.reserve12 = newReserve12;
	}
	/** 
	 * 
	 * 属性<预留字段13>的Getter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public String getReserve13(){
		 return reserve13;
	}
	/** 
	 * 
	 * 属性<预留字段13>的Setter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public void setReserve13(String newReserve13){
		 this.reserve13 = newReserve13;
	}
	/** 
	 * 
	 * 属性<预留字段14>的Getter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public String getReserve14(){
		 return reserve14;
	}
	/** 
	 * 
	 * 属性<预留字段14>的Setter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public void setReserve14(String newReserve14){
		 this.reserve14 = newReserve14;
	}
	/** 
	 * 
	 * 属性<制单日期>的Getter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public UFDate getDmakedate(){
		 return dmakedate;
	}
	/** 
	 * 
	 * 属性<制单日期>的Setter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public void setDmakedate(UFDate newDmakedate){
		 this.dmakedate = newDmakedate;
	}
	/** 
	 * 
	 * 属性<上游单据号>的Getter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public String getVsourcebillno(){
		 return vsourcebillno;
	}
	/** 
	 * 
	 * 属性<上游单据号>的Setter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public void setVsourcebillno(String newVsourcebillno){
		 this.vsourcebillno = newVsourcebillno;
	}
	/** 
	 * 
	 * 属性<下游单据行ID>的Getter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public String getVlastbillrowid(){
		 return vlastbillrowid;
	}
	/** 
	 * 
	 * 属性<下游单据行ID>的Setter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public void setVlastbillrowid(String newVlastbillrowid){
		 this.vlastbillrowid = newVlastbillrowid;
	}
	/** 
	 * 
	 * 属性<延期修改日期>的Getter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public UFDate getYqxgrq(){
		 return yqxgrq;
	}
	/** 
	 * 
	 * 属性<延期修改日期>的Setter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public void setYqxgrq(UFDate newYqxgrq){
		 this.yqxgrq = newYqxgrq;
	}
	/** 
	 * 
	 * 属性<竣工日期>的Getter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public UFDate getJgrq(){
		 return jgrq;
	}
	/** 
	 * 
	 * 属性<竣工日期>的Setter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public void setJgrq(UFDate newJgrq){
		 this.jgrq = newJgrq;
	}
	/** 
	 * 
	 * 属性<单据类型>的Getter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public String getPk_billtype(){
		 return pk_billtype;
	}
	/** 
	 * 
	 * 属性<单据类型>的Setter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public void setPk_billtype(String newPk_billtype){
		 this.pk_billtype = newPk_billtype;
	}
	/** 
	 * 
	 * 属性<预留字段20>的Getter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public String getReserve20(){
		 return reserve20;
	}
	/** 
	 * 
	 * 属性<预留字段20>的Setter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public void setReserve20(String newReserve20){
		 this.reserve20 = newReserve20;
	}
	/** 
	 * 
	 * 属性<移交安装日期>的Getter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public UFDate getYjazrq(){
		 return yjazrq;
	}
	/** 
	 * 
	 * 属性<移交安装日期>的Setter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public void setYjazrq(UFDate newYjazrq){
		 this.yjazrq = newYjazrq;
	}
	/** 
	 * 
	 * 属性<合同号>的Getter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public String getHth(){
		 return hth;
	}
	/** 
	 * 
	 * 属性<合同号>的Setter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public void setHth(String newHth){
		 this.hth = newHth;
	}
	/** 
	 * 
	 * 属性<预留字段7>的Getter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public UFDouble getReserve7(){
		 return reserve7;
	}
	/** 
	 * 
	 * 属性<预留字段7>的Setter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public void setReserve7(UFDouble newReserve7){
		 this.reserve7 = newReserve7;
	}
	/** 
	 * 
	 * 属性<预留字段6>的Getter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public UFDouble getReserve6(){
		 return reserve6;
	}
	/** 
	 * 
	 * 属性<预留字段6>的Setter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public void setReserve6(UFDouble newReserve6){
		 this.reserve6 = newReserve6;
	}
	/** 
	 * 
	 * 属性<预留字段5>的Getter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public UFDouble getReserve5(){
		 return reserve5;
	}
	/** 
	 * 
	 * 属性<预留字段5>的Setter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public void setReserve5(UFDouble newReserve5){
		 this.reserve5 = newReserve5;
	}
	/** 
	 * 
	 * 属性<预留字段4>的Getter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public String getReserve4(){
		 return reserve4;
	}
	/** 
	 * 
	 * 属性<预留字段4>的Setter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public void setReserve4(String newReserve4){
		 this.reserve4 = newReserve4;
	}
	/** 
	 * 
	 * 属性<预留字段9>的Getter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public String getReserve9(){
		 return reserve9;
	}
	/** 
	 * 
	 * 属性<预留字段9>的Setter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public void setReserve9(String newReserve9){
		 this.reserve9 = newReserve9;
	}
	/** 
	 * 
	 * 属性<预留字段8>的Getter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public UFDouble getReserve8(){
		 return reserve8;
	}
	/** 
	 * 
	 * 属性<预留字段8>的Setter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public void setReserve8(UFDouble newReserve8){
		 this.reserve8 = newReserve8;
	}
	/** 
	 * 
	 * 属性<预留字段3>的Getter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public String getReserve3(){
		 return reserve3;
	}
	/** 
	 * 
	 * 属性<预留字段3>的Setter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public void setReserve3(String newReserve3){
		 this.reserve3 = newReserve3;
	}
	/** 
	 * 
	 * 属性<预留字段2>的Getter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public String getReserve2(){
		 return reserve2;
	}
	/** 
	 * 
	 * 属性<预留字段2>的Setter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public void setReserve2(String newReserve2){
		 this.reserve2 = newReserve2;
	}
	/** 
	 * 
	 * 属性<安装日期>的Getter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public UFDate getAzrq(){
		 return azrq;
	}
	/** 
	 * 
	 * 属性<安装日期>的Setter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public void setAzrq(UFDate newAzrq){
		 this.azrq = newAzrq;
	}
	/** 
	 * 
	 * 属性<资料反馈日期>的Getter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public UFDate getZlfkrq(){
		 return zlfkrq;
	}
	/** 
	 * 
	 * 属性<资料反馈日期>的Setter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public void setZlfkrq(UFDate newZlfkrq){
		 this.zlfkrq = newZlfkrq;
	}
	/** 
	 * 
	 * 属性<预留字段1>的Getter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public String getReserve1(){
		 return reserve1;
	}
	/** 
	 * 
	 * 属性<预留字段1>的Setter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public void setReserve1(String newReserve1){
		 this.reserve1 = newReserve1;
	}
	/** 
	 * 
	 * 属性<修改人>的Getter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public String getModifier(){
		 return modifier;
	}
	/** 
	 * 
	 * 属性<修改人>的Setter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public void setModifier(String newModifier){
		 this.modifier = newModifier;
	}
	/** 
	 * 
	 * 属性<预留字段18>的Getter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public String getReserve18(){
		 return reserve18;
	}
	/** 
	 * 
	 * 属性<预留字段18>的Setter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public void setReserve18(String newReserve18){
		 this.reserve18 = newReserve18;
	}
	/** 
	 * 
	 * 属性<业务日期>的Getter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public UFDate getDbilldate(){
		 return dbilldate;
	}
	/** 
	 * 
	 * 属性<业务日期>的Setter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public void setDbilldate(UFDate newDbilldate){
		 this.dbilldate = newDbilldate;
	}
	/** 
	 * 
	 * 属性<预留字段17>的Getter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public String getReserve17(){
		 return reserve17;
	}
	/** 
	 * 
	 * 属性<预留字段17>的Setter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public void setReserve17(String newReserve17){
		 this.reserve17 = newReserve17;
	}
	/** 
	 * 
	 * 属性<预留字段16>的Getter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public String getReserve16(){
		 return reserve16;
	}
	/** 
	 * 
	 * 属性<预留字段16>的Setter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public void setReserve16(String newReserve16){
		 this.reserve16 = newReserve16;
	}
	/** 
	 * 
	 * 属性<预留字段15>的Getter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public String getReserve15(){
		 return reserve15;
	}
	/** 
	 * 
	 * 属性<预留字段15>的Setter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public void setReserve15(String newReserve15){
		 this.reserve15 = newReserve15;
	}
	/** 
	 * 
	 * 属性<预留字段19>的Getter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public String getReserve19(){
		 return reserve19;
	}
	/** 
	 * 
	 * 属性<预留字段19>的Setter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public void setReserve19(String newReserve19){
		 this.reserve19 = newReserve19;
	}
	/** 
	 * 
	 * 属性<下游单据类型>的Getter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public String getVlastbilltype(){
		 return vlastbilltype;
	}
	/** 
	 * 
	 * 属性<下游单据类型>的Setter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public void setVlastbilltype(String newVlastbilltype){
		 this.vlastbilltype = newVlastbilltype;
	}
	/** 
	 * 
	 * 属性<验收人员>的Getter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public String getYsry(){
		 return ysry;
	}
	/** 
	 * 
	 * 属性<验收人员>的Setter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public void setYsry(String newYsry){
		 this.ysry = newYsry;
	}
	/** 
	 * 
	 * 属性<延期修改人>的Getter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public String getYqxgr(){
		 return yqxgr;
	}
	/** 
	 * 
	 * 属性<延期修改人>的Setter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public void setYqxgr(String newYqxgr){
		 this.yqxgr = newYqxgr;
	}
	/** 
	 * 
	 * 属性<制单人>的Getter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public String getVoperatorid(){
		 return voperatorid;
	}
	/** 
	 * 
	 * 属性<制单人>的Setter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public void setVoperatorid(String newVoperatorid){
		 this.voperatorid = newVoperatorid;
	}
	/** 
	 * 
	 * 属性<审核批语>的Getter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public String getVapprovenote(){
		 return vapprovenote;
	}
	/** 
	 * 
	 * 属性<审核批语>的Setter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public void setVapprovenote(String newVapprovenote){
		 this.vapprovenote = newVapprovenote;
	}
	/** 
	 * 
	 * 属性<修改日期>的Getter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public UFDate getDmodify(){
		 return dmodify;
	}
	/** 
	 * 
	 * 属性<修改日期>的Setter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public void setDmodify(UFDate newDmodify){
		 this.dmodify = newDmodify;
	}
	/** 
	 * 
	 * 属性<审核人>的Getter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public String getVapproveid(){
		 return vapproveid;
	}
	/** 
	 * 
	 * 属性<审核人>的Setter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public void setVapproveid(String newVapproveid){
		 this.vapproveid = newVapproveid;
	}
	/** 
	 * 
	 * 属性<业务类型>的Getter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public String getPk_busitype(){
		 return pk_busitype;
	}
	/** 
	 * 
	 * 属性<业务类型>的Setter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public void setPk_busitype(String newPk_busitype){
		 this.pk_busitype = newPk_busitype;
	}
	/** 
	 * 
	 * 属性<完工延期天数>的Getter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public Integer getWgyqts(){
		 return wgyqts;
	}
	/** 
	 * 
	 * 属性<完工延期天数>的Setter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public void setWgyqts(Integer newWgyqts){
		 this.wgyqts = newWgyqts;
	}
	
	/** 
	 * 
	 * 属性<公司ID>的Getter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public String getPk_corp(){
		 return pk_corp;
	}
	/** 
	 * 
	 * 属性<公司ID>的Setter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public void setPk_corp(String newPk_corp){
		 this.pk_corp = newPk_corp;
	}
	/** 
	 * 
	 * 属性<安装反馈日期>的Getter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public UFDate getAzfkrq(){
		 return azfkrq;
	}
	/** 
	 * 
	 * 属性<安装反馈日期>的Setter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public void setAzfkrq(UFDate newAzfkrq){
		 this.azfkrq = newAzfkrq;
	}
	/** 
	 * 
	 * 属性<来源单据类型>的Getter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public String getVsourcebilltype(){
		 return vsourcebilltype;
	}
	/** 
	 * 
	 * 属性<来源单据类型>的Setter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public void setVsourcebilltype(String newVsourcebilltype){
		 this.vsourcebilltype = newVsourcebilltype;
	}
	/** 
	 * 
	 * 属性<项目>的Getter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public String getPk_jobbasfil(){
		 return pk_jobbasfil;
	}
	/** 
	 * 
	 * 属性<项目>的Setter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public void setPk_jobbasfil(String newPk_jobbasfil){
		 this.pk_jobbasfil = newPk_jobbasfil;
	}
	/** 
	 * 
	 * 属性<单据号>的Getter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public String getVbillcode(){
		 return vbillcode;
	}
	/** 
	 * 
	 * 属性<单据号>的Setter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public void setVbillcode(String newVbillcode){
		 this.vbillcode = newVbillcode;
	}
	/** 
	 * 
	 * 属性<单据状态>的Getter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public Integer getVbillstatus(){
		 return vbillstatus;
	}
	/** 
	 * 
	 * 属性<单据状态>的Setter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public void setVbillstatus(Integer newVbillstatus){
		 this.vbillstatus = newVbillstatus;
	}
	/** 
	 * 
	 * 属性<审核日期>的Getter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public UFDate getDapprovedate(){
		 return dapprovedate;
	}
	/** 
	 * 
	 * 属性<审核日期>的Setter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public void setDapprovedate(UFDate newDapprovedate){
		 this.dapprovedate = newDapprovedate;
	}
	/** 
	 * 
	 * 属性<来源单据行ID>的Getter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public String getVsourcebillrowid(){
		 return vsourcebillrowid;
	}
	/** 
	 * 
	 * 属性<来源单据行ID>的Setter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public void setVsourcebillrowid(String newVsourcebillrowid){
		 this.vsourcebillrowid = newVsourcebillrowid;
	}
	/** 
	 * 
	 * 属性<来源单据ID>的Getter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public String getVsourcebillid(){
		 return vsourcebillid;
	}
	/** 
	 * 
	 * 属性<来源单据ID>的Setter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public void setVsourcebillid(String newVsourcebillid){
		 this.vsourcebillid = newVsourcebillid;
	}
	/** 
	 * 
	 * 属性<主键>的Getter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public String getPk_azxxfkhid(){
		 return pk_azxxfkhid;
	}
	/** 
	 * 
	 * 属性<主键>的Setter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public void setPk_azxxfkhid(String newPk_azxxfkhid){
		 this.pk_azxxfkhid = newPk_azxxfkhid;
	}

	/** 
	 * 
	 *属性<时间戳>的Getter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public UFDateTime getTs() {
		return ts;
	}

	/** 
	 * 
	 * 属性<时间戳>的Setter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public void setTs(UFDateTime newTs ) {
		this.ts = newTs;
	}

	/** 
	 * 
	 *属性<删除标志>的Getter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public Integer getDr() {
		return dr;
	}

	/** 
	 * 
	 * 属性<删除标志>的Setter方法
	 * <b>创建时间   2014-09-03 17:11:19</b>
	 * 
	 */ 
	public void setDr(Integer newDr ) {
		this.dr = newDr;
	}

	/** 
	 * 取得父VO主键字段
	 * 
	 * <b>创建时间   2014-09-03 17:11:19</b>
	*/ 
	public java.lang.String getParentPKFieldName() {
		return null;
	}
	/** 
	 * 取得表主键
	 * 
	 * <b>创建时间   2014-09-03 17:11:19</b>
	*/ 
	public java.lang.String getPKFieldName() {
		return "pk_azxxfkhid";
	}
	/** 
	 * 返回表名称
	 * 
	 * <b>创建时间   2014-09-03 17:11:19</b>
	*/ 
	public java.lang.String getTableName() {
		return "lcsw_azxxfk_hCopy";
	}
	/** 
	 * 按照默认方式创建构造子
	 * 
	 * <b>创建时间   2014-09-03 17:11:19</b>
	*/ 
	public AzxxfkHVOC() {
		super();
	}
}
