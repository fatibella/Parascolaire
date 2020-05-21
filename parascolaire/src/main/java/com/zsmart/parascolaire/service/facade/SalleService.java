package com.zsmart.parascolaire.service.facade;

import java.util.List;

import com.zsmart.parascolaire.bean.Salle;

public interface SalleService {

	public void save(Salle salle);

	public List<Salle> findAll();

	public Salle findById(Long id);

	public void deleteById(Long id);

}
