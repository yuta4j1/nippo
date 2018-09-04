package com.yutaka.dayrepo.service;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yutaka.dayrepo.common.CommonUtil;
import com.yutaka.dayrepo.common.Constants;
import com.yutaka.dayrepo.model.attribute.DairyReportAttribute;
import com.yutaka.dayrepo.repository.DairyReportRepository;

@Service
public class DairyReportService {

	@Autowired
	private NumberingService numberingService;

	@Autowired
	private DairyReportRepository dairyReportReposirtory;

	@Transactional
	public void addDairyReport(DairyReportAttribute attribute) {
		// TODO タイトルで重複チェック
		Integer id = numberingService.numbring(Constants.NUMBER_TYPE_REPORT);
		attribute.setId(id);
		attribute.setUpdatedAt(CommonUtil.dateFormat(Calendar.getInstance().getTime()));

		dairyReportReposirtory.addDairyReport(attribute);


	}

}
