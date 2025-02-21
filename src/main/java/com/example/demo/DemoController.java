package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/")
    String home() {
        //Sum 1 to 1000

        return "Hello";

    }

    @GetMapping("/sum/{max}")
    int sum(@PathVariable  int max) {
        int total=0;
        for (int i=1; i<=max; i++) {
            total = total + i;
        }
        return total;
    }




}
