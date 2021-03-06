package com.kma.practice8.springsecuritydb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/admin")
    public String admin() {
        return "admin_root";
    }

    @GetMapping("/admin/subpage")
    public String adminSubpage() {
        return "admin_sub";
    }

    @GetMapping("/catalog")
    public String catalog() {
        return "catalog";
    }

    @GetMapping("/profile")
    public String profile() {
        return "profile";
    }

    @GetMapping("/other")
    public String other() {
        return "other";
    }

}
