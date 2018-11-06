package com.rusty.logbook;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collections;
import java.util.Map;

@Controller
public class HomeController {

    @GetMapping("/")
    public String serveHome(Model model) {
        model.addAttribute("employees", Collections.emptyList());
        return "home";
    }

    @PostMapping("/")
    public String handlePost(@RequestParam String query, Model model) {
        return "home";
    }

    @PostMapping("/json")
    public String handleJsonPost(@RequestBody Map<String, Object> payload, Model model) {
        return "home";
    }
}