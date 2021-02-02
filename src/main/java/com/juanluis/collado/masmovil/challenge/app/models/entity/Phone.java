package com.juanluis.collado.masmovil.challenge.app.models.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Phone {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String image;
	private String name;
	private String description;
	private Double price;
	public Phone(Integer id, String image, String name, String description, Double price) {
		super();
		this.id = id;
		this.image = image;
		this.name = name;
		this.description = description;
		this.price = price;
	}

	public Phone() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	
	@Override
	public boolean equals(Object obj) {

		Phone phone = (Phone) obj;
		return Objects.equals(id, phone.id) || (Objects.equals(this.name, phone.name)
				&& Objects.equals(this.description, phone.description) && Objects.equals(this.price, phone.price));
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Phone ");
		sb.append(id).append(": ").append(name).append(" - ").append(description).append(". Price: ").append(price);
		return sb.toString();
	}

}
