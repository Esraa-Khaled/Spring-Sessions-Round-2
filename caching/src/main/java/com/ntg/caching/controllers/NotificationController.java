package com.ntg.caching.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notify")
public class NotificationController {

    @GetMapping("/{product}")
    public void Notify(@PathVariable String product) {
        System.out.println("There is transaction on Product: " + product);
    }
}
