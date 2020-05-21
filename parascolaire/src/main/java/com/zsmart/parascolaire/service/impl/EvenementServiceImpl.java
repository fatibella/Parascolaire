package com.zsmart.parascolaire.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zsmart.parascolaire.bean.Club;
import com.zsmart.parascolaire.bean.Evenement;
import com.zsmart.parascolaire.dao.EvenementDao;
import com.zsmart.parascolaire.service.facade.EvenementService;

@Service
public class EvenementServiceImpl implements EvenementService {

	@Autowired

	private EvenementDao evenementDao;

	@Override
	public int save(Evenement evenement) {

		if (evenement == null) {
			return 0;

		} else {
			Evenement foundedEvenement = findByLibelle(evenement.getLibelle());
			if (foundedEvenement != null) {
				return -1;
			} else {
				evenementDao.save(evenement);
				return 1;
			}

		}
	}

	@Override
	public List<Evenement> findAll() {

		return evenementDao.findAll();
	}

	@Override
	public Evenement findById(Long id) {

		return evenementDao.getOne(id);
	}

	@Override
	public void deleteById(Long id) {

		evenementDao.deleteById(id);
	}

	@Override
	public int delete(Evenement evenement) {
		if (evenement == null) {
			return -1;
		} else {
			evenementDao.delete(evenement);
			return 1;
		}
	}

	@Override
	public Evenement findByLibelle(String libelle) {
		return evenementDao.findByLibelle(libelle);
	}

	@Override
	public void deleteByLibelle(String libelle) {
		evenementDao.deleteByLibelle(libelle);

	}

}
