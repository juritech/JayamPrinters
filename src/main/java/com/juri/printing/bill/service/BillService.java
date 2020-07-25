package com.juri.printing.bill.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juri.printing.service.PaperAdminService;
import com.juri.printing.service.PrintAdminService;
import com.juri.printing.service.PrintBindService;
import com.juri.printing.vo.PaperTypeVo;
import com.juri.printing.vo.PreDataVo;

@Service
public class BillService {
	@Autowired
	private PaperAdminService paperService;
	@Autowired
	private PrintAdminService printService;
	@Autowired
	private PrintBindService bindService;

	public PreDataVo getPreData() {
		// TODO Auto-generated method stub
		PreDataVo vo = new PreDataVo();
		vo.setPaperLst(paperService.getAllPaper());
		vo.setBndLst(bindService.getAll());
		vo.setPrintLst(printService.getAll());	
		return vo;
	}
	

}
