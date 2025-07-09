package com.example.demo.EmployeeRepository;


import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.demo.DTOPOJO.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, String> {
    Employee findByEmpId(String empId);
}
