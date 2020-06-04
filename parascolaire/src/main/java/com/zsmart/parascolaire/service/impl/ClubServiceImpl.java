package com.zsmart.parascolaire.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zsmart.parascolaire.bean.Club;
import com.zsmart.parascolaire.dao.ClubDao;
import com.zsmart.parascolaire.service.facade.ClubService;

@Service
public class ClubServiceImpl implements ClubService {

	@Autowired

	private ClubDao clubDao;

	@Override
	public int save(Club club) {

		if (club == null) {
			return 0;

		} else {
			Club foundedClub = findByLibelle(club.getLibelle());
			if (foundedClub != null) {
				return -1;
			} else {
				clubDao.save(club);
				return 1;
			}

		}
	}

	@Override
	public List<Club> findAll() {

		return clubDao.findAll();
	}

	@Override
	public Club findById(Long id) {

		return clubDao.getOne(id);
	}

	@Override
	public Club findByLibelle(String libelle) {

		return clubDao.findByLibelle(libelle);
	}

	@Override
	public void deleteById(Long id) {

		clubDao.deleteById(id);
	}

	@Override
	public void deleteByLibelle(String libelle) {

		clubDao.deleteByLibelle(libelle);
	}

	@Override
	public int delete(Club club) {
		if (club == null) {
			return -1;
		} else {
			clubDao.delete(club);
			return 1;
		}
	}

//	@Override
//	public Club saveWithTypes(Club club) {
//
//		if (club == null) {
//			return null;
//		} else {
//			if (club.getTy)) {
//				return null;
//			} else {
//				clubDao.save(club);
//				for (TypeClub typeClub : club.getTypeClub()) {
//					typeClub.setClub(club);
//					typeClubService.save(typeClub);
//				}
//				return club;
//			}
//		}
//	}

    public ClubDao getClubDao() {
        return clubDao;
    }

    public void setClubDao(ClubDao clubDao) {
        this.clubDao = clubDao;
    }

        
        
}
