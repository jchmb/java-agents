package nl.jchmb.agents.service;

import java.util.HashMap;
import java.util.Map;

public class DefaultAgentServiceProvider implements AgentServiceProvider {
	private Map<String, Object> services;
	
	public DefaultAgentServiceProvider() {
		services = new HashMap<String, Object>();
	}
	
	@Override
	public void putService(String serviceName, Object service) {
		services.put(serviceName, service);
	}

	@Override
	public Object getService(String serviceName) {
		if (!services.containsKey(serviceName)) {
			return null;
		}
		return services.get(serviceName);
	}

}
