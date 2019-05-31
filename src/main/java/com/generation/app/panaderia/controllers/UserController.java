package com.generation.app.panaderia.controllers;

import com.generation.app.panaderia.model.Validator.UserValidator;
import com.generation.app.panaderia.model.entity.User;
import com.generation.app.panaderia.model.service.SecurityService;
import com.generation.app.panaderia.model.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private SecurityService securityService;


    @GetMapping("/")
    public String registration(Model model) {
        model.addAttribute("userForm", new User());

        return "index";
    }
    @GetMapping("/nosotros")
    public String nosotros(Model model) {
        model.addAttribute("userForm", new User());
        return "nosotros";
    }
    @GetMapping("/contacto")
    public String contacto(Model model) {
        model.addAttribute("userForm", new User());
        return "contacto";
    }

    @PostMapping("/registration")
    public String registration(@ModelAttribute("userForm") User userForm) {

        userService.save(userForm);

        securityService.autoLogin(userForm.getUsername(), userForm.getPasswordConfirm());

        return "redirect:/";
    }
    @RequestMapping(value = "/logoutSuccessful", method = RequestMethod.GET)
    public String logoutSuccessfulPage(Model model) {
        model.addAttribute("title", "Logout");
        return "redirect:/";
    }

    @GetMapping("/login")
    public String login(Model model, String error, String logout) {
        if (error != null)
            model.addAttribute("error", "Your username and password is invalid.");

        if (logout != null)
            model.addAttribute("message", "You have been logged out successfully.");
        return "redirect:/";
    }
}