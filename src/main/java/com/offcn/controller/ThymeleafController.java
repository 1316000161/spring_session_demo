package com.offcn.controller;

import com.offcn.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

@Controller
@RequestMapping("/thymeleaf")
public class ThymeleafController {

    @GetMapping("/indexPage")
    public String  indexPage(Model model){
        String message = "Hello spring thymeleaf";
        model.addAttribute("message",message);
        return "index";
    }

        @GetMapping("/getUser")
    public String getUser(Model model){
        User user = new User(1, "tyy", new Date());
        model.addAttribute("user",user);
        Map map = new HashMap();
        map.put("src1","../static/123.gif");
        map.put("src2","../static/cat.jpg");
        model.addAttribute("map",map);
        model.addAttribute("msg","hello spring thymeleaf");
        return "index";
    }
    @GetMapping("/getPojoList")
    public String getPojoList(Model model){
        User tyy1 = new User(1, "tyy1", new Date());
        User tyy2 = new User(2, "tyy2", new Date());
        User tyy3 = new User(3, "tyy3", new Date());
        List<User> list = new ArrayList<>();
        list.add(tyy1);
        list.add(tyy2);
        list.add(tyy3);
        model.addAttribute("list",list);
        return "index";
    }
    @GetMapping("/getString")
    public String getString(Model model){
        model.addAttribute("userName","tyy");
        model.addAttribute("href","http:www.baidu.com");
        return "index";
    }
}
