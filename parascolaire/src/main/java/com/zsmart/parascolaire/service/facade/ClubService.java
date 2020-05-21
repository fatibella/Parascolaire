package com.zsmart.parascolaire.service.facade;

import com.zsmart.parascolaire.bean.Club;

import java.util.List;

public interface ClubService {

	public Club findById(Long id);

	public Club findByLibelle(String libelle);

	public List<Club> findAll();

	public int save(Club club);

	public int delete(Club club);

	public void deleteById(Long id);

	public void deleteByLibelle(String libelle);

//    	public Club saveWithTypes(Club club) ;

}
