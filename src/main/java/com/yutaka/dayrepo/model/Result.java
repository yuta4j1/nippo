package com.yutaka.dayrepo.model;

import lombok.Data;

@Data
public class Result {

	private boolean success;
	private String message;
	private Object data;

	public Result() {
	}

	public Result(boolean success) {
		this.success = success;
	}

}
