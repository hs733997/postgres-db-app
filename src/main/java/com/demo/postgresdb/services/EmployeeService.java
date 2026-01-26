package com.demo.postgresdb.services;

import com.demo.postgresdb.dao.EmpRepo;
import com.demo.postgresdb.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmpRepo empRepo;

    public ResponseEntity<List<Employee>> findAll() {
        return new ResponseEntity<>(empRepo.findAll(), HttpStatus.OK);
    }
}
