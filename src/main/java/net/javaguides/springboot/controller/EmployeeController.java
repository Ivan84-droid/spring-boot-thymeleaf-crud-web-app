package net.javaguides.springboot.controller;

import net.javaguides.springboot.model.Empolyee;
import net.javaguides.springboot.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

    @Controller
    public class EmployeeController {

        @Autowired
        private EmployeeServiceImpl employeeService;

        @GetMapping("/")
        public String viewHomePage(Model model) {
            model.addAttribute("listEmployees", employeeService.getAllEmployees());
            return "index";
        }

        @GetMapping("/showNewEmployeeForm")
        public String showNewEmployeeForm(Model model) {
            Empolyee employee = new Empolyee();
            model.addAttribute("employee", employee);
            return "new_employee";
        }

        @PostMapping("/saveEmployee")
        public String saveEmployee(@ModelAttribute("employee") Empolyee employee) {
            employeeService.saveEmployee(employee);
            return "redirect:/";
        }
        @GetMapping("/showFormForUpdate/{id}")
        public String showFormForUpdate(@PathVariable(value = "id") long userid, Model model) {
            Empolyee empolyee = employeeService.getEmployeeById(userid);
            model.addAttribute("employee", empolyee);
            return "update_employee";
        }
        @GetMapping("/deleteEmployee/{id}")
        public String deleteEmployee(@PathVariable(value = "id") long id){
            this.employeeService.deleteEmployeeById(id);
                return "redirect/";
            }
        }

