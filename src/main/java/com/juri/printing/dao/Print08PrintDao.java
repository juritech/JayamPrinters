package com.juri.printing.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.juri.printing.entity.Prnt08Print;

@Repository
public interface Print08PrintDao extends JpaRepository<Prnt08Print, Integer>{

	Prnt08Print findByPrnt08PrintTypeAndPrnt08Range(String printName, String range);
	
}
