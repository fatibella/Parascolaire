package com.zsmart.parascolaire.model.facade;

import java.util.List;

import com.zsmart.parascolaire.bean.Mandat;


public interface MandatService {

	
	   public void save(Mandat mandat);
	   
		public List<Mandat> findAll();
	
}
