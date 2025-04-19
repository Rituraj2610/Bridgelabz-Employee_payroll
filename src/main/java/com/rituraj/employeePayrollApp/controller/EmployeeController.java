package com.rituraj.employeePayrollApp.controller;

import com.rituraj.employeePayrollApp.dto.EmployeePostDTO;
import com.rituraj.employeePayrollApp.dto.SalaryUpdateByIdDTO;
import com.rituraj.employeePayrollApp.model.EmployeePayroll;
import com.rituraj.employeePayrollApp.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/employeepayroll")
public class EmployeeController {

    private EmployeeService employeeService;
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employee")
    public List<EmployeePayroll> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @PostMapping("/employee")
    public String addEmployees(@RequestBody EmployeePostDTO employeePostDTO){
        return employeeService.addEmployees(employeePostDTO);
    }

    @PutMapping("/salary")
    public String updateEmployeeSalary(@RequestBody SalaryUpdateByIdDTO salaryUpdateByIdDTO){
        return employeeService.updateEmployeeSalary(salaryUpdateByIdDTO);
    }

    @DeleteMapping("/employee")
    public String deleteEmployee(@RequestParam int id){
        return employeeService.deleteEmployee(id);
    }

}
