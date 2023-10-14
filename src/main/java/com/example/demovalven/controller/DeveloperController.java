package com.example.demovalven.controller;

import com.example.demovalven.entity.Developer;
import com.example.demovalven.service.DeveloperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class DeveloperController {

    @Autowired
    private DeveloperService developerService;

    @GetMapping("/DeveloperScreen")
    public String developerDetail(@PathVariable Long id, Model model) {
        Developer developer = developerService.getDeveloperById(id);
        model.addAttribute("developer", developer);
        return "DeveloperScreen";
    }

}
