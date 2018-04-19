package com.uniovi.i3a.web;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.apache.catalina.connector.Connector;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.EmbeddedWebApplicationContext;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@Autowired
	private EmbeddedWebApplicationContext appContext;
	
	  private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping("/")
	public String home() {
		 	Connector connector = ((TomcatEmbeddedServletContainer) appContext.getEmbeddedServletContainer()).getTomcat().getConnector();
		    String scheme = connector.getScheme();
		    String ip = "localhost";
			try {
				ip = InetAddress.getLocalHost().getHostAddress();
			} catch (UnknownHostException e) {
				e.printStackTrace();
			}
		    int port = connector.getPort();
		    String uiPath = scheme + "://" + ip + ":" + port + "/springfox/swagger-ui.html";
		    log.info(uiPath);
		    return "redirect:" + uiPath;
	}

}
