package com.zsmart.parascolaire.model.facade;

import java.util.List;

import com.zsmart.parascolaire.bean.Club;

public interface ClubService{
	
	   public void save(Club club);
	   
		public List<Club> findAll();

}
