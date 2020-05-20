package com.zsmart.parascolaire.model.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zsmart.parascolaire.bean.Utilisateur;
import com.zsmart.parascolaire.dao.UtilisateurDao;
import com.zsmart.parascolaire.model.facade.UtilisateurService;

@Service
public class UtilisateurServiceImpl implements UtilisateurService{

	@Autowired
	private UtilisateurDao utilisateurDao;
	
	

	@Override
	public void save(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		utilisateurDao.save(utilisateur);
	}

	@Override
	public List<Utilisateur> findAll() {
		// TODO Auto-generated method stub
		return utilisateurDao.findAll();
	}
	
	

}
