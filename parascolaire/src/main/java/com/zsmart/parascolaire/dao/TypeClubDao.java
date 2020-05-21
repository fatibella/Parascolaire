package com.zsmart.parascolaire.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zsmart.parascolaire.bean.TypeClub;

@Repository
public interface TypeClubDao extends JpaRepository<TypeClub, Long> {

	public TypeClub findByLibelle(String libelle);

	public TypeClub deleteByLibelle(String libelle);

}
