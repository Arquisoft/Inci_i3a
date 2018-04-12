package org.uniovi.i3a.incimanager

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class InciManagerForm extends Simulation {

	val httpProtocol = http
		.baseURL("https://i3a-3.herokuapp.com")
		.inferHtmlResources()
		.acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
		.acceptEncodingHeader("br, gzip, deflate")
		.acceptLanguageHeader("es-es")
		.userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_4) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/11.1 Safari/605.1.15")

	val headers_1 = Map("Origin" -> "https://i3a-3.herokuapp.com")

    val uri1 = "https://i3a-3.herokuapp.com:443"

	val scn = scenario("InciManagerForm")
		.exec(http("request_0")
			.get("/"))
		.pause(2)
		.exec(http("request_1")
			.post("/login")
			.headers(headers_1)
			.formParam("login", "45170000A")
			.formParam("password", "4[[j[frVCUMJ>hU")
			.formParam("kind", "1")
			.formParam("Enter", "enter"))
		.pause(51)
		.exec(http("request_2")
			.post("/incident")
			.headers(headers_1)
			.formParam("name", "Test Incidence")
			.formParam("description", "Dummy incidence in order to test ratlin")
			.formParam("location", "10N10W")
			.formParam("asignee", "")
			.formParam("expiration", "Tomorrow")
			.formParam("state", "OPEN")
			.formParam("tags", "test,dummy,sample")
			.formParam("multimedia", "www.imagen.com/sample.png")
			.formParam("properties", "priority:none")
			.formParam("Enter", "enter"))

	setUp(scn.inject(rampUsers(1000) over(50 seconds))).protocols(httpProtocol)
}
