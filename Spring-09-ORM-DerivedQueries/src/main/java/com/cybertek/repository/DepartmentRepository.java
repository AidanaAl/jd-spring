package com.cybertek.repository;

import com.cybertek.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, String> {

    //Display all the Toys  Departments
    List<Department> findByDepartment(String department);

    //Display all the departments in the Health Division
    List<Department> findByDivision(String division);

    //Display all the departments in the Health Division
    List<Department> findByDivisionIs(String division);

    //Display all the departments in the Health Division
    List<Department> findByDivisionEquals(String division);

    //Display all Departments with Division name end with "ics"
    List<Department> findByDivisionEndsWith(String pattern);

    //Display top 3 departments with division name includes "Hea" without duplicates
    List<Department> findDistinctTop3ByDivisionContains(String pattern);



}
