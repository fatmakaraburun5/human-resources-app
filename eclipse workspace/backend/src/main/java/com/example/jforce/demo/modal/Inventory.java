package com.example.jforce.demo.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="inventory")
public class Inventory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long inv_serial_num;

	@Column(name = "emp_pp")
	private String inv_type;

	@Column(name = "emp_name")
	private String inv_brand;
	
	@Column (name = "inv_model")
	private String inv_model;
	
	@Column(name= "inv_entry_date")
	private String inv_entry_date;
	
	@Column(name= "inv_situation")
	private String inv_situation;

	public Long getInv_serial_num() {
		return inv_serial_num;
	}

	public void setInv_serial_num(Long inv_serial_num) {
		this.inv_serial_num = inv_serial_num;
	}

	public String getInv_type() {
		return inv_type;
	}

	public void setInv_type(String inv_type) {
		this.inv_type = inv_type;
	}

	public String getInv_brand() {
		return inv_brand;
	}

	public void setInv_brand(String inv_brand) {
		this.inv_brand = inv_brand;
	}

	public String getInv_model() {
		return inv_model;
	}

	public void setInv_model(String inv_model) {
		this.inv_model = inv_model;
	}

	public String getInv_entry_date() {
		return inv_entry_date;
	}

	public void setInv_entry_date(String inv_entry_date) {
		this.inv_entry_date = inv_entry_date;
	}

	public String getInv_situation() {
		return inv_situation;
	}

	public void setInv_situation(String inv_situation) {
		this.inv_situation = inv_situation;
	}

}
