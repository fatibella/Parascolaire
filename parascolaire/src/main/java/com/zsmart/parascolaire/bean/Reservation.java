package com.zsmart.parascolaire.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Reservation implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Temporal(javax.persistence.TemporalType.DATE)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm")
	private Date dateDebut;

	@Temporal(javax.persistence.TemporalType.DATE)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm")
	private Date dateFin;

	@ManyToOne
	private Club club;
	@ManyToOne
	private Evenement evenement;
	@ManyToOne
	private Salle salle;

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

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 97 * hash + Objects.hashCode(this.id);
		hash = 97 * hash + Objects.hashCode(this.club);
		hash = 97 * hash + Objects.hashCode(this.evenement);
		hash = 97 * hash + Objects.hashCode(this.salle);
		hash = 97 * hash + Objects.hashCode(this.dateDebut);
		hash = 97 * hash + Objects.hashCode(this.dateFin);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Reservation other = (Reservation) obj;
		if (!Objects.equals(this.id, other.id)) {
			return false;
		}
		if (!Objects.equals(this.club, other.club)) {
			return false;
		}
		if (!Objects.equals(this.evenement, other.evenement)) {
			return false;
		}
		if (!Objects.equals(this.salle, other.salle)) {
			return false;
		}
		if (!Objects.equals(this.dateDebut, other.dateDebut)) {
			return false;
		}
		if (!Objects.equals(this.dateFin, other.dateFin)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Reservation{" + "id=" + id + ", club=" + club + ", evenement=" + evenement + ", salle=" + salle
				+ ", dateDebut=" + dateDebut + ", dateFin=" + dateFin + '}';
	}

}
