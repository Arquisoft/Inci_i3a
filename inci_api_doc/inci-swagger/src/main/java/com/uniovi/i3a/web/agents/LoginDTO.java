package com.uniovi.i3a.web.agents;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class LoginDTO {
	@ApiModelProperty(notes = "Agent identifier", example="45170000A")
	public String login;
	@ApiModelProperty(notes = "Agent password", example="4[[j[frVCUMJ>hU")
	public String password;
	@ApiModelProperty(notes = "Agent kindcode", example="1")
	public int kind;
}
