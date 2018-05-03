package com.uniovi.i3a.web.agents;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class RegisterDTO {

	@ApiModelProperty(notes = "Agent name", example="Pepe")
	public String name;
	@ApiModelProperty(notes = "Agent location", example="10N20E")
	public String location;
	@ApiModelProperty(notes = "Agent email address", example="pepe@mail.com")
	public String email;
	@ApiModelProperty(notes = "Agent password for login", example="123IsSecure")
	public String password;
	@ApiModelProperty(notes = "Agent username for login", example="ItsMePEPE!")
	public String username;
	@ApiModelProperty(notes = "Agent kindcode", example="1")
	public String kindcode;
	
}
