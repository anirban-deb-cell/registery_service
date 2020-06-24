package org.regal.service.registery.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ClientServiceDetails {
	
	@Id
	@GeneratedValue
	private int id;
	private String ip;
	private String port;
	private String serviceName;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	
	@Override
	public String toString() {
		return "ClientServiceDetails [id=" + id + ", ip=" + ip + ", port=" + port + ", serviceName=" + serviceName
				+ "]";
	}
	

}
