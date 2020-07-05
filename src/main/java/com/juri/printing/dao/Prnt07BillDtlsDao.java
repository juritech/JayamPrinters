package com.juri.printing.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.juri.printing.entity.Prnt07BillDtls;

@Repository
public interface Prnt07BillDtlsDao extends JpaRepository<Prnt07BillDtls, Long>{

}
