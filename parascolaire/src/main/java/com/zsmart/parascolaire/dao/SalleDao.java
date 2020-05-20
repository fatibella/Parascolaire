package com.zsmart.parascolaire.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zsmart.parascolaire.bean.Salle;

@Repository
public interface SalleDao extends JpaRepository<Salle, Long>{
	
	
	   public List<Salle> findAll();

}
