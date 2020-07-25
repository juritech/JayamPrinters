package com.juri.printing.bill.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juri.printing.bill.service.BillService;
import com.juri.printing.vo.PreDataVo;

@RestController
@RequestMapping("/bill")
public class BillCtrl {
	@Autowired
	private BillService service;

	@RequestMapping("/preadata")
	public PreDataVo getPreData() {
		return service.getPreData();
	}
}
