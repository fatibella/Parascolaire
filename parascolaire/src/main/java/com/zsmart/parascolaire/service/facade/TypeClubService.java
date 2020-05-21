package com.zsmart.parascolaire.service.facade;

import java.util.List;

import com.zsmart.parascolaire.bean.TypeClub;

public interface TypeClubService {

	public TypeClub findById(Long id);

	public TypeClub findByLibelle(String libelle);

	public List<TypeClub> findAll();

	public int save(TypeClub typeClub);

	public int delete(TypeClub typeClub);

	public void deleteById(Long id);

	public void deleteByLibelle(String libelle);
}
