package com.concerto.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.concerto.demo.model.Collateral;
import com.concerto.demo.model.Customer;
import com.concerto.demo.model.Employee;
import com.concerto.demo.model.Loan;
import com.concerto.demo.repository.CollateralRepository;
import com.concerto.demo.repository.LoanRepository;
import com.concerto.demo.service.EmployeeService;

@SpringBootApplication
public class LoanProposalSuvidhaBankApplication {
	
	@Autowired
	LoanRepository loanRepository;
	
	@Autowired
	CollateralRepository collateralRepository;
	
	@Autowired
	EmployeeService employeeService;
	

	public static void main(String[] args) {
		SpringApplication.run(LoanProposalSuvidhaBankApplication.class, args);
	}
	
	@Bean
	public void initialize() {
		//Adding Customer
		Customer cust = new Customer();		
		cust.setCustomerName("asif");
		cust.setCustomerAddress("nasik");
		cust.setCustomerEmailId("asif@gmail.com");
		cust.setCustomerIdentity("111");
		cust.setAnnualIncome(10000.0);
		cust.setIncomeTaxReturnAttached(true);
		
		Collateral co1 = new Collateral();
		co1.setCollateralId("101");
		co1.setCollateralType("Test101");
		collateralRepository.save(co1);
		
		Collateral co2 = new Collateral();
		co2.setCollateralId("102");
		co2.setCollateralType("Test101");
		collateralRepository.save(co2);
		
		Employee emp=new Employee();
		emp.setEmployeeId(101+"");
		emp.setEmployeeName("Employee"+101);
		
		Loan loan = new Loan();
		loan.setLoanId("11");
		loan.setLoanType("vehicle");
		loan.setLoanAmount(20000.0);
		loan.setInterestRate(8.0);
		loan.setPeriod(3.0);
		loan.setApproval(true);
		loan.setRemarks("test");
		loan.setCustomer(cust);
		loan.setEmployee(emp);		
		
		this.loanRepository.save(loan);
		
		for(int i=1;i<=10;i++) {
			Employee e=new Employee();
			e.setEmployeeId(""+i);
			e.setEmployeeName("Employee"+(i));
			this.employeeService.addEmployee(e);
		}		
		
		
	}

}
