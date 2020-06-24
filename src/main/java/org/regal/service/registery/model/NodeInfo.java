package org.regal.service.registery.model;

public class NodeInfo {
	
	private String nodeName;
	private String ip;
	private String port;
	private String status;
	
	
	public String getNodeName() {
		return nodeName;
	}
	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "NodeInfo [nodeName=" + nodeName + ", ip=" + ip + ", port=" + port + ", status=" + status + "]";
	}
	
	
}
