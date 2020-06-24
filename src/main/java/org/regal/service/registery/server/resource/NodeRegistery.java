package org.regal.service.registery.server.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.regal.service.registery.connector.Connector;
import org.regal.service.registery.model.NodeInfo;
import org.springframework.beans.factory.annotation.Autowired;

@Path("/node")
public class NodeRegistery {

	@Autowired
	Connector connector;

	@POST
	@Path("/register")
	@Consumes("application/json")
	public boolean registerSlaveNode(NodeInfo slaveInfo){
		connector.addNodeInfo(slaveInfo);
		return false;
		
	}
}
