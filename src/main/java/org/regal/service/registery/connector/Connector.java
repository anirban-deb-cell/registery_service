package org.regal.service.registery.connector;

import javax.xml.crypto.NodeSetData;

import org.regal.service.registery.entity.ClientServiceDetails;
import org.regal.service.registery.entity.NodeDetails;
import org.regal.service.registery.model.ClientInfo;
import org.regal.service.registery.model.NodeInfo;
import org.regal.service.registery.repository.ClientRepository;
import org.regal.service.registery.repository.NodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Connector {
	
	@Autowired
	ClientRepository clientRepository;
	
	@Autowired
	NodeRepository nodeRepository; 
	
	public void addClient(ClientInfo clientInfo) {
		
		ClientServiceDetails clientService = new ClientServiceDetails();
		clientService.setIp(clientInfo.getIp());
		clientService.setPort(clientInfo.getPort());
		clientService.setServiceName(clientInfo.getServiceName());
		
		clientRepository.addClient(clientService);
		
	}
	
	public void addNodeInfo(NodeInfo nodeInfo) {
		
		NodeDetails nodeDetails = new NodeDetails();
		nodeDetails.setIp(nodeInfo.getIp());
		nodeDetails.setPort(nodeInfo.getPort());
		nodeDetails.setStatus(nodeInfo.getStatus());
		
		nodeRepository.registerNode(nodeDetails);
	}
}
