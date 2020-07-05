package com.juri.printing.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.juri.printing.entity.Prnt02Bind;

@Repository
public interface Prnt02BindDao extends JpaRepository<Prnt02Bind, Integer>{

}
