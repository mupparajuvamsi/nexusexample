package com.example.crudrestapiexample;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customerinfo")
public class customerinfo {
	@Id
	public String mobileno;

	@Override
	public String toString() {
		return "customerinfo [mobileno=" + mobileno + ", amount=" + amount + "]";
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public  String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	@Column(name = "amount")
	public  String amount;

}
