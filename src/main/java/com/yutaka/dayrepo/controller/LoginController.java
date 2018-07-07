package com.yutaka.dayrepo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yutaka.dayrepo.model.UserAccountModel;

@Controller
@RequestMapping("nippo")
public class LoginController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("dashboard")
    public String login(@ModelAttribute UserAccountModel model) {

    	String userId = model.getUserId();
    	String password = model.getPassword();

    	return "dashboard";
    }
}
