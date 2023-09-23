package com.loginservice.controller;// classe que envia o usuario para um index

import com.loginservice.domain.User;
import com.loginservice.domain.UserRegistrationDTO;
import com.loginservice.services.UserServiceImpl;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
    private static final Logger LOGGER = org.slf4j.LoggerFactory.getLogger(IndexController.class);
    private UserServiceImpl userService;
    public IndexController(UserServiceImpl userService) {
        super();
        this.userService = userService;
    }
    @PostMapping
    public String registerUserAccount(@ModelAttribute("user") UserRegistrationDTO registrationDTO) {
        LOGGER.info("IndexController::registerUserAccount::registrationDTO: " + registrationDTO);
        User user = userService.save(registrationDTO);
        LOGGER.info("IndexController::registerUserAccount::user: " + user);
        LOGGER.info("IndexController::registerUserAccount::FuncionoCaraio");
        return "redirect:/?success";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String displayLogin(Model model) {
        model.addAttribute("user", new User());
        return "index";
    }


}