package com.zsmart.parascolaire.service.facade;

import java.util.List;

import com.zsmart.parascolaire.bean.Responsabilite;

public interface ResponsabiliteService {

	public void save(Responsabilite responsabilite);

	public List<Responsabilite> findAll();

	public void deleteById(Long id);

	public Responsabilite findById(Long id);

}
