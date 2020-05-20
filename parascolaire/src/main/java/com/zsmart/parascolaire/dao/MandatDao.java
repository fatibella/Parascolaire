package com.zsmart.parascolaire.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zsmart.parascolaire.bean.Mandat;



@Repository
public interface MandatDao extends JpaRepository<Mandat, Long> {

	 
	   public List<Mandat> findAll();
}
