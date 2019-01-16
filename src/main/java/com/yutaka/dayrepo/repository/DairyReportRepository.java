package com.yutaka.dayrepo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yutaka.dayrepo.mapper.DairyReportMapper;
import com.yutaka.dayrepo.model.attribute.DairyReportAttribute;
import com.yutaka.dayrepo.model.entity.DairyReportEntity;
import com.yutaka.dayrepo.model.query.DairyReportQuery;

@Repository
public class DairyReportRepository {

	@Autowired
	private DairyReportMapper dairyReportMapper;

	public void addDairyReport(DairyReportAttribute attribute) {
		dairyReportMapper.addDairyReport(attribute);
	}

	public List<DairyReportEntity> getDairyReports(DairyReportQuery query) {
		return dairyReportMapper.listDairyReport(query);
	}

}
