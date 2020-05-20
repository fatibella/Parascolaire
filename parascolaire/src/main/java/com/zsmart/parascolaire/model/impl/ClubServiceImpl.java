package com.zsmart.parascolaire.model.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zsmart.parascolaire.bean.Club;
import com.zsmart.parascolaire.dao.ClubDao;
import com.zsmart.parascolaire.model.facade.ClubService;

@Service
public class ClubServiceImpl implements ClubService{
	
	@Autowired
	private ClubDao clubDao;
	
	
	@Override
	public void save(Club club) {
		// TODO Auto-generated method stub
		clubDao.save(club);
	}

	@Override
	public List<Club> findAll() {
		// TODO Auto-generated method stub
		return clubDao.findAll();
	}

	

}
