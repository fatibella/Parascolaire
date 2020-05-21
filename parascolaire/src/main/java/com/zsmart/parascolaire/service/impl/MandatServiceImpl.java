package com.zsmart.parascolaire.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zsmart.parascolaire.bean.Mandat;
import com.zsmart.parascolaire.dao.MandatDao;
import com.zsmart.parascolaire.service.facade.MandatService;

@Service
public class MandatServiceImpl implements MandatService {

	@Autowired
	private MandatDao mandatDao;

	@Override
	public void save(Mandat mandat) {
		mandatDao.save(mandat);
	}

	@Override
	public List<Mandat> findAll() {
		return mandatDao.findAll();
	}

	@Override
	public Mandat findById(Long id) {
		return mandatDao.getOne(id);
	}

	@Override
	public int delete(Mandat mandat) {
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		mandatDao.deleteById(id);

	}

}
