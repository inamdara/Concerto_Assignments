package com.concerto.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@ToString
public class Customer {
	
	@Column(name="customerName")
	private String customerName;
	
	@Column(name="customerAddress")
	private String customerAddress;	
	
	@Id
	@Column(name="customerEmailId")
	private String customerEmailId;
	
	@Column(name="customerIdentity")
	private String customerIdentity;
	
	@Column(name="annualIncome")
	private double annualIncome;
	
	@Column(name="incomeTaxReturnAttached")
	private boolean incomeTaxReturnAttached;
	
}
