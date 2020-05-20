package com.zsmart.parascolaire.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zsmart.parascolaire.bean.Evenement;

@Repository
public interface EvenementDao extends JpaRepository<Evenement, Long> {

	   public List<Evenement> findAll();
}
