package com.demo.postgresdb.dao;

import com.demo.postgresdb.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepo extends JpaRepository<Employee,Integer> {
}
