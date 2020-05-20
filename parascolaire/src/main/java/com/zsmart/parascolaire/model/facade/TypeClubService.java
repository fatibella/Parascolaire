package com.zsmart.parascolaire.model.facade;

import java.util.List;

import com.zsmart.parascolaire.bean.TypeClub;

public interface TypeClubService {

	
	   public void save(TypeClub typeClub);
	   
		public List<TypeClub> findAll();
}
