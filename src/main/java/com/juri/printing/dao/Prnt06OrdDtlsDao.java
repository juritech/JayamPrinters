package com.juri.printing.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.juri.printing.entity.Prnt06OrdDtls;
@Repository
public interface Prnt06OrdDtlsDao extends JpaRepository<Prnt06OrdDtls, Long>{

}
