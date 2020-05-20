package com.zsmart.parascolaire.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Salle implements Serializable{

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String libelle;
	
	
	public Salle(Long id, String libelle) {
		super();
		this.id = id;
		this.libelle = libelle;
	}
	public Salle() {
		super();
		// TODO Auto-generated constructor stub
	}
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
	
	
}
