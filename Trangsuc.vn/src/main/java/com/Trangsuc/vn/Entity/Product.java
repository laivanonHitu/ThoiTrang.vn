package com.Trangsuc.vn.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "id_category")
	private Integer id_category;

	@Column(name = "sizes")
	private String sizes;

	@Column(name = "name")
	private String name;

	@Column(name = "price")
	private double price;

	@Column(name = "sale")
	private double sale;

	@Column(name = "title")
	private String title;

	@Column(name = "highlight")
	private Boolean highlight;

	@Column(name = "new_product")
	private Boolean new_product;

	@Column(name = "details")
	private String details;

	@Column(name = "created_at")
	private java.sql.Timestamp created_at;

	@Column(name = "updated_at")
	private java.sql.Timestamp updated_at;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId_category() {
		return id_category;
	}

	public void setId_category(Integer id_category) {
		this.id_category = id_category;
	}

	public String getSizes() {
		return sizes;
	}

	public void setSizes(String sizes) {
		this.sizes = sizes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getSale() {
		return sale;
	}

	public void setSale(double sale) {
		this.sale = sale;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Boolean getHighlight() {
		return highlight;
	}

	public void setHighlight(Boolean highlight) {
		this.highlight = highlight;
	}

	public Boolean getNew_product() {
		return new_product;
	}

	public void setNew_product(Boolean new_product) {
		this.new_product = new_product;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public java.sql.Timestamp getCreated_at() {
		return created_at;
	}

	public void setCreated_at(java.sql.Timestamp timestamp) {
		this.created_at = timestamp;
	}

	public java.sql.Timestamp getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(java.sql.Timestamp timestamp) {
		this.updated_at = timestamp;
	}

	public Product() {
	}
}
