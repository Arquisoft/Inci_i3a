package com.uniovi.i3a.web.operators;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class AuthDTO {
	@ApiModelProperty(notes = "Operator email", example="elena@mail.com")
	public String email;
	@ApiModelProperty(notes = "Operator password", example="123456")
	public String password;
}
