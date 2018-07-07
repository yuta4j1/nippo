package com.yutaka.dayrepo.model.query;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class DairyReportQuery {

	private int id;
	private String title;
	private String tag;
	private String document;
	private String comment;
	private LocalDateTime updatedAt;

	public DairyReportQuery() {
	}

}
