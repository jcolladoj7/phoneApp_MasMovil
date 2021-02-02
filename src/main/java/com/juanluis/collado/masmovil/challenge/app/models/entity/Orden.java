package com.juanluis.collado.masmovil.challenge.app.models.entity;

import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Orden {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nameCustomer;
	private String surnameCustomer;
	private String emailCustomer;
	private Double amount;
	@ManyToMany
	@JoinTable(name = "phones_orders",joinColumns = @JoinColumn(name ="ordenid"),inverseJoinColumns = @JoinColumn(name="phoneid"))
	private List<Phone> phoneList;
	public Orden(Integer id, String nameCustomer, String surnameCustomer, String emailCustomer,List<Phone> phoneList,
			 Double amount) {
		super();
		this.id = id;
		this.nameCustomer = nameCustomer;
		this.surnameCustomer = surnameCustomer;
		this.emailCustomer = emailCustomer;
		this.phoneList = phoneList;
		this.amount = amount;
	}

	public Orden() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNameCustomer() {
		return nameCustomer;
	}

	public void setNameCustomer(String nameCustomer) {
		this.nameCustomer = nameCustomer;
	}

	public String getSurnameCustomer() {
		return surnameCustomer;
	}

	public void setSurnameCustomer(String surnameCustomer) {
		this.surnameCustomer = surnameCustomer;
	}

	public String getEmailCustomer() {
		return emailCustomer;
	}

	public void setEmailCustomer(String emailCustomer) {
		this.emailCustomer = emailCustomer;
	}

	public List<Phone> getPhoneList() {
		return phoneList;
	}

	public void setPhoneList(List<Phone> phoneList) {
		this.phoneList = phoneList;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	

	@Override
	public boolean equals(Object obj) {

		Orden order = (Orden) obj;
		return Objects.equals(id, order.id) || (Objects.equals(this.nameCustomer, order.nameCustomer)
				&& Objects.equals(this.surnameCustomer, order.surnameCustomer)
				&& Objects.equals(this.emailCustomer, order.emailCustomer)
				);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Order: ");
		sb.append(id).append(" - ").append(nameCustomer).append(" ").append(surnameCustomer).append(" (")
				.append(emailCustomer).append(") - ");
		return sb.toString();
	}

}
