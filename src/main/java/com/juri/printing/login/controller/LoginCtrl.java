package com.juri.printing.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.juri.printing.login.service.LoginService;
import com.juri.printing.vo.UserVo;

@RestController
public class LoginCtrl {
	@Autowired
	private LoginService service;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public UserVo doLogin(@RequestBody UserVo vo) {
		return service.doLogin(vo);
	}
	
	@RequestMapping(value = "/usercheck")
	public UserVo userCheck(@RequestParam("userName") String userName) {
		return service.userCheck(userName);
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public UserVo register(@RequestBody UserVo vo) {
		return service.register(vo);
	}
	
	@RequestMapping("/roles")
	public UserVo getRoles(){
		return service.getRoles();
	}
}
