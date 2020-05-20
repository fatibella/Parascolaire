package com.zsmart.parascolaire.model.facade;

import java.util.List;

import com.zsmart.parascolaire.bean.Utilisateur;



public interface UtilisateurService {

	
	   public void save(Utilisateur utilisateur);
	   
		public List<Utilisateur> findAll();
}
