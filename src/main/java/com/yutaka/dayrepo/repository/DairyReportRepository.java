package com.yutaka.dayrepo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yutaka.dayrepo.mapper.DairyReportMapper;
import com.yutaka.dayrepo.model.attribute.DairyReportAttribute;

@Repository
public class DairyReportRepository {

	@Autowired
	private DairyReportMapper dairyReportMapper;

	public void addDairyReport(DairyReportAttribute attribute) {
		dairyReportMapper.addDairyReport(attribute);
	}

}
