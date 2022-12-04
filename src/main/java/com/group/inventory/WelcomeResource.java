package com.group.inventory;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.PermitAll;
import javax.servlet.http.HttpServletRequest;

@RestController("/hello")
public class WelcomeResource {
    @GetMapping
    @PermitAll
    public String welcome(HttpServletRequest request) {
        String welcomeStr = "Welcome to %s to the inventory_app";
        return String.format(welcomeStr, request.getRemoteAddr());
    }
}
