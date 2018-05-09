package cucumberTests.steps;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class agentTest{

	String agentsEndpoint = "http://asw-i3a-zuul-eu-west-1.guill.io/agents_service";
	String incidentsEndpoint=" http://asw-i3a-zuul-eu-west-1.guill.io/incidents_service";
	String operatorsEndpoint=" http://asw-i3a-zuul-eu-west-1.guill.io/operators_service";
	
	Map<String, Object> registerAgentData = new HashMap<String, Object>();
	Map<String, Object> loginAgentData = new HashMap<String, Object>();
	Map<String, Object> loginOperatorData = new HashMap<String, Object>();
	Map<String, Object> incident = new HashMap<String, Object>();
	
	
	String username;
	String password = "123456";
	String agentID;
	String incidentID;
	String elenaDlpId = "5ae44c843a1d09060b5f544b";
	
	HashMap<String, Object>[] comments = new HashMap[1];
	Map<String, Object> incidentToComment;
	Map<String, Object> incidentToClose;
	
	@Given("^agent registration data$")
	public void agent_registration_data() throws Throwable {
		username = String.valueOf( System.currentTimeMillis() );
		password = "123456";
	    registerAgentData.put("name", "Victor Suarez");
	    registerAgentData.put("email", "victor@mail.com");
	    registerAgentData.put("username", username);
	    registerAgentData.put("password", password);
	    registerAgentData.put("location", "43.575558, -5.960768");
	    registerAgentData.put("kindCode", 1);
	}
	
	@When("^there are no empty fields$")
	public void there_are_no_empty_fields() throws Throwable {
	    assertTrue( registerAgentData.containsKey("name") );
	    assertTrue( registerAgentData.containsKey("email") );
	    assertTrue( registerAgentData.containsKey("username") );
	    assertTrue( registerAgentData.containsKey("password") );
	    assertTrue( registerAgentData.containsKey("location") );
	    assertTrue( registerAgentData.containsKey("kindCode") );
	    
	}
	
	@Then("^the agent is created$")
	public void the_agent_is_created() throws Throwable {
		RestTemplate temp = new RestTemplate();
	 HttpResponse res = Unirest.post(agentsEndpoint + "/register")
	 	.header( "Content-Type", "application/json" )
		.body( new JSONObject( registerAgentData ).toString() ).asJson();
		assertTrue( res.getStatus() == HttpStatus.CREATED.value() );
	}
	
	
	@Given("^valid agent login$")
	public void valid_agent_login() throws Throwable {
	    loginAgentData.put("login", "45170000A");
	    loginAgentData.put("password","4[[j[frVCUMJ>hU");
	    loginAgentData.put("kind", 1);
	}

	@When("^the username/password combination is correct$")
	public void the_username_password_combination_is_correct() throws Throwable {
		HttpResponse<JsonNode> res = Unirest.post(agentsEndpoint+"/auth")
							.header( "Content-Type", "application/json" )
							.body( new JSONObject( loginAgentData ).toString() ).asJson();
		
		assertTrue( res.getStatus() == HttpStatus.OK.value() );
		agentID = res.getBody().getObject().getString( "agentId" );
	}

	@Then("^the id of the agent is returned$")
	public void the_id_of_the_agent_is_returned() throws Throwable {
	    assertTrue(agentID != null);
	}
	
	@Given("^data for the incident$")
	public void data_for_the_incident() throws Throwable {
	    incident.put("username", username);
	    incident.put("password", password);
	    incident.put("title", "While cucumber");
	    incident.put("description", "Incident created with the purpouse of testing the whole system");
	    incident.put("operatorId", elenaDlpId);
	    incident.put("status", "OPEN");
	    incident.put("tags", new String[0]) ;
	    incident.put("multimedia", new String[0]);
	    incident.put("location", "43.575558, -5.960768" );
	    incident.put("propertyVal", new HashMap<String,String>() );
	    incident.put("agentId", agentID);
	}

	@When("^the incident is sent$")
	public void the_incident_is_sent() throws Throwable {
		HttpResponse<JsonNode> res = Unirest.post(incidentsEndpoint + "/save")
	    			.header( "Content-Type", "application/json" )
				.body( new JSONObject( incident ).toString() ).asJson();
	    assertTrue( res.getStatus() == HttpStatus.OK.value() );
	    
	    incidentID = res.getBody().getObject().getString("incidentId");
	}
	
	@Then("^the id assigned to the incident is returned$")
	public void the_id_assigned_to_the_incident_is_returned() throws Throwable {
		assertTrue( incidentID != null );
	}
	
	
	@Given("^login data for an operator$")
	public void login_data_for_an_operator() throws Throwable {
	    loginOperatorData.put("email", "elena@dlp.com");
	    loginOperatorData.put("password", "1234");
	}

	@When("^the login combination is correct$")
	public void the_login_combination_is_correct() throws Throwable {
		HttpResponse<JsonNode> res = Unirest.post(operatorsEndpoint + "/auth")
    			.header( "Content-Type", "application/json" )
			.body( new JSONObject( loginOperatorData ).toString() ).asJson();
		assertTrue( res.getStatus() == HttpStatus.OK.value() );
	}
	
	@Then("^operator get a list of its incidents$")
	public void operator_get_a_list_of_its_incidents() throws Throwable {
		HttpResponse<JsonNode> res = Unirest.get(incidentsEndpoint + "/incidents?operatorId="+elenaDlpId)
    			.header( "Content-Type", "application/json" ).asJson();
		
		JSONArray incidents = res.getBody().getArray();
		assertTrue( res.getStatus() == HttpStatus.OK.value() );
		
		//Look for the previously inserted incient
		boolean found = false;
		for(int i = 0; i < incidents.length(); i++)
		{
		      JSONObject object= incidents.getJSONObject(i);
		      String incidentId = object.getString("incidentId");
		      if( incidentId.equals(incidentID) )
		      {
		    	  	found = true;
		    	  	break;
		      }
		}
		
		assertTrue(found);
		
	}

	@Given("^a comment$")
	public void a_comment() throws Throwable {
		HashMap<String, Object> comment = new HashMap<String, Object>();
		comment.put("operatorId", elenaDlpId);
		comment.put("comment", "prueba con cucumber");
		comment.put("date", "" );
		comments[0] = comment;
		
	}
	
	@Given("^an incident to comment$")
	public void an_incident_to_comment() throws Throwable {
		HttpResponse<JsonNode> res = Unirest.get(incidentsEndpoint + "/incidents/" + incidentID)
    			.header( "Content-Type", "application/json" ).asJson();
		incidentToComment = 
				new ObjectMapper().readValue(res.getRawBody(), HashMap.class);
	}

	@When("^an operator writes the comment into a incident$")
	public void an_operator_writes_the_comment_into_a_incident() throws Throwable {
		incidentToComment.put("comments", comments );
	}

	@Then("^the incident should store the comment$")
	public void the_incident_should_store_the_comment() throws Throwable {
		HttpResponse<JsonNode> res = Unirest.post(incidentsEndpoint + "/save")
    			.header( "Content-Type", "application/json" ).body(new JSONObject( incidentToComment ).toString()).asJson();
		assertTrue( res.getStatus() == HttpStatus.OK.value() );
	}

	@Given("^an incident$")
	public void an_incident() throws Throwable {
		
		HttpResponse<JsonNode> res = Unirest.get(incidentsEndpoint + "/incidents/" + incidentID)
    			.header( "Content-Type", "application/json" ).asJson();
		incidentToClose = 
				new ObjectMapper().readValue(res.getRawBody(), HashMap.class);
	}

	@When("^an operator closes the incident$")
	public void an_operator_closes_the_incident() throws Throwable {
	    incidentToClose.put("status", "CLOSED");
	}

	@Then("^the incident status must be changed$")
	public void the_incident_status_must_be_changed() throws Throwable {
		HttpResponse<JsonNode> res = Unirest.post(incidentsEndpoint + "/save")
    			.header( "Content-Type", "application/json" ).body(new JSONObject( incidentToClose ).toString()).asJson();
		assertTrue( res.getStatus() == HttpStatus.OK.value() );
	}


}
