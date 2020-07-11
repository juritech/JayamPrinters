package com.juri.printing.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juri.printing.dao.Print08PrintDao;
import com.juri.printing.entity.Prnt08Print;
import com.juri.printing.vo.PrintTypeVo;

@Service
public class PrintAdminService {
	@Autowired
	private Print08PrintDao dao;

	public List<PrintTypeVo> getAll() {
		// TODO Auto-generated method stub
		List<Prnt08Print> lstPojo = dao.findAll();
		List<PrintTypeVo> lstVo = new ArrayList<>();
		lstVo = pojoToVo(lstPojo, lstVo);
		return lstVo;
	}

	private List<PrintTypeVo> pojoToVo(List<Prnt08Print> lstPojo, List<PrintTypeVo> lstVo) {
		// TODO Auto-generated method stub
		if (lstPojo != null) {
			int i = 0;
			for (Prnt08Print pojo : lstPojo) {
				PrintTypeVo vo = new PrintTypeVo();
				vo.setId(++i);
				vo.setPrintName(pojo.getPrnt08PrintType());
				vo.setPrice(pojo.getPrnt08Amt());
				vo.setRange(pojo.getPrnt08Range());
				lstVo.add(vo);
			}
		}
		return lstVo;
	}

	public PrintTypeVo insert(List<PrintTypeVo> lstVo) {
		// TODO Auto-generated method stub
		PrintTypeVo sendVo = new PrintTypeVo();
		List<Prnt08Print> lstPojo = dao.findAll();
		sendVo = validate(lstPojo, lstVo, sendVo);
		if (!sendVo.isErrFlg()) {
			lstPojo = new ArrayList<>();
			for (PrintTypeVo vo : lstVo) {
				Prnt08Print pojo = new Prnt08Print();
				pojo.setPrnt08Amt(vo.getPrice());
				pojo.setPrnt08CrtDs("SAVE");
				pojo.setPrnt08CrtDt(new Date());
				pojo.setPrnt08CrtUr("JURI");
				pojo.setPrnt08PrintType(vo.getPrintName());
				pojo.setPrnt08Range(vo.getRange());
				pojo.setPrnt08UpdtDs("SAVE");
				pojo.setPrnt08UpdtDt(new Date());
				pojo.setPrnt08UpdtUr("JURI");
				lstPojo.add(pojo);
			}
			dao.saveAll(lstPojo);
			sendVo.setMsg("Record(s) saved successfully!");
		}

		return sendVo;
	}

	private PrintTypeVo validate(List<Prnt08Print> lstPojo, List<PrintTypeVo> lstVo, PrintTypeVo sendVo) {
		// TODO Auto-generated method stub
		for (PrintTypeVo vo : lstVo) {
			if (lstPojo != null) {
				for (Prnt08Print pojo : lstPojo) {
					if ((vo.getPrintName() + vo.getRange()).toString()
							.equalsIgnoreCase((pojo.getPrnt08PrintType() + pojo.getPrnt08Range()).toString())) {
						sendVo.setMsg(sendVo.getMsg() + "Line No:[" + vo.getId() + "] is repeated in DB\n");
						sendVo.setErrFlg(true);
					}
				}
			}
		}
		return sendVo;
	}

	public PrintTypeVo update(List<PrintTypeVo> lstVo) {
		// TODO Auto-generated method stub
		PrintTypeVo sendVo = new PrintTypeVo();
		if (!sendVo.isErrFlg()) {
			List<Prnt08Print> lstPojo = new ArrayList<>();
			for (PrintTypeVo vo : lstVo) {
				Prnt08Print pojo = dao.findByPrnt08PrintTypeAndPrnt08Range(vo.getPrintName(), vo.getRange());
				pojo.setPrnt08Amt(vo.getPrice());				
				pojo.setPrnt08UpdtDs("UPDATE");
				pojo.setPrnt08UpdtDt(new Date());
				pojo.setPrnt08UpdtUr("JURI");
				lstPojo.add(pojo);
			}
			dao.saveAll(lstPojo);
			sendVo.setMsg("Record(s) saved successfully!");
		}

		return sendVo;
	}

}
