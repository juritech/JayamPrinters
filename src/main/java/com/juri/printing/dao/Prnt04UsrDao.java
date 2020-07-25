package com.juri.printing.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.juri.printing.entity.Prnt04Usr;
@Repository
public interface Prnt04UsrDao extends JpaRepository<Prnt04Usr, String>{

	Prnt04Usr findByPrnt04UsrId(String userName);

}
