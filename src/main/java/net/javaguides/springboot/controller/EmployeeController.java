package net.javaguides.springboot.controller;

import net.javaguides.springboot.model.Company;
import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.service.CompanyService;
import net.javaguides.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

    @Controller
    public class EmployeeController {
        @Autowired
        private EmployeeService employeeService;
        @Autowired
        private CompanyService companyService;
        @GetMapping("/")
        public String viewHomePage(Model model) {
            model.addAttribute("listEmployees", employeeService.getAllEmployees());
            return "index";
        }
        @GetMapping("/showNewEmployeeForm")
        public String showNewEmployeeForm(Model model) {
            Employee employee = new Employee();
            model.addAttribute("employee", employee);
            model.addAttribute("company", companyService.getAllCompanies() );
            return "new_employee";
        }
        @GetMapping ("/showNewCompanyForm")
                public String showNewCompanyForm (Model model){
            Company company = new Company();
            model.addAttribute ("company", company);
            return "new_company";
        }
        @PostMapping ("/saveCompany")
        public String saveCompany (@ModelAttribute ("company")Company company){
            companyService.saveCompany(company);
            return "redirect:/";
        }
        @PostMapping("/saveEmployee")
        public String saveEmployee(@ModelAttribute("employee") Employee employee) {
            employeeService.saveEmployee(employee);
            return "redirect:/";
        }
        @GetMapping("/showFormForUpdate/{id}")
        public String showFormForUpdate(@PathVariable(value = "id") long userid, Model model) {
            Employee employee = employeeService.getEmployeeById(userid);
            model.addAttribute("employee", employee);
            model.addAttribute("company", companyService.getAllCompanies());
            return "update_employee";
        }
        @GetMapping("/deleteEmployee/{id}")
        public String deleteEmployee(@PathVariable(value = "id") long id){
            this.employeeService.deleteEmployeeById(id);
            return "redirect:/";
            }

        }



