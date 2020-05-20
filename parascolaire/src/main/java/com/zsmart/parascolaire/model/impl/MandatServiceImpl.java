package com.zsmart.parascolaire.model.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zsmart.parascolaire.bean.Mandat;
import com.zsmart.parascolaire.dao.MandatDao;

import com.zsmart.parascolaire.model.facade.MandatService;

@Service
public class MandatServiceImpl implements MandatService{

	@Autowired
	private MandatDao mandatDao;
	
	
	@Override
	public void save(Mandat mandat) {
		// TODO Auto-generated method stub
		mandatDao.save(mandat);
	}

	@Override
	public List<Mandat> findAll() {
		// TODO Auto-generated method stub
		return mandatDao.findAll();
	}
	
	

}
