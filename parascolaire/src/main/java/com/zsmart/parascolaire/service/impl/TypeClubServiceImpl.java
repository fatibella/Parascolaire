package com.zsmart.parascolaire.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zsmart.parascolaire.bean.Evenement;
import com.zsmart.parascolaire.bean.TypeClub;
import com.zsmart.parascolaire.dao.TypeClubDao;
import com.zsmart.parascolaire.service.facade.TypeClubService;

@Service
public class TypeClubServiceImpl implements TypeClubService {

	@Autowired

	private TypeClubDao typeClubDao;

	@Override
	public int save(TypeClub typeClub) {

		if (typeClub == null) {
			return 0;

		} else {
			TypeClub foundedTypeClub = findByLibelle(typeClub.getLibelle());
			if (foundedTypeClub != null) {
				return -1;
			} else {
				typeClubDao.save(typeClub);
				return 1;
			}

		}
	}

	@Override
	public List<TypeClub> findAll() {

		return typeClubDao.findAll();
	}

	@Override
	public TypeClub findById(Long id) {

		return typeClubDao.getOne(id);
	}

	@Override
	public TypeClub findByLibelle(String libelle) {

		return typeClubDao.findByLibelle(libelle);
	}

	@Override
	public void deleteById(Long id) {

		typeClubDao.deleteById(id);
	}

	@Override
	public void deleteByLibelle(String libelle) {

		typeClubDao.deleteByLibelle(libelle);
	}

	@Override
	public int delete(TypeClub typeClub) {
		if (typeClub == null) {
			return -1;
		} else {
			typeClubDao.delete(typeClub);
			return 1;
		}
	}

    public TypeClubDao getTypeClubDao() {
        return typeClubDao;
    }

    public void setTypeClubDao(TypeClubDao typeClubDao) {
        this.typeClubDao = typeClubDao;
    }

}
