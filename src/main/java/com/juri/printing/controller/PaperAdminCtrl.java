package com.juri.printing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.juri.printing.service.PaperAdminService;
import com.juri.printing.vo.PaperTypeVo;

@RestController
@RequestMapping("/paper")
public class PaperAdminCtrl {
	
	@Autowired
	PaperAdminService service;
	
	@RequestMapping("/getAllPaper")
	public List<PaperTypeVo> getAllPaper() {
		return service.getAllPaper();
	}
	
	@RequestMapping(value = "/InsertPaper", method = RequestMethod.PUT)
	public PaperTypeVo paperInsert(@RequestBody List<PaperTypeVo> lstVo) {
		return service.paperInsert(lstVo);
	}
	
	@RequestMapping(value = "/UpdatePaper", method = RequestMethod.PUT)
	public PaperTypeVo UpdatePaper(@RequestBody List<PaperTypeVo> lstVo) {
		return service.UpdatePaper(lstVo);
	}

}
