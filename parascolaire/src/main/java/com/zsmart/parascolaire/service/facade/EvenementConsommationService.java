package com.zsmart.parascolaire.service.facade;

import java.util.List;

import com.zsmart.parascolaire.bean.EvenementConsommation;

public interface EvenementConsommationService {

	public EvenementConsommation findById(Long id);

	public List<EvenementConsommation> findAll();

	public int save(EvenementConsommation evenementConsommation);

	public int delete(EvenementConsommation evenementConsommation);

	public void deleteById(Long id);

	public void totalBudgetConsomme(Double budgetConsomme, double montant);

}
