package com.uniovi.i3a.web.agents;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@Api("/api/agents")
public class AgentsController {

	@Value("${endpointAgents}")
	private String agentsEndpoint;

	@ApiOperation(value = "Log an agent into the system", notes = "Retrieve agent information", response = LoginDTO.class)
	@ApiModelProperty(position = 0,name = "Payload", value = "User to be logged", required=true)
	@RequestMapping(value = "/agents/auth", method = RequestMethod.POST)
	public String auth(@ApiParam(name="Payload", value="Login info of the agent", required=true) @RequestBody LoginDTO payload) {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.postForObject(agentsEndpoint+"/auth",payload ,String.class);
	}

	@ApiOperation(value = "Get service", notes = "Retrieves the url for the service", response = String.class)
	@RequestMapping(value = "/agents/info", method = RequestMethod.GET)
	public String info() {
		RestTemplate restTemplate = new RestTemplate();
		System.out.println(agentsEndpoint+"/info");
		System.out.println(restTemplate.getForObject(agentsEndpoint+"/info", String.class));
		return restTemplate.getForObject(agentsEndpoint+"/info", String.class);
	}

	@ApiOperation(value = "Register agent in the system", notes = "Returns weather an agent is registered or not", response = String.class)
	@RequestMapping(value = "/agents/register", method = RequestMethod.POST)
	public String register(@ApiParam(name="Payload", value="Data of the agent to be registered", required=true) @RequestBody RegisterDTO payload) {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.postForObject(agentsEndpoint+"/resgister",payload, String.class);
	}

}
