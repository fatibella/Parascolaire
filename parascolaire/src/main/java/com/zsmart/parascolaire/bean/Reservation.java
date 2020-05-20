package com.zsmart.parascolaire.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Reservation implements Serializable{

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@ManyToOne
	private Club club;
	@ManyToOne
	private Evenement evenement;
	@ManyToOne
	private Salle salle;
	private Date dateDebut;
	private Date dateFin;
	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Reservation(Long id, Club club, Evenement evenement, Salle salle, Date dateDebut, Date dateFin) {
		super();
		this.id = id;
		this.club = club;
		this.evenement = evenement;
		this.salle = salle;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Club getClub() {
		return club;
	}
	public void setClub(Club club) {
		this.club = club;
	}
	public Evenement getEvenement() {
		return evenement;
	}
	public void setEvenement(Evenement evenement) {
		this.evenement = evenement;
	}
	public Salle getSalle() {
		return salle;
	}
	public void setSalle(Salle salle) {
		this.salle = salle;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	
	
	
}
