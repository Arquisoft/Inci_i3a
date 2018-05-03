package com.uniovi.i3a.web.operators;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Api("/api/operators")
@RestController
public class GetOperatorsController {

	@Value("${endpointOperator}")
	private String operatorEndpoint;
	
	@ApiOperation(value = "Get service", notes = "Retrieves the url for the service", response = String.class)
	@RequestMapping(value = "/operators/info", method = RequestMethod.GET)
	public String info() {
		RestTemplate restTemplate = new RestTemplate();
		System.out.println(operatorEndpoint+"/info");
		System.out.println(restTemplate.getForObject(operatorEndpoint+"/info", String.class));
		return restTemplate.getForObject(operatorEndpoint+"/info", String.class);
	}
	
	@ApiOperation(value = "List operators", notes = "Retrieves a list of the operators")
	@RequestMapping(value = "/operators/operators", method = RequestMethod.GET)
    public ResponseEntity<String> getAllAgents() {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject(operatorEndpoint+"/operators",ResponseEntity.class);
    }

	@ApiOperation(value = "Get operator", notes = "Retrieve information about an operator")
    @RequestMapping(value = "/operators/operators/{id}", method = RequestMethod.GET)
    public ResponseEntity<String> getAgentByDBId(@ApiParam(name="ID", value="ID of the operator", required=true)@PathVariable("id") String id) {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject(operatorEndpoint+"/operators/"+id,ResponseEntity.class);
    }
}
