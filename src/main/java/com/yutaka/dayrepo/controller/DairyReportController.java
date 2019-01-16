package com.yutaka.dayrepo.controller;

import java.util.List;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yutaka.dayrepo.model.entity.DairyReportEntity;
import com.yutaka.dayrepo.model.query.DairyReportQuery;
import com.yutaka.dayrepo.repository.DairyReportRepository;

@Controller
@RequestMapping("nippo/dashboard")
public class DairyReportController {
	@Autowired
	DairyReportRepository dairyReportRepository;

	@GetMapping("/list")
	public String getDairyReportList(@ModelAttribute DairyReportQuery dairyReportQuery, Model model) {
		Log log = LogFactory.getLog(DairyReportController.class);
		List<DairyReportEntity> reportList = dairyReportRepository.getDairyReports(dairyReportQuery);
		reportList.forEach(o -> log.info(o));
		model.addAttribute("reportList", reportList);
		model.addAttribute("isReportExists", reportList.size() >= 1);
		model.addAttribute("dairyReportQuery", dairyReportQuery);

		return "dashboard";
	}

}
