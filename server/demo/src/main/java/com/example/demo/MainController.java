package com.example.demo;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class MainController {
    
    @RequestMapping(value = "/main")
    private @ResponseBody String getData() throws Exception {
        
        return "server전달데이터";
    }
}
