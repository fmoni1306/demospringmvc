package com.example.demospringmvc.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
    @PostMapping("/users/create")
    public User create(@RequestBody User user) {
        return user;
    }

//    @PostMapping("/user") // @ResponseBody 생략가능 (RestController 애노테이션이 있을때)
//    public @ResponseBody User create(@RequestBody User user){
//        return null;
//    }
}
