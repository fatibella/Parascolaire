package com.zsmart.parascolaire.service.facade;

import java.util.List;

import com.zsmart.parascolaire.bean.Mandat;

public interface MandatService {

	public void save(Mandat mandat);

	public List<Mandat> findAll();

	public Mandat findById(Long id);

	public int delete(Mandat mandat);

	public void deleteById(Long id);

}
