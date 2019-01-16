package com.yutaka.dayrepo.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yutaka.dayrepo.model.UserAccountModel;
import com.yutaka.dayrepo.model.entity.DairyReportEntity;
import com.yutaka.dayrepo.model.query.DairyReportQuery;

@Controller
@RequestMapping("nippo")
public class LoginController {

    @RequestMapping("/")

    public String index() {
        return "index";
    }

    @RequestMapping("dashboard")
    public String login(@ModelAttribute UserAccountModel userAccountModel, Model model) {

    	String userId = userAccountModel.getUserId();
    	String password = userAccountModel.getPassword();
    	model.addAttribute("dairyReportQuery", new DairyReportQuery());
    	model.addAttribute("reportList", new ArrayList<DairyReportEntity>());

    	return "dashboard";
    }
}
