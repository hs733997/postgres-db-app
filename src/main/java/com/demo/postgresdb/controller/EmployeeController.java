package com.demo.postgresdb.controller;

import com.demo.postgresdb.entity.Employee;
import com.demo.postgresdb.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("findAll")
    public ResponseEntity<List<Employee>> findALl(){
        return employeeService.findAll();
    }
}
