package com.spring.springmvc.controller;

import com.spring.springmvc.model.User;
import com.spring.springmvc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/home")
public class MainController {

    @GetMapping(path = "/")
    public @ResponseBody String index() {

        return "hello_view";
    }
}
