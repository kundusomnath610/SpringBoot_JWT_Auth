package com.example.jwt.controller;

import com.example.jwt.model.Employee;
import com.example.jwt.services.EmployeeServices;
import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/welcome")
public class HomeController {

    @Autowired
    private EmployeeServices employeeServices;

    @GetMapping("/employees")
    public List<Employee> getEmployeeList() {
        return employeeServices.getEmployeeList();
    }

}
