package com.zsmart.parascolaire.ws.rest.vo;

import java.util.List;

public class TypeClubVo {
	private String id;
	private String libelle;
	private String code;

	private List<ClubVo> clubsVo;

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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<ClubVo> getClubsVo() {
		return clubsVo;
	}

	public void setClubsVo(List<ClubVo> clubsVo) {
		this.clubsVo = clubsVo;
	}

}
