package com.stackroute.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @RequestMapping("/")
    public String UserController(Model model)
    {
        User userobject=new User();
        userobject.setName("vanmathi");
        model.addAttribute("name",userobject.getName());
        return "index";


    }

}
