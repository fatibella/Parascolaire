package com.zsmart.parascolaire.model.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zsmart.parascolaire.bean.Responsabilite;
import com.zsmart.parascolaire.dao.ResponsabiliteDao;
import com.zsmart.parascolaire.model.facade.ResponsabiliteService;

@Service
public class ResponsabiliteServiceImpl implements ResponsabiliteService{
	
	@Autowired
	private ResponsabiliteDao responsabiliteDao;

	
	@Override
	public void save(Responsabilite responsabilite) {
		// TODO Auto-generated method stub
		responsabiliteDao.save(responsabilite);
	}

	@Override
	public List<Responsabilite> findAll() {
		// TODO Auto-generated method stub
		return responsabiliteDao.findAll();
	}

}
