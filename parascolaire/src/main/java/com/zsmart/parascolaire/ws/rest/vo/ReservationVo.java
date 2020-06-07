package com.zsmart.parascolaire.ws.rest.vo;

public class ReservationVo {

	private String id;
	private String dateDebut;
	private String dateDebutMin;
	private String dateDebutMax;

	private String dateFin;
	private String dateFinMin;
	private String dateFinMax;

	private ClubVo club;
	private EvenementVo evenement;
	private SalleVo salle;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public ClubVo getClub() {
		return club;
	}

	public void setClub(ClubVo club) {
		this.club = club;
	}

	public EvenementVo getEvenement() {
		return evenement;
	}

	public void setEvenement(EvenementVo evenement) {
		this.evenement = evenement;
	}

	public SalleVo getSalle() {
		return salle;
	}

	public void setSalle(SalleVo salle) {
		this.salle = salle;
	}

}
