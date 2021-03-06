package nc.bs.lcsw.sw06;

import nc.bs.dao.BaseDAO;
import nc.bs.framework.common.NCLocator;
import nc.bs.trade.business.HYPubBO;
import nc.itf.uap.IUAPQueryBS;
import nc.jdbc.framework.processor.ColumnProcessor;
import nc.vo.lcsw.pub.EmunBzzt;
import nc.vo.lcsw.sw01.LcswBzxxHVO;
import nc.vo.lcsw.sw02.BzsqVO;
import nc.vo.lcsw.sw06.FbyjazBVO;
import nc.vo.lcsw.sw06.itf.IFbyjaz;
import nc.vo.pub.VOStatus;
import nc.vo.pub.lang.UFDate;

public class FbyjazImpl implements IFbyjaz {

	/**
	 * 回写报装申请、报装信息的报装状态
	 * 
	 * @param pk_bzxx
	 * @param pk_bzsq
	 * @throws Exception
	 */
	public void updateBzxx(FbyjazBVO[] bvos, String hid) throws Exception {
		BaseDAO dao = new BaseDAO();
		EmunBzzt emunbzzt = new EmunBzzt();
		HYPubBO bo = new HYPubBO();

		LcswBzxxHVO[] bzxx_hvo = (LcswBzxxHVO[]) bo.queryByCondition(LcswBzxxHVO.class, " nvl(dr,0)=0 and  EXISTS(  SELECT 1 FROM lcsw_fbyjaz_b WHERE "
				+ FbyjazBVO.PK_FBYJAZ + " = '" + hid + "'  and nvl(dr,0)=0  and lcsw_bzxx.pk_bzxx=lcsw_fbyjaz_b.pk_bzxx )");

		BzsqVO[] bzsq_vo = (BzsqVO[]) bo.queryByCondition(BzsqVO.class, " nvl(dr,0)=0 and EXISTS(  SELECT 1 FROM lcsw_fbyjaz_b WHERE " + FbyjazBVO.PK_FBYJAZ
				+ " = '" + hid + "'  and nvl(dr,0)=0 and lcsw_bzsq.pk_bzsq=lcsw_fbyjaz_b.pk_bzsq )");

		for (LcswBzxxHVO hvo : bzxx_hvo) {
			for (FbyjazBVO bvo : bvos) {
				if (hvo.getPk_bzxx().equals(bvo.getPk_bzxx())) {
					hvo.setJzlrq(bvo.getJzlrq());
					hvo.setSfysght(bvo.getSfysght());
					hvo.setSfxyyjjs(bvo.getSfxyyjjs());
					hvo.setSfsbgj(bvo.getSfsbgj());
					hvo.setYsszje(bvo.getYsszje());
					hvo.setYhysk(bvo.getYhysk());
					hvo.setYhczje(bvo.getYhczje());
					hvo.setGsczje(bvo.getGsczje());
					hvo.setBzzt(EmunBzzt.FBYJ);
					String yjazrq = (String) NCLocator.getInstance().lookup(IUAPQueryBS.class)
					        .executeQuery("select yjazrq  from lcsw_fbyjaz  where pk_fbyjaz="+"'"+ bvo.getPk_fbyjaz()+"'"
					        		, new ColumnProcessor(null));
					UFDate yjazrqDate= new UFDate(yjazrq);
					hvo.setYjazrq(yjazrqDate);
					hvo.setKfprq(bvo.getKfprq());
					hvo.setJsrq(bvo.getJsrq());
					hvo.setSfykfp(bvo.getSfykfp());
					hvo.setYfk(bvo.getYfk());
					hvo.setYfkfkrq(bvo.getYfkfkrq());
					hvo.setJdk(bvo.getJdk());
					hvo.setJdkfkrq(bvo.getJdkfkrq());
					hvo.setYhjsk(bvo.getYhjsk());
				}
			}
		}

		for (BzsqVO vo : bzsq_vo) {
			vo.setBzzt(EmunBzzt.FBYJ);
		}

		bo.updateAry(bzxx_hvo);
		bo.updateAry(bzsq_vo);

	}

	public void unProve(FbyjazBVO[] bvos, String hid) throws Exception {
		BaseDAO dao = new BaseDAO();
		EmunBzzt emunbzzt = new EmunBzzt();
		HYPubBO bo = new HYPubBO();

		LcswBzxxHVO[] bzxx_hvo = (LcswBzxxHVO[]) bo.queryByCondition(LcswBzxxHVO.class, " nvl(dr,0)=0 and  EXISTS(  SELECT 1 FROM lcsw_fbyjaz_b WHERE "
				+ FbyjazBVO.PK_FBYJAZ + " = '" + hid + "'  and nvl(dr,0)=0  and lcsw_bzxx.pk_bzxx=lcsw_fbyjaz_b.pk_bzxx )");

		BzsqVO[] bzsq_vo = (BzsqVO[]) bo.queryByCondition(BzsqVO.class, " nvl(dr,0)=0 and EXISTS(  SELECT 1 FROM lcsw_fbyjaz_b WHERE " + FbyjazBVO.PK_FBYJAZ
				+ " = '" + hid + "'  and nvl(dr,0)=0 and lcsw_bzsq.pk_bzsq=lcsw_fbyjaz_b.pk_bzsq )");

		for (LcswBzxxHVO hvo : bzxx_hvo) {
			for (FbyjazBVO bvo : bvos) {
				if (hvo.getPk_bzxx().equals(bvo.getPk_bzxx())) {
					hvo.setJzlrq(bvo.getJzlrq());
					hvo.setSfysght(bvo.getSfysght());
					hvo.setSfxyyjjs(bvo.getSfxyyjjs());
					hvo.setSfsbgj(bvo.getSfsbgj());
					hvo.setYsszje(bvo.getYsszje());
					hvo.setYhysk(bvo.getYhysk());
					hvo.setYhczje(bvo.getYhczje());
					hvo.setGsczje(bvo.getGsczje());
					hvo.setBzzt(EmunBzzt.PGZ);
					hvo.setStatus(VOStatus.UPDATED);
					
					hvo.setKfprq(bvo.getKfprq());
					hvo.setJsrq(bvo.getJsrq());
					hvo.setSfykfp(bvo.getSfykfp());
					hvo.setYfk(bvo.getYfk());
					hvo.setYfkfkrq(bvo.getYfkfkrq());
					hvo.setJdk(bvo.getJdk());
					hvo.setJdkfkrq(bvo.getJdkfkrq());
					hvo.setYhjsk(bvo.getYhjsk());
					
				}
			}
		}

		for (BzsqVO vo : bzsq_vo) {
			vo.setBzzt(EmunBzzt.PGZ);
			vo.setStatus(VOStatus.UPDATED);
		}

		bo.updateAry(bzxx_hvo);
		bo.updateAry(bzsq_vo);

	}

	public String querySFGTCZ(String pk_jobbasfil) throws Exception {
		BaseDAO dao = new BaseDAO();
		String sfgtcz="";
		String sql="select s.gtcz from lcsw_fbyjaz  h left join lcsw_fbyjaz_b b  on h.pk_fbyjaz= b.pk_fbyjaz " +
				"left join lcsw_bzsq s on b.pk_bzsq = s.pk_bzsq where h.pk_jobbasfil='"+pk_jobbasfil+"'";
		Object obj= dao.executeQuery(sql, new ColumnProcessor());
		if(obj!=null){
			sfgtcz=obj.toString();
			return sfgtcz;
		}
		return null;
	}
}
