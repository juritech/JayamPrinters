package com.juri.printing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.juri.printing.service.PrintAdminService;
import com.juri.printing.vo.PrintTypeVo;

@RestController
@RequestMapping("/print")
public class PrinAdmintCtrl {
	@Autowired
	PrintAdminService service;

	@RequestMapping("/getAll")
	public List<PrintTypeVo> getAll() {
		return service.getAll();
	}

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public PrintTypeVo insert(@RequestBody List<PrintTypeVo> lstVo) {
		return service.insert(lstVo);
	}

	@RequestMapping(value = "/insert", method = RequestMethod.PUT)
	public PrintTypeVo update(@RequestBody List<PrintTypeVo> lstVo) {
		return service.update(lstVo);
	}
}