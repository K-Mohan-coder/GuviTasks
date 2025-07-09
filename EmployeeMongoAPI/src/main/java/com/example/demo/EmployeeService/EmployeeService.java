package com.example.demo.EmployeeService;


import java.util.List;
import com.example.demo.DTOPOJO.*;

public interface EmployeeService {
    Employee save(Employee emp);
    List<Employee> getAll();
    Employee getByEmpId(String empId);
}
