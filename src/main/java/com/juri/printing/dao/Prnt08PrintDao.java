package com.juri.printing.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.juri.printing.entity.Prnt08Print;

@Repository
public interface Prnt08PrintDao extends JpaRepository<Prnt08Print, Integer> {

	@Query("select e from Prnt08Print e where e.prnt08PrintType = :printName and e.prnt08Range = :range")
	Prnt08Print findByPrnt08PrintTypeAndPrnt08Range(@Param("printName") String printName,@Param("range") String range);

}
