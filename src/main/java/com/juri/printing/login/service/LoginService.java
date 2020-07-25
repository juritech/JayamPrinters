package com.juri.printing.login.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juri.printing.dao.Prnt03RoleMstrDao;
import com.juri.printing.dao.Prnt04UsrDao;
import com.juri.printing.entity.Prnt03RoleMstr;
import com.juri.printing.entity.Prnt04Usr;
import com.juri.printing.util.TrippleDes;
import com.juri.printing.vo.UserVo;

@Service
public class LoginService {
	@Autowired
	private Prnt04UsrDao dao;	
	@Autowired
	private Prnt03RoleMstrDao roleDao;	
	@Autowired
	private TrippleDes utilCls;

	public UserVo doLogin(UserVo vo) {
		// TODO Auto-generated method stub
		Prnt04Usr pojo = dao.findByPrnt04UsrId(vo.getUserName());
		UserVo returnVo = new UserVo();
		if(pojo!=null) {
			String decryptPass = utilCls.encrypt(vo.getPassword());
			if(pojo.getPrnt04Pass().trim().equals(decryptPass.trim())) {
				returnVo.setRole(pojo.getPrnt03RoleMstrId().getPrnt03RoleNme());
				returnVo.setUserName(pojo.getPrnt04UsrId());
				returnVo.setFirstName(pojo.getPrnt04FullNme());
				returnVo.setMoblNo(pojo.getPrnt04MbleNo());
				returnVo.setAuth(true);
			}else {
				returnVo.setAuth(false);
				returnVo.setMsg("Invalid Passwor");
			}
		}else {
			returnVo.setAuth(false);
			returnVo.setMsg("Invalid User Name");
		}
		return returnVo;
	}

	public UserVo userCheck(String userName) {
		// TODO Auto-generated method stub
		UserVo returnVo = new UserVo();
		Prnt04Usr pojo = dao.findByPrnt04UsrId(userName);
		if(pojo != null) {
			returnVo.setErrFlg(true);
			returnVo.setMsg(userName +" is already taken. Please try with someother!");
		}else {
			returnVo.setErrFlg(false);
			returnVo.setMsg(userName +" is available.");
		}
		return returnVo;
	}

	public UserVo register(UserVo vo) {
		// TODO Auto-generated method stub
		UserVo returnVo = new UserVo();
		Prnt04Usr pojo = new Prnt04Usr();
		Prnt03RoleMstr role = roleDao.findByPrnt03RoleNme(vo.getRole());
		pojo.setPrnt04UsrId(vo.getUserName());
		pojo.setPrnt03RoleMstrId(role);
		pojo.setPrnt04Gender(vo.getGender());
		pojo.setPrnt04Addr(vo.getAddress());
		pojo.setPrnt04CrtDs("SAVE");
		pojo.setPrnt04CrtDt(new Date());
		pojo.setPrnt04CrtUr("JURI");
		pojo.setPrnt04Email(vo.getEmail());
		pojo.setPrnt04FullNme(vo.getFirstName());
		pojo.setPrnt04MbleNo(vo.getMoblNo());
		String encryPass = utilCls.encrypt(vo.getPassword());
		pojo.setPrnt04Pass(encryPass);
		pojo.setPrnt04UpdtDs("SAVE");
		pojo.setPrnt04UpdtDt(new Date());
		pojo.setPrnt04UpdtUr("JURI");
		returnVo.setErrFlg(false);		
		returnVo.setMsg("Enrolled successfully!");
		dao.save(pojo);
		return returnVo;
	}

	public UserVo getRoles() {
		// TODO Auto-generated method stub
		List<String> strLst = new ArrayList<>();
		List<Prnt03RoleMstr> lstPojo = roleDao.findAll();
		for(Prnt03RoleMstr pojo: lstPojo) {
			strLst.add(pojo.getPrnt03RoleNme());
		}
		UserVo vo = new UserVo();
		vo.setRoles(strLst);
		return vo;
	}
}
