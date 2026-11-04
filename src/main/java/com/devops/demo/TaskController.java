package com.devops.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TaskController {

    @GetMapping("/health")
    public String health() {
        return "helo from Srrihari";
    }

    @GetMapping("/tasks")
    public List<String> getTasks() {
        return List.of(
                "Build CI/CD pipeline",
                "Deploy application to Kubernetes");
    }
}