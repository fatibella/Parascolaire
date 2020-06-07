package com.zsmart.parascolaire.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class EvenementConsommation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Temporal(javax.persistence.TemporalType.DATE)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm")
	private Date dateEvenementConsommation;
	private Long montant;

	@ManyToOne
	private Evenement evenement;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDateEvenementConsommation() {
		return dateEvenementConsommation;
	}

	public void setDateEvenementConsommation(Date dateEvenementConsommation) {
		this.dateEvenementConsommation = dateEvenementConsommation;
	}

	public Long getMontant() {
		return montant;
	}

	public void setMontant(Long montant) {
		this.montant = montant;
	}

	public Evenement getEvenement() {
		return evenement;
	}

	public void setEvenement(Evenement evenement) {
		this.evenement = evenement;
	}

	public EvenementConsommation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EvenementConsommation(Long id, Date dateEvenementConsommation, Long montant, Evenement evenement) {
		super();
		this.id = id;
		this.dateEvenementConsommation = dateEvenementConsommation;
		this.montant = montant;
		this.evenement = evenement;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateEvenementConsommation == null) ? 0 : dateEvenementConsommation.hashCode());
		result = prime * result + ((evenement == null) ? 0 : evenement.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((montant == null) ? 0 : montant.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EvenementConsommation other = (EvenementConsommation) obj;
		if (dateEvenementConsommation == null) {
			if (other.dateEvenementConsommation != null)
				return false;
		} else if (!dateEvenementConsommation.equals(other.dateEvenementConsommation))
			return false;
		if (evenement == null) {
			if (other.evenement != null)
				return false;
		} else if (!evenement.equals(other.evenement))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (montant == null) {
			if (other.montant != null)
				return false;
		} else if (!montant.equals(other.montant))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "EvenementConsommation [id=" + id + ", dateEvenementConsommation=" + dateEvenementConsommation
				+ ", montant=" + montant + ", evenement=" + evenement + "]";
	}

}
