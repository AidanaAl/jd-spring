package com.cybertek;

import com.cybertek.repository.DepartmentRepository;
import com.cybertek.repository.EmployeeRepository;
import com.cybertek.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.time.LocalDate;

@SpringBootApplication
public class DerivequeriesApplication {

	@Autowired
	RegionRepository regionRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(DerivequeriesApplication.class, args);
	}

	@PostConstruct
	public void testRegions(){
		System.out.println("--------------Region Starts----------");

		System.out.println("findByCountry: "+regionRepository.findByCountry("Canada"));
		System.out.println("findDistinctByCountry: "+regionRepository.findDistinctByCountry("Canada"));
		System.out.println("findDistinctByCountry: "+regionRepository.findDistinctByCountry("United"));
		System.out.println("findByCountryContaining: "+regionRepository.findByCountryContaining("United"));
		System.out.println("findByCountryContainingOrderByRegion: "+regionRepository.findByCountryContainingOrderByRegion("United"));
		System.out.println("findTop2ByCountry: "+regionRepository.findTop2ByCountry("Canada"));

		System.out.println("--------------Region Ends----------");

	}

	@PostConstruct
	public void testDepartment(){

		System.out.println("--------------Department Starts----------");

		System.out.println("findByDepartment: "+departmentRepository.findByDepartment("Toys"));
		System.out.println("findByDivision: "+departmentRepository.findByDivision("Health"));
		System.out.println("findByDivisionIs: "+departmentRepository.findByDivisionIs("Health"));
		System.out.println("findByDivisionEquals: "+departmentRepository.findByDivisionEquals("Health"));
		System.out.println("findByDivisionEndsWith: "+departmentRepository.findByDivisionEndsWith("ics"));
		System.out.println("findDistinctTop3ByDivisionContains: "+departmentRepository.findDistinctTop3ByDivisionContains("Health"));

		System.out.println("--------------Department Ends----------");

	}

	@PostConstruct
	public void testEmployee(){

		System.out.println("--------------Employee Starts----------");

		System.out.println("findByEmail: "+employeeRepository.findByEmail("bmanueau0@dion.ne.jp"));
		System.out.println("findByFirstNameAndLastNameOrEmail: "
				+employeeRepository.findByFirstNameAndLastNameOrEmail("Sydney", "Symonds", "fmorffew4@a8.net"));
		System.out.println("findByFirstNameIsNot: "+employeeRepository.findByFirstNameIsNot("Sydney"));
		System.out.println("findByLastNameStartsWith: "+employeeRepository.findByLastNameStartsWith("Al"));
		System.out.println("findBySalaryGreaterThan: "+employeeRepository.findBySalaryGreaterThan(90000));
		System.out.println("findBySalaryLessThanEqual: "+employeeRepository.findBySalaryLessThanEqual(94635));
		System.out.println("findByHireDateBetween: "+employeeRepository.findByHireDateBetween(LocalDate.now().minusYears(7),LocalDate.now().minusYears(6)));
		System.out.println("findBySalaryGreaterThanEqualOrderBySalaryDesc: "+employeeRepository.findBySalaryGreaterThanEqualOrderBySalaryDesc(94635));
		System.out.println("findDistinctTop3BySalaryLessThan: "+employeeRepository.findDistinctTop3BySalaryLessThan(94635));
		System.out.println("findByEmailIsNull: "+employeeRepository.findByEmailIsNull());

		System.out.println("--------------Employee Ends----------");

	}


}
