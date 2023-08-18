package ru.kata.spring.boot_security.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.kata.spring.boot_security.demo.service.UserDetailsServiceImpl;

import java.security.Principal;

@Controller
public class UsersController {
    UserDetailsServiceImpl userDetailsServiceImpl;
    @Autowired
    public UsersController(UserDetailsServiceImpl userDetailsServiceImpl) {
        this.userDetailsServiceImpl = userDetailsServiceImpl;
    }

    @GetMapping("/user")
    public String userView(Model model, Principal principal) {
        model.addAttribute("user", userDetailsServiceImpl.findByUserName(principal.getName()));
        return "pages/userpage";
    }
}
