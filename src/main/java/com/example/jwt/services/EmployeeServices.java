package com.example.jwt.services;

import com.example.jwt.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeServices {

    private List<Employee> employeeList = new ArrayList<>();

    public EmployeeServices() {
        employeeList.add(new Employee(UUID.randomUUID().toString(),
                "Somnath", "abc123@gmail.com", "Chennai"));

        employeeList.add(new Employee(UUID.randomUUID().toString(),
                "Raj Kumar", "raj@gmail.com", "Bangalore"));

        employeeList.add(new Employee(UUID.randomUUID().toString(),
                "Pappu Kumar", "p123@gmail.com", "Kolkata"));

        employeeList.add(new Employee(UUID.randomUUID().toString(),
                "Som", "som123@gmail.com", "Delhi"));
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }
}
