package com.zsmart.parascolaire.model.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zsmart.parascolaire.bean.TypeClub;
import com.zsmart.parascolaire.dao.TypeClubDao;
import com.zsmart.parascolaire.model.facade.TypeClubService;

@Service
public class TypeClubServiceImpl implements TypeClubService{
	
	@Autowired
	private TypeClubDao typeClubDao;

	

	@Override
	public void save(TypeClub typeClub) {
		// TODO Auto-generated method stub
		typeClubDao.save(typeClub);
	}

	@Override
	public List<TypeClub> findAll() {
		// TODO Auto-generated method stub
		return typeClubDao.findAll();
	}

}
