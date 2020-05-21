package com.zsmart.parascolaire.service.facade;

import java.util.List;

import com.zsmart.parascolaire.bean.Utilisateur;

public interface UtilisateurService {

	public void save(Utilisateur utilisateur);

	public List<Utilisateur> findAll();

	public Utilisateur findById(Long id);

	public void deleteById(Long id);
}
