package com.example.jforce.demo.modal;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="account_type")
public class AccountType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long a_type_id;

	@Column(name = "name")
	private String name;

	
	public Long getA_type_id() {
		return a_type_id;
	}

	public void setA_type_id(Long a_type_id) {
		this.a_type_id = a_type_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	
	
}
