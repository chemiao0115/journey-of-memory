package com.fourth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 赵翰 on 2017/8/5.
 */
@Controller
@RequestMapping("/HomePage")
public class HomePage {
    @RequestMapping("/homepage")
    public String goHomePage(){
        return "index2";
    }
}
