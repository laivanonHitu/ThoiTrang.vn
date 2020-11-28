package com.Trangsuc.vn.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "decription_product")
public class decriptionProduct {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "decription")
	private String decription;

	@Column(name = "short_decripton")
	private String short_decripton;

	@Column(name = "id_product")
	private int id_product;

	@Column(name = "id_color")
	private int id_color;

	@Column(name = "id_category")
	private int id_category;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDecription() {
		return decription;
	}

	public void setDecription(String decription) {
		this.decription = decription;
	}

	public String getShort_decripton() {
		return short_decripton;
	}

	public void setShort_decripton(String short_decripton) {
		this.short_decripton = short_decripton;
	}

	

	public int getId_product() {
		return id_product;
	}

	public void setId_product(int id_product) {
		this.id_product = id_product;
	}

	public int getId_color() {
		return id_color;
	}

	public void setId_color(int id_color) {
		this.id_color = id_color;
	}

	public int getId_category() {
		return id_category;
	}

	public void setId_category(int id_category) {
		this.id_category = id_category;
	}

	public decriptionProduct() {
	}

}
