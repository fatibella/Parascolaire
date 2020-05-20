package com.zsmart.parascolaire.model.facade;

import java.util.List;

import com.zsmart.parascolaire.bean.Salle;

public interface SalleService {

	
	   public void save(Salle salle);
	   public List<Salle> findAll();

}
