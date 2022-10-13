package com.concerto.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Collateral {

	@Id
	@Column(name="collateralId")
	private String collateralId;
	
	@Column(name="collateralType")
	private String collateralType;
	
}
