package com.rituraj.employeePayrollApp.service;

import com.rituraj.employeePayrollApp.dto.EmployeePostDTO;
import com.rituraj.employeePayrollApp.dto.SalaryUpdateByIdDTO;
import com.rituraj.employeePayrollApp.model.EmployeePayroll;
import com.rituraj.employeePayrollApp.repo.EmployeeRepo;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    
    private EmployeeRepo employeeRepo;
    public EmployeeService(EmployeeRepo employeeRepo){
        this.employeeRepo = employeeRepo;
    }
    
    public List<EmployeePayroll> getAllEmployees() {
        return employeeRepo.findAll();
    }

    public String addEmployees(EmployeePostDTO employeePostDTO) {
        EmployeePayroll employeePayroll = new EmployeePayroll(0, employeePostDTO.getName(), employeePostDTO.getSalary(), employeePostDTO.getJoiningDate());
        employeeRepo.save(employeePayroll);
        return "Employee Added Successfully";
    }

    public String updateEmployeeSalary(SalaryUpdateByIdDTO salaryUpdateByIdDTO) {
        Optional<EmployeePayroll> optional = employeeRepo.findById(salaryUpdateByIdDTO.getId());
        if(optional.isPresent()){
            EmployeePayroll employeePayroll = optional.get();
            employeePayroll.setSalary(salaryUpdateByIdDTO.getSalary());
            employeeRepo.save(employeePayroll);
            return "Salary Updated Successfully";
        }
        return "No employee found!";
    }

    public String deleteEmployee(int id) {
        if(employeeRepo.existsById(id)){
            employeeRepo.deleteById(id);
        }

        return "No user found!";
    }
}
