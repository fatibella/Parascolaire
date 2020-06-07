package com.zsmart.parascolaire.ws.rest.vo;

public class ClubVo {

	private String id;
	private String libelle;
	private String description;
	private String dateCreation;
	private String dateCreationMin;
	private String dateCreationMax;

	private TypeClubVo typeClub;

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

	public String getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
	}

	public String getDateCreationMin() {
		return dateCreationMin;
	}

	public void setDateCreationMin(String dateCreationMin) {
		this.dateCreationMin = dateCreationMin;
	}

	public String getDateCreationMax() {
		return dateCreationMax;
	}

	public void setDateCreationMax(String dateCreationMax) {
		this.dateCreationMax = dateCreationMax;

	}

	public TypeClubVo getTypeClub() {
		return typeClub;
	}

	public void setTypeClub(TypeClubVo typeClub) {
		this.typeClub = typeClub;
	}

}
