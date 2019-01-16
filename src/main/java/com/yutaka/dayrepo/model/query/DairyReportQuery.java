package com.yutaka.dayrepo.model.query;

import java.time.LocalDateTime;

import com.yutaka.dayrepo.model.attribute.DairyReportAttribute;

import lombok.Data;

@Data
public class DairyReportQuery {

	private String title;
	private String tag;
	private LocalDateTime updatedAt;

	/**
	 * コンストラクタ
	 */
	public DairyReportQuery() {
	}

	/**
	 * コンストラクタ（重複チェック用）
	 *
	 * @param attribute ノート登録情報
	 */
	public DairyReportQuery(DairyReportAttribute attribute) {
		this.title = attribute.getTitle();
	}

}
