package com.offcn.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class TestController {
//jhj
    @GetMapping("/setSession")
    public String setSession(HttpSession session){
        session.setAttribute("msg","hello spring session");
        return "OK";
    }

    @GetMapping("/getSession")
    public String getSession(HttpSession session){
        return (String)session.getAttribute("msg");
    }

}
