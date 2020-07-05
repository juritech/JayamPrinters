package com.juri.printing.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.juri.printing.entity.Prnt05CustDtls;
@Repository
public interface Prnt05CustDtlsDao extends JpaRepository<Prnt05CustDtls, Long>{

}
