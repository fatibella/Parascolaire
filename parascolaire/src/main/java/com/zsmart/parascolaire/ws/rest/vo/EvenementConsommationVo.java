package com.zsmart.parascolaire.ws.rest.vo;

public class EvenementConsommationVo {

	private String id;
	private String dateEvenementConsommation;
	private String dateEvenementConsommationMin;
	private String dateEvenementConsommationMax;
	private String montant;
	private String montantMin;
	private String montantMax;
	private EvenementVo evenement;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDateEvenementConsommation() {
		return dateEvenementConsommation;
	}

	public void setDateEvenementConsommation(String dateEvenementConsommation) {
		this.dateEvenementConsommation = dateEvenementConsommation;
	}

	public String getDateEvenementConsommationMin() {
		return dateEvenementConsommationMin;
	}

	public void setDateEvenementConsommationMin(String dateEvenementConsommationMin) {
		this.dateEvenementConsommationMin = dateEvenementConsommationMin;
	}

	public String getDateEvenementConsommationMax() {
		return dateEvenementConsommationMax;
	}

	public void setDateEvenementConsommationMax(String dateEvenementConsommationMax) {
		this.dateEvenementConsommationMax = dateEvenementConsommationMax;
	}

	public String getMontant() {
		return montant;
	}

	public void setMontant(String montant) {
		this.montant = montant;
	}

	public String getMontantMin() {
		return montantMin;
	}

	public void setMontantMin(String montantMin) {
		this.montantMin = montantMin;
	}

	public String getMontantMax() {
		return montantMax;
	}

	public void setMontantMax(String montantMax) {
		this.montantMax = montantMax;
	}

	public EvenementVo getEvenement() {
		return evenement;
	}

	public void setEvenement(EvenementVo evenement) {
		this.evenement = evenement;
	}

}
