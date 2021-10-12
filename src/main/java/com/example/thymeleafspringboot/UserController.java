package com.example.thymeleafspringboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
   @GetMapping("/if-unless")
   public String users(Model model) {
      List<User> users = new ArrayList<>();
      users.add(new User("Kshitiz Jain", "kshitiz@mail.com", "ADMIN"));
      users.add(new User("Champ Singh", "champ@mail.com", "MANAGER"));
      users.add(new User("Omkar Chougule", "omi@mail.com", "GUEST"));
      users.add(new User("Jyoti Dutta", "dutta@mail.com", "GUEST"));
      model.addAttribute("users", users);
      return "IfUnless";
   }

   @GetMapping("/switch")
   public String switchEaxmple(Model model) {
      User user = new User("Kshitiz Jain", "kshitiz@mail.com", "ADMIN");
      // System.out.println(user);
      model.addAttribute("user", user);
      return "SwitchCase";
   }
}
