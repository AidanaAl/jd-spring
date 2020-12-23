package com.cybertek.repository;

import com.cybertek.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {


    //Display all employees with email address "..."
    List<Employee> findByEmail(String email);

    //Display all employees with name ".." and lastName "..", also show all the employees with a email address ".."
    List<Employee> findByFirstNameAndLastNameOrEmail(String name, String lastName, String email);

    //Display all employees that firstName is not "..."
    List<Employee> findByFirstNameIsNot(String firstName);

    //Display all employees where lastName starts with "..."
    List<Employee> findByLastNameStartsWith(String lastName);

    //Display all employees with salary higher then ".."
    List<Employee> findBySalaryGreaterThan(Integer salary);

    //Display all employees with salary less then ".."
    List<Employee> findBySalaryLessThanEqual(Integer salary);

    //Display all employees that has beed hired between ".." and ".." date
    List<Employee> findByHireDateBetween(LocalDate startDate, LocalDate endDate);


    //Display all employees where salaries greater and equal to " " in order
    List<Employee> findBySalaryGreaterThanEqualOrderBySalaryDesc(Integer salary);

    //Display top 3 employees that are making less then ".."
    List<Employee> findDistinctTop3BySalaryLessThan(Integer salary);

    //Display all employees that do not have email addresses
    @Transactional
    List<Employee> findByEmailIsNull();

}
