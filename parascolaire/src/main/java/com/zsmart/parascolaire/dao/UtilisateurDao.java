package com.zsmart.parascolaire.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zsmart.parascolaire.bean.Utilisateur;


@Repository
public interface UtilisateurDao extends JpaRepository<Utilisateur, Long>{
	
	
	
	   public List<Utilisateur> findAll();
	

}
