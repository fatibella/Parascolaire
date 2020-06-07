package com.zsmart.parascolaire.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Club implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String libelle;
	private String description;

	@Temporal(javax.persistence.TemporalType.DATE)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private Date dateCreation;

	@ManyToOne
	private TypeClub typeClub;

	@OneToMany
	private List<Evenement> evenement;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public TypeClub getTypeClub() {
		return typeClub;
	}

	public void setTypeClub(TypeClub typeClub) {
		this.typeClub = typeClub;
	}

	public List<Evenement> getEvenement() {
		return evenement;
	}

	public void setEvenement(List<Evenement> evenement) {
		this.evenement = evenement;
	}

	public Club() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Club(Long id, String libelle, String description, Date dateCreation, TypeClub typeClub,
			List<Evenement> evenement) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.description = description;
		this.dateCreation = dateCreation;
		this.typeClub = typeClub;
		this.evenement = evenement;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateCreation == null) ? 0 : dateCreation.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((evenement == null) ? 0 : evenement.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((libelle == null) ? 0 : libelle.hashCode());
		result = prime * result + ((typeClub == null) ? 0 : typeClub.hashCode());
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
		Club other = (Club) obj;
		if (dateCreation == null) {
			if (other.dateCreation != null)
				return false;
		} else if (!dateCreation.equals(other.dateCreation))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
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
		if (libelle == null) {
			if (other.libelle != null)
				return false;
		} else if (!libelle.equals(other.libelle))
			return false;
		if (typeClub == null) {
			if (other.typeClub != null)
				return false;
		} else if (!typeClub.equals(other.typeClub))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Club [id=" + id + ", libelle=" + libelle + ", description=" + description + ", dateCreation="
				+ dateCreation + ", typeClub=" + typeClub + ", evenement=" + evenement + "]";
	}

}
