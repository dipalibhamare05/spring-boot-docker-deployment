package com.docker.springbootdockerdeployment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker")
public class DockerTestController {

    @GetMapping("/message")
    public String getMessage(){
        return "Docker deployment successfully done!!";
    }
}
