package com.example.springsecuritydemo.controller;

import com.example.springsecuritydemo.config.SecurityConfig;
import com.example.springsecuritydemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Aya
 * @date 2021/5/21
 */
@RestController
@RequestMapping("/test")
public class TestController {


    @GetMapping("/hello")
    public String test(){
        return "Hello World";
    }



}
