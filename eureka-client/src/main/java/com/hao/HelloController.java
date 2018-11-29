package com.hao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${server.port}")
    private String portNumber;

    @GetMapping("/hello")
    public String greeting(){
        return String.format("Hello from port %s!", portNumber);
    }
}