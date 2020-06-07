package com.zsmart.parascolaire.ws.rest.vo;

import java.util.List;

public class EvenementVo {

	private String id;
	private String libelle;
	private String description;
	private String dateDebut;
	private String dateDebutMin;
	private String dateDebutMax;
	private String dateFin;
	private String dateFinMin;
	private String dateFinMax;
	private String budgetCollecte;
	private String budgetCollecteMin;
	private String budgetCollecteMax;
	private String budgetConsomme;
	private String budgetConsommeMin;
	private String budgetConsommeMax;

	private ClubVo club;

	private List<EvenementConsommationVo> evenementConsommationsVo;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}

	public String getDateDebutMin() {
		return dateDebutMin;
	}

	public void setDateDebutMin(String dateDebutMin) {
		this.dateDebutMin = dateDebutMin;
	}

	public String getDateDebutMax() {
		return dateDebutMax;
	}

	public void setDateDebutMax(String dateDebutMax) {
		this.dateDebutMax = dateDebutMax;
	}

	public String getDateFin() {
		return dateFin;
	}

	public void setDateFin(String dateFin) {
		this.dateFin = dateFin;
	}

	public String getDateFinMin() {
		return dateFinMin;
	}

	public void setDateFinMin(String dateFinMin) {
		this.dateFinMin = dateFinMin;
	}

	public String getDateFinMax() {
		return dateFinMax;
	}

	public void setDateFinMax(String dateFinMax) {
		this.dateFinMax = dateFinMax;
	}

	public String getBudgetCollecte() {
		return budgetCollecte;
	}

	public void setBudgetCollecte(String budgetCollecte) {
		this.budgetCollecte = budgetCollecte;
	}

	public String getBudgetCollecteMin() {
		return budgetCollecteMin;
	}

	public void setBudgetCollecteMin(String budgetCollecteMin) {
		this.budgetCollecteMin = budgetCollecteMin;
	}

	public String getBudgetCollecteMax() {
		return budgetCollecteMax;
	}

	public void setBudgetCollecteMax(String budgetCollecteMax) {
		this.budgetCollecteMax = budgetCollecteMax;
	}

	public String getBudgetConsomme() {
		return budgetConsomme;
	}

	public void setBudgetConsomme(String budgetConsomme) {
		this.budgetConsomme = budgetConsomme;
	}

	public String getBudgetConsommeMin() {
		return budgetConsommeMin;
	}

	public void setBudgetConsommeMin(String budgetConsommeMin) {
		this.budgetConsommeMin = budgetConsommeMin;
	}

	public String getBudgetConsommeMax() {
		return budgetConsommeMax;
	}

	public void setBudgetConsommeMax(String budgetConsommeMax) {
		this.budgetConsommeMax = budgetConsommeMax;
	}

	public ClubVo getClub() {
		return club;
	}

	public void setClub(ClubVo club) {
		this.club = club;
	}

	public List<EvenementConsommationVo> getEvenementConsommationsVo() {
		return evenementConsommationsVo;
	}

	public void setEvenementConsommationsVo(List<EvenementConsommationVo> evenementConsommationsVo) {
		this.evenementConsommationsVo = evenementConsommationsVo;
	}

}
