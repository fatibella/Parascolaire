package com.zsmart.parascolaire.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zsmart.parascolaire.bean.Evenement;
import com.zsmart.parascolaire.bean.EvenementConsommation;
import com.zsmart.parascolaire.dao.EvenementConsommationDao;
import com.zsmart.parascolaire.service.facade.EvenementConsommationService;

@Service
public class EvenementConsommeServiceImpl implements EvenementConsommationService {

	@Autowired
	private EvenementConsommationDao evenementConsommationDao;

	@Override
	public int save(EvenementConsommation evenementConsommation) {

		if (evenementConsommationDao == null) {
			return 0;
		} else {

			evenementConsommationDao.save(evenementConsommation);
			return 1;
		}

	}

	@Override
	public List<EvenementConsommation> findAll() {
		return evenementConsommationDao.findAll();
	}

	@Override
	public int delete(EvenementConsommation evenementConsommation) {
		if (evenementConsommation == null) {
			return -1;
		} else {
			evenementConsommationDao.delete(evenementConsommation);
			return 1;
		}
	}

	@Override
	public void deleteById(Long id) {

		evenementConsommationDao.deleteById(id);

	}

	@Override
	public void totalBudgetConsomme(Double budgetConsomme, double montant) {

	}

	@Override
	public EvenementConsommation findById(Long id) {

		return evenementConsommationDao.getOne(id);
	}

    public EvenementConsommationDao getEvenementConsommationDao() {
        return evenementConsommationDao;
    }

    public void setEvenementConsommationDao(EvenementConsommationDao evenementConsommationDao) {
        this.evenementConsommationDao = evenementConsommationDao;
    }
        
        
        
        
}
