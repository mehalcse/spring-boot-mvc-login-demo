package com.spring.demo.controller;

import com.spring.demo.addData.AddUserData;
import com.spring.demo.entity.User;
import com.spring.demo.service.UserService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.stream.Stream;

@Controller
public class LoginController {

    @Autowired
    AddUserData addUserData;

    @Autowired
    UserService userService;

    @GetMapping("/login")
    public String login(Model model){
        System.out.println("in Login Controller");
        model.addAttribute("user", new User());
        return "login";

    }


    @PostMapping(value = "/login")
    public String checkUser (@ModelAttribute("user") User user) {

        System.out.println("From Controller : Adding Data -  " + user);
        addUserData.saveUserData();

        boolean res = userService.checkUser(user);

        System.out.println(res);
        if(res) {


            System.out.println("From Controller: Loging Success");
            return "redirect:/welcome";
        } else  {
            System.out.println("From Controller: Loging Fail");
            return "redirect:/login";
        }
    }

    @GetMapping("/welcome")
    public String doWelcome() {
        return "welcome";
    }

}
