package com.zsmart.parascolaire.service.facade;

import java.util.List;

import com.zsmart.parascolaire.bean.Evenement;

public interface EvenementService {

	
    	public Evenement findById(Long id);

    	public Evenement findByLibelle(String libelle);
	
        public  List<Evenement> findAll();
  
        public  int save(Evenement evenement); 
        
        public int delete(Evenement evenement);
        
        public void deleteById(Long id);
        
        public void deleteByLibelle(String libelle);
        
	
}
