package com.juri.printing.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juri.printing.dao.Prnt02BindDao;
import com.juri.printing.entity.Prnt02Bind;
import com.juri.printing.vo.PrintBindVo;

@Service
public class PrintBindService {
	@Autowired
	private Prnt02BindDao dao;

	public List<PrintBindVo> getAll() {
		// TODO Auto-generated method stub
		List<Prnt02Bind> lstPojo = dao.findAll();
		List<PrintBindVo> lstVo = new ArrayList<>();
		lstVo = pojoToVo(lstPojo, lstVo);
		return lstVo;
	}

private List<PrintBindVo> pojoToVo(List<Prnt02Bind> lstPojo, List<PrintBindVo> lstVo) {
		// TODO Auto-generated method stub
		if (lstPojo != null) {
			int i = 0;
			for (Prnt02Bind pojo : lstPojo) {
				PrintBindVo vo = new PrintBindVo();
				vo.setBindId(++i);
				vo.setBindType(pojo.getPrnt02BindType());
				vo.setBindSize(pojo.getPrnt02Size());
				vo.setBindAmt(pojo.getPrnt02Amt());
				lstVo.add(vo);
			}
		}
		return lstVo;
	}

	public PrintBindVo insert(List<PrintBindVo> lstVo) {
		// TODO Auto-generated method stub
		PrintBindVo sendVo = new PrintBindVo();
		List<Prnt02Bind> lstPojo = dao.findAll();
		sendVo = validate(lstPojo, lstVo, sendVo);
		if (!sendVo.isErrFlg()) {
			lstPojo = new ArrayList<>();
			for (PrintBindVo vo : lstVo) {
				Prnt02Bind pojo = new Prnt02Bind();
				pojo.setPrnt02BindId((long) vo.getBindId());
				pojo.setPrnt02BindType(vo.getBindType());
				pojo.setPrnt02Size(vo.getBindSize());
				pojo.setPrnt02Amt(vo.getBindAmt());
				pojo.setPrnt02CrtDt(new Date());
				pojo.setPrnt02CrtUr("JURI");
				pojo.setPrnt02CrtDs("SAVE");
				pojo.setPrnt02UpdtDt(new Date());
				pojo.setPrnt02UpdtUr("JURI");
				pojo.setPrnt02UpdtDs("SAVE");
				lstPojo.add(pojo);
			}
			dao.saveAll(lstPojo);
			sendVo.setMsg("Record(s) saved successfully!");
		}

		return sendVo;
	}

	private PrintBindVo validate(List<Prnt02Bind> lstPojo, List<PrintBindVo> lstVo, PrintBindVo sendVo) {
		// TODO Auto-generated method stub
		for (PrintBindVo vo : lstVo) {
			if (lstPojo != null) {
				for (Prnt02Bind pojo : lstPojo) {
					if ((vo.getBindType() + vo.getBindSize()).toString()
							.equalsIgnoreCase((pojo.getPrnt02BindType()+pojo.getPrnt02Size()))) {
						sendVo.setMsg(sendVo.getMsg() + "Line No:[" + vo.getBindId() + "] is repeated in DB\n");
						sendVo.setErrFlg(true);
					}
				}
			}
		}
		return sendVo;
	}

	public PrintBindVo update(List<PrintBindVo> lstVo) {
		// TODO Auto-generated method stub
		PrintBindVo sendVo = new PrintBindVo();
		if (!sendVo.isErrFlg()) {
			List<Prnt02Bind> lstPojo = new ArrayList<>();
			for (PrintBindVo vo : lstVo) {
				Prnt02Bind pojo = dao.findByPrnt02BindTypeAndPrnt02Size(vo.getBindType(), vo.getBindSize());
				pojo.setPrnt02Amt(vo.getBindAmt());				
				pojo.setPrnt02UpdtDs("UPDATE");
				pojo.setPrnt02UpdtDt(new Date());
				pojo.setPrnt02UpdtUr("JURI");
				lstPojo.add(pojo);
			}
			dao.saveAll(lstPojo);
			sendVo.setMsg("Record(s) saved successfully!");
		}

		return sendVo;
	}

}
