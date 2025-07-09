package com.example.demo.EmployeeController;



import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.demo.DTOPOJO.*;
import com.example.demo.EmployeeService.*;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "index";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Employee emp) {
        service.save(emp);
        return "redirect:/displayAll";
    }

    @GetMapping("/displayAll")
    public String displayAll(Model model) {
        List<Employee> list = service.getAll();
        model.addAttribute("list", list);
        return "displayAll";
    }

    @GetMapping("/display/{empId}")
    public String displayOne(@PathVariable("empId") String empId, Model model) {
        Employee emp = service.getByEmpId(empId); // Adjust method name based on your service
        model.addAttribute("employee", emp);
        return "displayOne";
    }

}
