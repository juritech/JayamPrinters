package com.juri.printing.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.juri.printing.entity.Prnt01Page;

@Repository
public interface Prnt01PageDao extends JpaRepository<Prnt01Page, Integer>{

}
