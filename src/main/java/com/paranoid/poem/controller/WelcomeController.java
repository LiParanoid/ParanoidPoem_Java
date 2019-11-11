package com.paranoid.poem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Paranoid
 * @create 2019-11-11 13:57
 */
@RestController
public class WelcomeController {

    @GetMapping("/index")
    public String index(){
        return "Test";
    }
}
