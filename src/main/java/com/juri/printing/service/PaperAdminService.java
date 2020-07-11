package com.juri.printing.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juri.printing.dao.Prnt01PageDao;
import com.juri.printing.entity.Prnt01Page;
import com.juri.printing.vo.PaperTypeVo;

@Service
public class PaperAdminService {
	
	@Autowired
	private Prnt01PageDao paper;
	
	public List<PaperTypeVo> getAllPaper() {
		List<Prnt01Page> lstPojo = paper.findAll();
		List<PaperTypeVo> lstVo = new ArrayList<>();
		lstVo = paperToVo(lstPojo, lstVo);
		return lstVo;
	}

	private List<PaperTypeVo> paperToVo(List<Prnt01Page> lstPojo, List<PaperTypeVo> lstVo) {
		if (lstPojo != null) {
			int i = 0;
			for (Prnt01Page pojo : lstPojo) {
				PaperTypeVo vo = new PaperTypeVo();
				vo.setId(++i);
				vo.setPaperSize(pojo.getPrnt01PageSize());
				vo.setGsm(pojo.getPrnt01PageGsm());
				vo.setPrice(pojo.getPrnt01Amt());		
				lstVo.add(vo);
			}
		}
		return lstVo;
	}

	public PaperTypeVo paperInsert(List<PaperTypeVo> lstVo) {
		PaperTypeVo sendVo = new PaperTypeVo();
		List<Prnt01Page> lstPojo = paper.findAll();
		sendVo = validatePaper(lstPojo, lstVo, sendVo);
		if (!sendVo.isErrFlg()) {
			lstPojo = new ArrayList<>();
			for (PaperTypeVo vo : lstVo) {
				Prnt01Page pojo = new Prnt01Page();
				pojo.setPrnt01Amt(vo.getPrice());
				pojo.setPrnt01CrtDs("SAVE");
				pojo.setPrnt01UpdtDt(new Date());
				pojo.setPrnt01CrtUr("JURI");
				pojo.setPrnt01PageSize(vo.getPaperSize());
				pojo.setPrnt01PageGsm(vo.getGsm());
				pojo.setPrnt01UpdtDs("SAVE");
				pojo.setPrnt01UpdtDt(new Date());
				pojo.setPrnt01UpdtUr("JURI");
				lstPojo.add(pojo);
			}
			paper.saveAll(lstPojo);
			sendVo.setMsg("Record(s) saved successfully!");
		}

		return sendVo;
	}

	private PaperTypeVo validatePaper(List<Prnt01Page> lstPojo, List<PaperTypeVo> lstVo, PaperTypeVo sendVo) {
		for (PaperTypeVo vo : lstVo) {
			if (lstPojo != null) {
				for (Prnt01Page pojo : lstPojo) {
					if ((vo.getPaperSize() + vo.getGsm()).toString()
							.equalsIgnoreCase((pojo.getPrnt01PageSize() + pojo.getPrnt01PageGsm()).toString())) {
						sendVo.setMsg(sendVo.getMsg() + "Line No:[" + vo.getId() + "] is repeated in DB\n");
						sendVo.setErrFlg(true);
					}
				}
			}
		}
		return sendVo;
	}

	public PaperTypeVo UpdatePaper(List<PaperTypeVo> lstVo) {
		PaperTypeVo sendVo = new PaperTypeVo();
		if (!sendVo.isErrFlg()) {
			List<Prnt01Page> lstPojo = new ArrayList<>();
			for (PaperTypeVo vo : lstVo) {
				Prnt01Page pojo = paper.findByPrnt01PageSizeAndPrnt01PageGsm(vo.getPaperSize(), vo.getGsm());
				pojo.setPrnt01Amt(vo.getPrice());				
				pojo.setPrnt01UpdtDs("UPDATE");
				pojo.setPrnt01UpdtDt(new Date());
				pojo.setPrnt01UpdtUr("JURI");
				lstPojo.add(pojo);
			}
			paper.saveAll(lstPojo);
			sendVo.setMsg("Record(s) saved successfully!");
		}

		return sendVo;
	}

}
