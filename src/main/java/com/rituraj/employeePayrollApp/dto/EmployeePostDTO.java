package com.rituraj.employeePayrollApp.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeePostDTO {
    private String name;
    private double salary;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate joiningDate;
}
