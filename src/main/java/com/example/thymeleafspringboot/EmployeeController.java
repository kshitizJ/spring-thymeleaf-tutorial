package com.example.thymeleafspringboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

   @GetMapping("/iteration")
   public String bootstrap(Model model) {
      List<Employee> employees = new ArrayList<>();
      employees.add(new Employee("Kshitiz Jain", "kshitiz@mail.com"));
      employees.add(new Employee("Champ Singh", "champ@mail.com"));
      employees.add(new Employee("Omi Chougule", "omi@mail.com"));
      employees.add(new Employee("Jyoti Dutta", "jyoti@mail.com"));
      model.addAttribute("employees", employees);
      return "Iteration";
   }
}
