package com.juri.printing.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.juri.printing.entity.Prnt02Bind;

@Repository
public interface Prnt02BindDao extends JpaRepository<Prnt02Bind, Integer>{

	@Query("select e from Prnt02Bind e where e.prnt02BindType = :bindType and e.prnt02Size = :bindSize")
	Prnt02Bind findByPrnt02BindTypeAndPrnt02Size(@Param("bindType") String bindType,@Param("bindSize") String bindSize);

}
