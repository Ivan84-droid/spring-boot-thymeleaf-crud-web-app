package net.javaguides.springboot.controller;

import net.javaguides.springboot.model.Empolyee;
import net.javaguides.springboot.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// Musi byt anotacia Controller, aby sa vedel spustit
    @Controller
    public class EmployeeController {

        // premenna EmployeeService je interface, nie trieda
        // skusal som aj EmployeeServiceImpl a slo to
        @Autowired
        private EmployeeServiceImpl employeeService;

        // display list of employees
        // GetMapping odkazuje na hlavnu webovu stranku, teda /
        @GetMapping("/")
        public String viewHomePage(Model model) {
            // listEmployees je vlastne to, co sa zobrazi index.html v resources/templates
            // v prikaze <tr th:each="employee:${listEmployees}">
            model.addAttribute("listEmployees", employeeService.getAllEmployees());
            // return "index" sa odkazuje na subor index.html
            return "index";
        }

    @GetMapping("/showNewEmployeeForm")
    public String showNewEmployeeForm(Model model) {
        // create model attribute to bind form data
        Empolyee employee = new Empolyee() ;
        model.addAttribute("employee", employee);
        return "new_employee";
        }

    }

