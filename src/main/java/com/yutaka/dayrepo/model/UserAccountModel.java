package com.yutaka.dayrepo.model;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class UserAccountModel implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotNull
	private String userId;

	@NotNull
	private String password;

}
