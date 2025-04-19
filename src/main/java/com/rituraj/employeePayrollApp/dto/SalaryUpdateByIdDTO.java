package com.rituraj.employeePayrollApp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SalaryUpdateByIdDTO {
    private int id;
    private double salary;
}
