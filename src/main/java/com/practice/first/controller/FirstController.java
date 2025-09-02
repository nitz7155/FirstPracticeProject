package com.practice.first.controller;

import com.practice.first.domain.Member;
import com.practice.first.service.FirstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FirstController {
    @Autowired
    FirstService firstService;

    @GetMapping("/test")
    public List<Member> getAllMembers() {
        List<Member> members = firstService.getAllMembers();
        return members;
    }
}
