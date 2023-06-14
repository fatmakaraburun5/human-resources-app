package com.example.jforce.demo.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employees_inventory")
public class EmployeesInventory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long emp_inv_id;

//2 id olmalı 
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Integer emp_id;

	@Column(name = "inv_serial_num")
	private Integer inv_serial_num;

	@Column(name = "issue_date")
	private String issue_date;

	@Column(name = "emp_deliver") 
	private String emp_deliver;//sor - char string

	@Column(name = "emp_receive")
	private String emp_receive; //sor - char string
		
	public Long getEmp_inv_id() {
		return emp_inv_id;
	}

	public void setEmp_inv_id(Long emp_inv_id) {
		this.emp_inv_id = emp_inv_id;
	}

	public Integer getInv_serial_num() {
		return inv_serial_num;
	}

	public void setInv_serial_num(Integer inv_serial_num) {
		this.inv_serial_num = inv_serial_num;
	}

	public String getIssue_date() {
		return issue_date;
	}

	public void setIssue_date(String issue_date) {
		this.issue_date = issue_date;
	}

	public String getEmp_deliver() {
		return emp_deliver;
	}

	public void setEmp_deliver(String emp_deliver) {
		this.emp_deliver = emp_deliver;
	}

	public String getEmp_receive() {
		return emp_receive;
	}

	public void setEmp_receive(String emp_receive) {
		this.emp_receive = emp_receive;
	}

	
}
