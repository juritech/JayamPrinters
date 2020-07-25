package com.juri.printing.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.juri.printing.entity.Prnt03RoleMstr;
@Repository
public interface Prnt03RoleMstrDao extends JpaRepository<Prnt03RoleMstr, Long>{

	Prnt03RoleMstr findByPrnt03RoleNme(String role);

}
