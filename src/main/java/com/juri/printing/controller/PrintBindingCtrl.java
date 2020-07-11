package com.juri.printing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.juri.printing.service.PrintBindService;
import com.juri.printing.vo.PrintBindVo;

@RestController
@RequestMapping("/bind")
public class PrintBindingCtrl {
	
		@Autowired
		PrintBindService service;

		@RequestMapping("/getAll")
		public List<PrintBindVo> getAll() {
			return service.getAll();
		}

		@RequestMapping(value = "/insert", method = RequestMethod.POST)
		public PrintBindVo insert(@RequestBody List<PrintBindVo> lstVo) {
			return service.insert(lstVo);
		}

		@RequestMapping(value = "/update", method = RequestMethod.PUT)
		public PrintBindVo update(@RequestBody List<PrintBindVo> lstVo) {
			return service.update(lstVo);
		}

}
