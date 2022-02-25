package com.example.demouserservice.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserServiceController {

    @RequestMapping("/get")
    public Map<String, String> get() {
        HashMap<String, String> map = new HashMap<>();
        map.put("id", "4720186416534735290");
        map.put("token", "86b6118d-7dc6-4d30-a5f3-3d5fc6348f9a");
        return map;
    }
}