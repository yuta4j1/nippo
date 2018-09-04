package com.yutaka.dayrepo.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yutaka.dayrepo.model.Result;
import com.yutaka.dayrepo.model.attribute.DairyReportAttribute;
import com.yutaka.dayrepo.service.DairyReportService;

@Controller
@RequestMapping("/nippo")
public class DairyReportResource {

	@Autowired
	private DairyReportService dairyReportService;

	@RequestMapping(path = "/add", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Result addDairyReport(@RequestBody DairyReportAttribute attribute) {

		dairyReportService.addDairyReport(attribute);
		Result result = new Result(true);
		result.setMessage("日報の登録が完了しました。");
		return result;
	}

}
