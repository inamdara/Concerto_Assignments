package com.concerto.demo.constants;

import java.util.ArrayList;

import com.concerto.demo.model.Collateral;

public class LoanConstants {

	public static final ArrayList<Collateral> COLLATERAL_TYPE = new ArrayList<Collateral>();
	public static final String LOAN_TYPE[]= {"Buying home","Vehicle","Education","Marriage","Hospitalization"};		
	public static final String ID_TYPE[]= {"Passport", "Driving license","Aadhar Card"};
	public static final String LOANTABLE = "LOAN";
	public static final String CUSTOMERTABLE = "CUSTOMER";
	public static final String EMPLOYEETABLE = "EMPLOYEE";
	public static final String LOANCOLLATERALTABLE = "LOAN_COLLATERAL";
	public static final String COLLATERALTABLE = "COLLATERAL";
	
	public static double calculateRate(double period)
	{
		if(period <= 2)
			return 0.05;
		else if(period >2 && period <5)
			return 0.06;
		else if(period >=5 && period < 8)
			return 0.08;
		else
			return 0.085;
	}
}
