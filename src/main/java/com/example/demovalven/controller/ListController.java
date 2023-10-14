package com.example.demovalven.controller;

import com.example.demovalven.entity.CommitList;
import com.example.demovalven.service.CommitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ListController {

    @Autowired
    private CommitService commitService;

    @GetMapping("/ListScreen")
    public String commitList(Model model) {
        List<CommitList> commitLists = commitService.getAllCommits();
        model.addAttribute("commitLists", commitLists);
        return "ListScreen";
    }
}
