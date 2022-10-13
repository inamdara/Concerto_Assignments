package com.concerto.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@ToString
public class Loan {
	
	@Id
	@Column(name="loanId")
	private String loanId;
	
	@Column(name="loanType")
	private String loanType;
	
	@Column(name="loanAmount")
	private double loanAmount;
	
	@Column(name="interestRate")
	private double interestRate;
	
	@Column(name="period")
	private double period;
	
	@Column(name="isApproval")
	private boolean isApproval;
	
	@Column(name="remarks")
	private String remarks;
	
	@Embedded
	private List<Collateral> collaterals;
	
	@JsonIgnore
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "customerEmailId")
	private Customer customer;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "employeeId")
	private Employee employee;


	
}
