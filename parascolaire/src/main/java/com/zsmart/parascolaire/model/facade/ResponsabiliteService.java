package com.zsmart.parascolaire.model.facade;

import java.util.List;

import com.zsmart.parascolaire.bean.Responsabilite;

public interface ResponsabiliteService {

	
	   public void save(Responsabilite responsabilite);
	   
		public List<Responsabilite> findAll();
	
}
