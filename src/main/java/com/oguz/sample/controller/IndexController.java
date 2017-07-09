package com.oguz.sample.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by oguz on 02.07.2017.
 */
@Controller
public class IndexController {

    @GetMapping(value = {"/", "index"})
    public String index() {
        return "index";
    }
    @GetMapping(value = "admin")
        public String admin(){
        return "admin/admin";
        }



}
