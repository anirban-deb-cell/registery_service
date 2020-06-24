package org.regal.service.registery.server.resource;

import javax.websocket.server.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.regal.service.registery.connector.Connector;
import org.regal.service.registery.model.NodeInfo;
import org.springframework.beans.factory.annotation.Autowired;

public class HealthService {
	
	@Autowired
	Connector connector;
	
	@POST
	@Path("/{status}")
	@Consumes("application/json")
	public boolean sendHelathStatus(NodeInfo nodeInfo) {
		connector.addNodeInfo(nodeInfo);
		
		return false;
	}

}
