package com.kvscode.restapi.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class DemoRestController {
    

    //add the code for the greeting endpoint

    @GetMapping("/greeting")
    public String sayGreeting()
    {
        return "Hello Welcome!!";
    }
}
