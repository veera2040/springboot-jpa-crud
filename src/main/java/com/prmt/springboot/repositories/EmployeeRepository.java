package com.prmt.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prmt.springboot.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
