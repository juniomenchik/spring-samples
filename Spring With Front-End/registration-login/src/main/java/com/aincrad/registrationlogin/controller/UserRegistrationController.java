package com.aincrad.registrationlogin.controller;


import com.aincrad.registrationlogin.domain.User;
import com.aincrad.registrationlogin.domain.UserRegistrationDTO;
import com.aincrad.registrationlogin.services.UserServiceImpl;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {
    private UserServiceImpl userService;

    public UserRegistrationController(UserServiceImpl userService) {
        super();
        this.userService = userService;
    }
//    @GetMapping
//    public String showRegistrationForm() {
//        return "registration";
//    }

    @PostMapping
    public String registerUserAccount(@ModelAttribute("user") UserRegistrationDTO registrationDTO) {
        userService.save(registrationDTO);
        return "redirect:/registration?success";
    }

    @ModelAttribute("user")
    public UserRegistrationDTO userRegistrationDTO() {
        return new UserRegistrationDTO();
    }


    @RequestMapping(value="/", method = RequestMethod.GET)
    public String getHomePage(){
        return "index";
    }


}
