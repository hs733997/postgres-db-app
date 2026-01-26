package com.demo.postgresdb.utils;

import com.demo.postgresdb.dao.EmpRepo;
import com.demo.postgresdb.entity.Employee;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Log4j2
@Component
public class StartUp implements CommandLineRunner {
    @Autowired
    private EmpRepo empRepo;
    @Override
    public void run(String... args) throws Exception {
        log.info("----Started Runner----");
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "John Doe", 1, "infosec", "Analyst",99586));
        employees.add(new Employee(102, "Jane Smith", 2, "IT", "Developer",85000));
        employees.add(new Employee(103, "Mike Johnson", 1, "infosec", "Manager",120000));
        employees.add(new Employee(104, "Emily Davis", 3, "HR", "Recruiter",75000));
        employees.add(new Employee(105, "David Wilson", 2, "IT", "Support Engineer",68000));
        empRepo.saveAll(employees);
    }
}
