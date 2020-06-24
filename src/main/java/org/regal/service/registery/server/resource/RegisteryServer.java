package org.regal.service.registery.server.resource;

import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.regal.service.registery.connector.Connector;
import org.regal.service.registery.model.ClientInfo;
import org.springframework.beans.factory.annotation.Autowired;

@Path("/api")
public class RegisteryServer {
	
	
	@Autowired
	Connector connector;

	@POST
	@Path("/register/client")
	@Consumes("application/json")
	public boolean getServiceRegistered(ClientInfo clientInfo) {
		
		connector.addClient(clientInfo);
		System.out.println(clientInfo.toString());
		
		return false;
	}

	
	
}
