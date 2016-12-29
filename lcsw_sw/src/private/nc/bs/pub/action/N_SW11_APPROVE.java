package nc.bs.pub.action;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import nc.bs.dao.BaseDAO;
import nc.bs.pub.compiler.AbstractCompiler2;
import nc.bs.trade.business.HYPubBO;
import nc.hr.utils.PubEnv;
import nc.ui.lcsw.sw01.ref.BzxxRefModel;
import nc.uif.pub.exception.UifException;
import nc.vo.lcsw.pub.EmunBzzt;
import nc.vo.lcsw.sw01.LcswBzxxBVO;
import nc.vo.lcsw.sw01.LcswBzxxHVO;
import nc.vo.lcsw.sw02.BzsqVO;
import nc.vo.lcsw.sw10.BzfyBVO;
import nc.vo.lcsw.sw10.BzfyHVO;
import nc.vo.lcsw.sw11.SjfksjBVO;
import nc.vo.lcsw.sw11.SjfksjHVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.ValuepkUtils;
import nc.vo.pub.compiler.PfParameterVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDouble;
import nc.vo.uap.pf.PFBusinessException;
/**
 * 
 * <p>
 * <b>��Ʒ����������������ű�</b>
 * 
 * <p>
 * <p>
 * @since 1.0
 * @author ��չ��
 * @time 2014-08-14 15:16:25
 */
public final class N_SW11_APPROVE extends AbstractCompiler2 {
	private static final Object[] SjfksjBVO = null;
	private Hashtable<String, Object> m_methodReturnHas = new Hashtable<String, Object>();
	private Hashtable<String, Object> m_keyHas = null;
	
	/**
	 * N_SW11_APPROVE ������ע�⡣
	 */
	public N_SW11_APPROVE() {
		super();
	}
	
	/*
	 * ��ע��ƽ̨��д������ �ӿ�ִ����
	 */
	public Object runComClass(PfParameterVO vo) throws BusinessException {
		try {
			super.m_tmpVo = vo;
			// ####�����Ϊ������������������ʼ...���ܽ����޸�####
			Object m_sysflowObj = procActionFlow(vo);
			if (m_sysflowObj != null) {
				return m_sysflowObj;
			}
			
			writeBackSjxx();
			
			
			// ####�����Ϊ��������������������...���ܽ����޸�####
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
	 * ��ע��ƽ̨��дԭʼ�ű�
	 */
	public String getCodeRemark() {
		return "	//####�����Ϊ������������������ʼ...���ܽ����޸�####\n	procActionFlow@@;\n	//####�����Ϊ��������������������...���ܽ����޸�####\n	Object retObj  =runClassCom@ \"nc.bs.trade.comstatus.BillApprove\", \"approveBill\", \"nc.vo.pub.AggregatedValueObject:01\"@; \n	return retObj;\n";
	}
	
	/**
	 * ��д�����Ϣ����װ��Ϣ,���±�װ״̬�����±�װ����   added by ��չ��
	 * @throws BusinessException
	 */
	private void  writeBackSjxx() throws BusinessException {
		SjfksjHVO sjfksjhvo=(SjfksjHVO) getVo().getParentVO();
		SjfksjBVO[] sjfksjbvo=  (SjfksjBVO[]) getVo().getChildrenVO(); //��ȡ����ӱ�����
		if(sjfksjbvo!=null && sjfksjbvo.length > 0){
			HYPubBO bo = new HYPubBO();
			LcswBzxxHVO[] bzxxhvos=new LcswBzxxHVO[sjfksjbvo.length];
			for (int i = 0; i < bzxxhvos.length; i++) {
				LcswBzxxHVO bzxxhvo=(LcswBzxxHVO) bo.queryByPrimaryKey(LcswBzxxHVO.class, sjfksjbvo[i].getPk_bzxx());  //��ȡ��װ��ϢVO
				bzxxhvo.setSjjbry(sjfksjbvo[i].getJbry()); //������Ա
				bzxxhvo.setSjry(sjfksjbvo[i].getSjry());	//�����Ա
				bzxxhvo.setSjth(sjfksjbvo[i].getSjth());	//���ͼ��
				bzxxhvo.setSjqsrq(sjfksjbvo[i].getQsrq());	//ǩ������
				bzxxhvo.setSjfdrq(sjfksjbvo[i].getFdrq());	//��������
				bzxxhvo.setSjatrq(sjfksjbvo[i].getAtrq());	//��ͼ����
				bzxxhvo.setSjwgyqts(sjfksjbvo[i].getWgyqts());	//�깤��������
				bzxxhvo.setSjyqxgr(sjfksjbvo[i].getYqxgr());	//�����޸���
				bzxxhvo.setSjyqxgrq(sjfksjbvo[i].getYqxgrq());	//�����޸�����
//				bzxxhvo.setPk_bzxx(sjfksjbvo[i].getPk_bzxx());
				bzxxhvo.setBzzt(EmunBzzt.SJCG);//��װ״̬ : ��Ƴɹ�
			
				bzxxhvos[i]=bzxxhvo;
			}
			bo.updateAry(bzxxhvos);  
			
			//��д ��װ���� [��װ״̬]
			BzsqVO[] bzsqVOs=new BzsqVO[sjfksjbvo.length];
			for (int i = 0; i < bzxxhvos.length; i++) {
				if(sjfksjbvo[i].getPk_bzsq()!=null){
					BzsqVO bzsqVO=(BzsqVO) bo.queryByPrimaryKey(BzsqVO.class,sjfksjbvo[i].getPk_bzsq());
					bzsqVO.setBzzt(EmunBzzt.SJCG);//���պϸ�
					bzsqVOs[i]=bzsqVO;
				}
			}
			bo.updateAry(bzsqVOs);
			
			
			
			//��д��װ���ñ�ͷ�ֶ�  <���������> <Ԥ�㹤�̿�1��>
//			BzfyBVO bzfyBVO = (BzfyBVO) bo.queryByPrimaryKey(BzfyBVO.class,bzxxhvos[0].getPk_bzxx());
			BzfyBVO bzfyBVO[] = (BzfyBVO[]) bo.queryByCondition(BzfyBVO.class, " pk_bzxx='" + bzxxhvos[0].getPk_bzxx()+"'");
			
			if(bzfyBVO!=null && bzfyBVO.length > 0){
				BzfyHVO bzfyHVO = (BzfyHVO) bo.queryByPrimaryKey(BzfyHVO.class,bzfyBVO[0].getPk_bzfy_h());
				bzfyHVO.setBjkcf(sjfksjhvo.getBjkcf());//���������
				bzfyHVO.setYsgck1(sjfksjhvo.getYsgck());//Ԥ�㹤�̿�1��
			
				bo.update(bzfyHVO);
				
			//���ɱ�װ���� ����
				List<BzfyBVO> list = new ArrayList<BzfyBVO>();	
				
			if(bzfyHVO.getBjkcf()!=null && bzfyHVO.getBjkcf().doubleValue()!=0 ){
				// ���ƽ��
				Double yushu = bzfyHVO.getBjkcf().getDouble() % bzxxhvos.length;
				Double pingjun = (bzfyHVO.getBjkcf().getDouble() - yushu) / bzxxhvos.length;
				for (int i = 0; i < bzxxhvos.length; i++) {
					BzfyBVO fybvo = new BzfyBVO();
					fybvo.setPk_bzxx(bzxxhvos[i].getPk_bzxx());
					fybvo.setPk_bzfy_h(bzfyBVO[0].getPk_bzfy_h());
					fybvo.setPk_costsubj(ValuepkUtils.BJKCF);//���������
					fybvo.setTfrq(PubEnv.getServerDate());
					fybvo.setPk_balatype(bzxxhvos[i].getFkfs());
					
					if (i == bzxxhvos.length-1)
						fybvo.setAmount(new UFDouble(pingjun + yushu));
					else
						fybvo.setAmount(new UFDouble(pingjun));
					
					list.add(fybvo);
				}
			}
			
			if(bzfyHVO.getYsgck1()!=null && bzfyHVO.getYsgck1().doubleValue()!=0 ){
				// ���ƽ��
				Double yushu = bzfyHVO.getYsgck1().getDouble() % bzxxhvos.length;
				Double pingjun = (bzfyHVO.getYsgck1().getDouble() - yushu) / bzxxhvos.length;
				for (int i = 0; i < bzxxhvos.length; i++) {
					BzfyBVO fybvo = new BzfyBVO();
					fybvo.setPk_bzxx(bzxxhvos[i].getPk_bzxx());
					fybvo.setPk_bzfy_h(bzfyBVO[0].getPk_bzfy_h());
					fybvo.setPk_costsubj(ValuepkUtils.YSGCK1Q);//Ԥ�㹤�̿�
					fybvo.setTfrq(PubEnv.getServerDate());
					fybvo.setPk_balatype(bzxxhvos[i].getFkfs());
					
					if (i == bzxxhvos.length-1)
						fybvo.setAmount(new UFDouble(pingjun + yushu));
					else
						fybvo.setAmount(new UFDouble(pingjun));
					
					list.add(fybvo);
				}
			}
			
			bo.insertAry(list.toArray(new BzfyBVO[list.size()]));
		}
			
		}
	}
	
}