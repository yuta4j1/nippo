package com.yutaka.dayrepo.model.entity;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class DairyReportEntity {

	private int id;
	private String title;
	private String tag;
	private String document;
	private String comment;
	private LocalDateTime updatedAt;

	public DairyReportEntity() {
	}

}
