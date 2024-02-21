package com.example.GameOfLife.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AuthController {

    @PostMapping("/login")
    public ModelAndView login(@RequestParam("email") String email, @RequestParam("password") String password) {
        // Here, insert your authentication logic to check the email and password
        boolean isAuthenticated = authenticate(email, password);

        if (isAuthenticated) {
            // Redirect to a secure page
            return new ModelAndView("redirect:/game");
        } else {
            // Redirect back to the login page with an error message
            ModelAndView modelAndView = new ModelAndView("login");
            modelAndView.addObject("error", "Invalid email or password.");
            return modelAndView;
        }
    }

    private boolean authenticate(String email, String password) {
        // Implement your authentication logic here
        return true; // Placeholder
    }

}
