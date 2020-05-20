package com.zsmart.parascolaire.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zsmart.parascolaire.bean.Responsabilite;



@Repository
public interface ResponsabiliteDao extends JpaRepository<Responsabilite, Long> {

	
	   public List<Responsabilite> findAll();
}
