package com.yutaka.dayrepo.model.attribute;

import lombok.Data;

@Data
public class DairyReportAttribute {

	private Integer id;
	private String title;
	private String tag;
	private String document;
	private String comment;
	private String markdown;
	private String updatedAt;

}
