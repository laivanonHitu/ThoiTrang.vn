package com.Trangsuc.vn.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "slide")
public class Slide {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "discount")
	private Double discount;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "content")
	private String content;
	
	@Column(name = "image")
	private String image;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Slide [id=" + id + ", discount=" + discount + ", title=" + title + ", content=" + content + ", image="
				+ image + "]";
	}

	public Slide(Integer id, Double discount, String title, String content, String image) {
		super();
		this.id = id;
		this.discount = discount;
		this.title = title;
		this.content = content;
		this.image = image;
	}

	public Slide() {
		super();
	}

	public Slide(Double discount, String title, String content, String image) {
		super();
		this.discount = discount;
		this.title = title;
		this.content = content;
		this.image = image;
	}
	
	
	
}
