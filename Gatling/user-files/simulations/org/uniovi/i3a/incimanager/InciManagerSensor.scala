package org.uniovi.i3a.incimanager

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class InciManagerSensor extends Simulation {

	val httpProtocol = http
		.baseURL("http://i3a-3.herokuapp.com")
		.inferHtmlResources()
		.acceptHeader("*/*")
		.contentTypeHeader("application/json")
		.userAgentHeader("curl/7.54.0")



    val uri1 = "http://i3a-3.herokuapp.com/sensor-feed"

	val scn = scenario("InciManagerSensor")
		.exec(http("request_0")
			.post("/sensor-feed")
			.body(RawFileBody("InciManagerSensor_0000_request.txt")))

	setUp(scn.inject(rampUsers(1000) over(50 seconds))).protocols(httpProtocol)
}