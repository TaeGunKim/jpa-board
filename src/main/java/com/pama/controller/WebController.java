package com.pama.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    @RequestMapping(value = {"/", "/web/**"})
    public String viewMapping(){
        return "forward:/index.html";
    }
}
