package com.zsmart.parascolaire.model.facade;

import java.util.List;

import com.zsmart.parascolaire.bean.Evenement;

public interface EvenementService {

	   public void save(Evenement evenement);
	   
		public List<Evenement> findAll();
}
