package com.zsmart.parascolaire.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zsmart.parascolaire.bean.Evenement;

@Repository
public interface EvenementDao extends JpaRepository<Evenement, Long> {

	public Evenement deleteById(String id);

	public Evenement findByLibelle(String libelle);

	public void deleteByLibelle(String libelle);
}
