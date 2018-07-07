package com.yutaka.dayrepo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yutaka.dayrepo.model.query.DairyReportQuery;

@Controller
@RequestMapping("nippo/dashboard")
public class DairyReportController {

	@RequestMapping("/list")
	public String getDairyReportList(@ModelAttribute DairyReportQuery query) {


		return "dashboard";

	}

}
