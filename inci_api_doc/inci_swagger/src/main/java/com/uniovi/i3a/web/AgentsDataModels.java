package com.uniovi.i3a.web;

import java.util.Map;

import io.swagger.annotations.ApiModel;

public class AgentsDataModels {

	
	public Map<String,Object> loginModel;
	public Map<String,Object> loginExample;
	
	private AgentsDataModels instance;
	
	private AgentsDataModels() {
		loginModel.put("login", null);
		loginModel.put("password", null);
		loginModel.put("kind", null);
		
		loginExample.put("login", "45170000A");
		loginExample.put("password", "4[[j[frVCUMJ>hU");
		loginExample.put("kind", 1);
	}
	
	public AgentsDataModels getInstance() {return instance;}

	public Map<String, Object> getLoginModel() {
		return loginModel;
	}

	public Map<String, Object> getLoginExample() {
		return loginExample;
	}
	
	
	
}
