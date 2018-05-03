package com.uniovi.i3a.web.operators;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.uniovi.i3a.web.agents.LoginDTO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Api("/api/operators")
@RestController
public class AuthController {

	@Value("${endpointOperator}")
	private String operatorEndpoint;

	@ApiOperation(value = "Log an operator into the system", notes = "Retrieve agent information", response = LoginDTO.class)
    @RequestMapping(value = "/operators/auth", method = RequestMethod.POST, consumes = {
            MediaType.APPLICATION_JSON_VALUE }, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> auth(@ApiParam(name="Payload", value="Login info of the agent", required=true)@RequestBody AuthDTO payload) {
    		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.postForObject(operatorEndpoint+"/auth",payload ,ResponseEntity.class);
    }
}