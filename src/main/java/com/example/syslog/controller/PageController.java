package com.example.syslog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class PageController {

    @RequestMapping("menu")
    public String goMenu() {
        return "redirect:/html/menu";
    }

}
