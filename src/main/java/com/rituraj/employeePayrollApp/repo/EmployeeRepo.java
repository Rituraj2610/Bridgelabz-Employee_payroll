package com.rituraj.employeePayrollApp.repo;

import com.rituraj.employeePayrollApp.model.EmployeePayroll;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<EmployeePayroll, Integer> {
}
