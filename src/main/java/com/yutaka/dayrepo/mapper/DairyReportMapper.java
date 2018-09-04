package com.yutaka.dayrepo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.yutaka.dayrepo.model.attribute.DairyReportAttribute;
import com.yutaka.dayrepo.model.entity.DairyReportEntity;
import com.yutaka.dayrepo.model.query.DairyReportQuery;

@Mapper
public interface DairyReportMapper {

	public List<DairyReportEntity> listDairyReport(DairyReportQuery query);

	public void addDairyReport(DairyReportAttribute attribute);

}
