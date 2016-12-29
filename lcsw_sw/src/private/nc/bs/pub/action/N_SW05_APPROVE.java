/**    Create By NCPlugin beta 0.1.   **/
//insert into pub_busiclass (ACTIONTYPE, CLASSNAME, DR, ISBEFORE, PK_BILLTYPE, PK_BUSICLASS, PK_BUSINESSTYPE, PK_CORP, TS)
//values ('APPROVE', 'N_SW05_APPROVE', 0, 'N', 'SW05', '140819161113223G1O5P', NULL, '0001', '2014-08-19 16:11:13')
//go

//insert into pub_billaction (ACTIONNOTE, ACTIONSTYLE, ACTIONSTYLEREMARK, ACTIONTYPE, CONSTRICTFLAG, CONTROLFLAG, DR, FINISHFLAG, PK_BILLACTION, PK_BILLTYPE, SHOWHINT, TS)
//values ('审批', NULL, NULL, 'APPROVE', 'N', 'Y', 0, 'Y', '1408191611133234WGNB', 'SW05', NULL, '2014-08-19 16:11:13')
//go

package nc.bs.pub.action;

import java.util.Hashtable;

import nc.bs.framework.common.NCLocator;
import nc.bs.pub.compiler.AbstractCompiler2;
import nc.vo.lcsw.sw05.GcpgsjBVO;
import nc.vo.lcsw.sw05.GcpgsjHVO;
import nc.vo.lcsw.sw05.itf.IGcpgsj;
import nc.vo.pub.BusinessException;
import nc.vo.pub.compiler.PfParameterVO;
import nc.vo.uap.pf.PFBusinessException;

/**
 * 备注：单据:<b><code>SW05</code></b> 的审批 <tt>APPROVE</tt> 动态执行类。
 * 
 * @since 创建日期：2014-08-19 16:11:13
 * @version UAP 5.x
 * @author Administrator
 * @author NC Plugin
 */
public class N_SW05_APPROVE extends AbstractCompiler2 {
	private java.util.Hashtable m_methodReturnHas = new java.util.Hashtable();
	private Hashtable m_keyHas = null;

	/**
	 * N_SW05_APPROVE 构造子注解。
	 */
	public N_SW05_APPROVE() {
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

			if (((GcpgsjHVO) getVo().getParentVO()).getVbillstatus() == 1) {
				// 取得后台EJB组件
				IGcpgsj gcpgsjServer = (IGcpgsj) NCLocator.getInstance().lookup(IGcpgsj.class);
				GcpgsjBVO[] bvos = (GcpgsjBVO[]) getVo().getChildrenVO();
				gcpgsjServer.updateBzxx(bvos, ((GcpgsjHVO) getVo().getParentVO()).getPk_gcpgsjhid());
			}

			if (m_sysflowObj != null) {
				return m_sysflowObj;
			}
			// ****该组件为单动作工作流处理结束...不能进行修改****
			Object retObj = runClass("nc.bs.trade.comstatus.BillApprove", "approveBill", "nc.vo.pub.AggregatedValueObject:01", vo, m_keyHas, m_methodReturnHas);
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
}
