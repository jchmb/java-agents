package nl.jchmb.agents.service;

public interface AgentServiceProvider {
	public void putService(String serviceName, Object service);
	public Object getService(String serviceName);
}
