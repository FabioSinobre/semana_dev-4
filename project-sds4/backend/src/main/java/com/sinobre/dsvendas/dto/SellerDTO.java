package com.sinobre.dsvendas.dto;

import java.io.Serializable;

import com.sinobre.dsvendas.entities.Seller;

public class SellerDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	
	public SellerDTO() {
	}

	public SellerDTO(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	public SellerDTO(Seller entity) {//este constutor serve para copiar os dados para um dto
		this.id = entity.getId();
		this.name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
