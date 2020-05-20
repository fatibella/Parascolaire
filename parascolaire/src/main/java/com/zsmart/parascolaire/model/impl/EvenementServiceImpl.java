package com.zsmart.parascolaire.model.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zsmart.parascolaire.bean.Evenement;
import com.zsmart.parascolaire.dao.EvenementDao;
import com.zsmart.parascolaire.model.facade.EvenementService;

@Service
public class EvenementServiceImpl implements EvenementService{
	
	@Autowired
	private EvenementDao evenementDao;
	
	

	@Override
	public void save(Evenement evenement) {
		// TODO Auto-generated method stub
		evenementDao.save(evenement);
	}

	@Override
	public List<Evenement> findAll() {
		// TODO Auto-generated method stub
		return evenementDao.findAll();
	}

}
