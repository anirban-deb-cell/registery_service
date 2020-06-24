package org.regal.service.registery.model;

public class ClientInfo {

	private String ip;
	private String port;
	private String serviceName;
	
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
		return "ClientInfo [ip=" + ip + ", port=" + port + ", serviceName=" + serviceName + "]";
	}
	
}
