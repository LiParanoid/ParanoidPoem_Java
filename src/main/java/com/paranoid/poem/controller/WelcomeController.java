package com.paranoid.poem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paranoid.poem.entity.Poem;
import com.paranoid.poem.service.WelcomeService;

/**
 * @author Paranoid
 * @create 2019-11-11 13:57
 */
@RestController
public class WelcomeController {
	@Autowired
	WelcomeService welcomeService;
	
    @GetMapping("/index")
    public String index(){
        return "Test";
    }
    
    @GetMapping("/getRandItem")
    public Poem randItem(){
    	Poem poem = welcomeService.getRandItem();
        return poem;
    }
    
}
