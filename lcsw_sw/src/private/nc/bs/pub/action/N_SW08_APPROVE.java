/**    Create By NCPlugin beta 0.1.   **/
//insert into pub_busiclass (ACTIONTYPE, CLASSNAME, DR, ISBEFORE, PK_BILLTYPE, PK_BUSICLASS, PK_BUSINESSTYPE, PK_CORP, TS)
//values ('APPROVE', 'N_SW08_APPROVE', 0, 'N', 'SW08', '140821112929363E6HHR', NULL, '0001', '2014-08-21 11:29:29')
//go

//insert into pub_billaction (ACTIONNOTE, ACTIONSTYLE, ACTIONSTYLEREMARK, ACTIONTYPE, CONSTRICTFLAG, CONTROLFLAG, DR, FINISHFLAG, PK_BILLACTION, PK_BILLTYPE, SHOWHINT, TS)
//values ('审批', NULL, NULL, 'APPROVE', 'N', 'Y', 0, 'Y', '1408211129294634AMQL', 'SW08', NULL, '2014-08-21 11:29:29')
//go

package nc.bs.pub.action;

import java.util.Hashtable;

import nc.bs.pub.compiler.AbstractCompiler2;
import nc.bs.trade.business.HYPubBO;
import nc.vo.lcsw.pub.EmunBzzt;
import nc.vo.lcsw.sw01.LcswBzxxHVO;
import nc.vo.lcsw.sw02.BzsqVO;
import nc.vo.lcsw.sw08.YsfksjBVO;
import nc.vo.lcsw.sw08.YsfksjHVO;
import nc.vo.lcsw.sw10.BzfyBVO;
import nc.vo.lcsw.sw10.BzfyHVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.compiler.PfParameterVO;
import nc.vo.uap.pf.PFBusinessException;

/**
 * 备注：单据:<b><code>SW08</code></b> 的审批 <tt>APPROVE</tt> 动态执行类。
 * 
 * @since 创建日期：2014-08-21 11:29:29
 * @version UAP 5.x 
 * @author Administrator
 * @author NC Plugin
 */
public class N_SW08_APPROVE extends AbstractCompiler2 {
	private java.util.Hashtable m_methodReturnHas = new java.util.Hashtable();
	private Hashtable m_keyHas = null;

	/**
	 * N_SW08_APPROVE 构造子注解。
	 */
	public N_SW08_APPROVE() {
		super();
	}

	/*
	 * 备注：平台编写规则类 接口执行类
	 */
	public Object runComClass(PfParameterVO vo) throws BusinessException {
		try {

			super.m_tmpVo = vo;
			// ****该组件为单动作工作流处理开始...不能进行修改****
			Object m_sysflowObj = procActionFlow(vo);
			if (m_sysflowObj != null) {
				return m_sysflowObj;
			}
			
			writeBack();
			
			// ****该组件为单动作工作流处理结束...不能进行修改****
			Object retObj = runClass("nc.bs.trade.comstatus.BillApprove",
					"approveBill", "nc.vo.pub.AggregatedValueObject:01", vo,
					m_keyHas, m_methodReturnHas);
			return retObj;
		} catch (Exception ex) {
			if (ex instanceof BusinessException)
				throw (BusinessException) ex;
			else
				throw new PFBusinessException(ex.getMessage(), ex);
		}
	}

	/*
	 * 备注：平台编写原始脚本
	 */
	public String getCodeRemark() {
		return "	//****该组件为单动作工作流处理开始...不能进行修改****\n	procActionFlow@@;\n	//****该组件为单动作工作流处理结束...不能进行修改****\n	Object retObj  =runClassCom@ \"nc.bs.trade.comstatus.BillApprove\", \"approveBill\", \"nc.vo.pub.AggregatedValueObject:01\"@; \n	return retObj;\n";
	}

	/*
	 * 备注：设置脚本变量的HAS
	 */
	private void setParameter(String key, Object val) {
		if (m_keyHas == null) {
			m_keyHas = new Hashtable();
		}
		if (val != null) {
			m_keyHas.put(key, val);
		}
	}
	
	/**
	 * 回写反馈信息到报装信息,并更新报装状态   added by 梁展轩
	 * @throws BusinessException
	 */
	private void  writeBack() throws BusinessException {
		YsfksjHVO ysxxfkHVO= (YsfksjHVO) getVo().getParentVO();
		YsfksjBVO[] ysxxfkBVO=(YsfksjBVO[]) getVo().getChildrenVO(); //获取验收信息反馈子表数据
		if(ysxxfkBVO!=null && ysxxfkBVO.length>0){
			HYPubBO bo = new HYPubBO();
			LcswBzxxHVO[] bzxxhvos=new LcswBzxxHVO[ysxxfkBVO.length];
			for (int i = 0; i < bzxxhvos.length; i++) {
				LcswBzxxHVO bzxxhvo= (LcswBzxxHVO) bo.queryByPrimaryKey(LcswBzxxHVO.class, ysxxfkBVO[i].getPk_bzxx());
				bzxxhvo.setBianma(ysxxfkBVO[i].getBianma());//编码
				bzxxhvo.setBhgyy(ysxxfkBVO[i].getBhgyy());	//不及格原因
				bzxxhvo.setBiaobie(ysxxfkBVO[i].getBiaobie());//表别
				bzxxhvo.setBiaoma(ysxxfkBVO[i].getBiaoma());//表码
				bzxxhvo.setBiaowei(ysxxfkBVO[i].getBiaowei());	//表位
				bzxxhvo.setYshgbz(ysxxfkBVO[i].getYshgbz());	//验收合格标志
				bzxxhvo.setYswgyqts(ysxxfkBVO[i].getWgyqts());	//验收完工延期天数
				bzxxhvo.setYsy(ysxxfkBVO[i].getYsy());		//验收员
				bzxxhvo.setYsxd(ysxxfkBVO[i].getYsxd());//验收行度
				bzxxhvo.setYsrq(ysxxfkBVO[i].getYsrq());//验收日期
				bzxxhvo.setZbrq(ysxxfkBVO[i].getZbrq());//装表日期
				bzxxhvo.setYjysrq(ysxxfkBVO[i].getYjysrq());//移交验收日期
				bzxxhvo.setYjzgrq(ysxxfkBVO[i].getYjzgrq());//移交整改日期
				bzxxhvo.setCchd(ysxxfkBVO[i].getCchd());//出库行度
				bzxxhvo.setChandi(ysxxfkBVO[i].getChandi());//产地
				
				if(ysxxfkBVO[i].getYshgbz() == null || !ysxxfkBVO[i].getYshgbz().booleanValue()) {
					bzxxhvo.setBzzt(EmunBzzt.YSBHG);//验收不合格
				}
				else {
					bzxxhvo.setBzzt(EmunBzzt.YCHG);//验收合格
				}
				//panqh
				//验收电话
				bzxxhvo.setYsdh(ysxxfkHVO.getYslxdh());
				//资料反馈日期
				bzxxhvo.setZlfkrq(ysxxfkHVO.getZlfkrq());
				
				
				bzxxhvos[i]=bzxxhvo;
			}
			bo.updateAry(bzxxhvos);
			
			//回写 报装申请 [报装状态]
			BzsqVO[] bzsqVOs=new BzsqVO[ysxxfkBVO.length];
			for (int i = 0; i < bzxxhvos.length; i++) {
				if(ysxxfkBVO[i].getPk_bzsq()!=null){
					BzsqVO bzsqVO=(BzsqVO) bo.queryByPrimaryKey(BzsqVO.class,ysxxfkBVO[i].getPk_bzsq());
					
					if(ysxxfkBVO[i].getYshgbz() == null || !ysxxfkBVO[i].getYshgbz().booleanValue()) {
						bzsqVO.setBzzt(EmunBzzt.YSBHG);//验收不合格
					}
					else {
						bzsqVO.setBzzt(EmunBzzt.YCHG);//验收合格
					}
					
					bzsqVOs[i]=bzsqVO;
				}
			}
			bo.updateAry(bzsqVOs);
			
			//回写报装费用表头字段  <结算工程款>
//			BzfyBVO bzfyBVO = (BzfyBVO) bo.queryByPrimaryKey(BzfyBVO.class,bzxxhvos[0].getPk_bzxx());
			BzfyBVO bzfyBVO[] = (BzfyBVO[]) bo.queryByCondition(BzfyBVO.class, " pk_bzxx='" + bzxxhvos[0].getPk_bzxx()+"'");
			
			if(bzfyBVO!=null && bzfyBVO.length > 0){
				BzfyHVO bzfyHVO = (BzfyHVO) bo.queryByPrimaryKey(BzfyHVO.class,bzfyBVO[0].getPk_bzfy_h());
				bzfyHVO.setJsgck(ysxxfkHVO.getJsgck());//结算工程款
				bo.update(bzfyHVO);
			}
		}
	
	}
}
