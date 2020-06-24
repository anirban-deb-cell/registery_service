package org.regal.service.registery.repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.regal.service.registery.entity.NodeDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class NodeRepository {

	@Autowired
	EntityManager entityManager;
	
	@Transactional
	public void registerNode(NodeDetails nodeDetails) {
		
		entityManager.persist(nodeDetails);
		
	}
	
}
