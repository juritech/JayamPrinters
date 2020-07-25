package com.juri.printing.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.juri.printing.entity.Prnt01Page;

@Repository
public interface Prnt01PageDao extends JpaRepository<Prnt01Page, Long>{

	@Query("select e from Prnt01Page e where e.prnt01PageSize = :paperSize and e.prnt01PageGsm = :gsm")
	Prnt01Page findByPrnt01PageSizeAndPrnt01PageGsm(@Param("paperSize") String paperSize, @Param("gsm") String gsm);

}
