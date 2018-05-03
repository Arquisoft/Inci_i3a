package com.uniovi.i3a.web.incidents;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@Api("api/incidents")
public class IncidentController {
	@Value("${endpointIncidents}")
	private String incidentsEndpoint;
	
	
	@ApiOperation(value = "Get incidents", notes = "Retrieve a list of incidents matching a given criteria")
	 @RequestMapping(value="/incidents", method = RequestMethod.GET)
	    public ResponseEntity<String> getIncidents(@ApiParam(name="status", value="Current status of incident", required=false)@RequestParam("status") String status,
	    		@ApiParam(name="operatorId", value="ID of operator in charge of the incident", required=false)@RequestParam("operatorId") String operatorId,
	    		@ApiParam(name="agentId", value="ID of the agent that created the incident", required=false)@RequestParam("agentId") String agentId) {
		 
		 String url = incidentsEndpoint+"/incidents";

		 UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url)
		     // Add query parameter
		     .queryParam("status", status)
		     .queryParam("operatorId", operatorId)
		 	 .queryParam("agentid", agentId);

		 RestTemplate restTemplate = new RestTemplate();
		 return restTemplate.getForObject(builder.toUriString(), ResponseEntity.class);
	 }
	 
	 @ApiOperation(value = "Get incident", notes = "Retrieve incident information", response = Incident.class)
	 @RequestMapping(value="/incidents/{id}", method=RequestMethod.GET)
	    public ResponseEntity<String> getIncident(@ApiParam(name="ID", value="ID of the incident to retrieve", required=false)@PathVariable("id") String id) {
		 RestTemplate restTemplate = new RestTemplate();
		 return restTemplate.getForObject( incidentsEndpoint+"/incidents/" + id, ResponseEntity.class);
	    }
	 
	 @RequestMapping(value = "/save", method = RequestMethod.POST)
	    public ResponseEntity<String> save(@RequestBody Incident incident) {
		 RestTemplate restTemplate = new RestTemplate();
		 return restTemplate.postForObject(incidentsEndpoint+"/save", incident ,ResponseEntity.class);
	 }
}
