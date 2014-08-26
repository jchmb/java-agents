package nl.jchmb.agents;

import nl.jchmb.agents.action.AgentAction;
import nl.jchmb.agents.query.AgentQuery;

public interface Agent {
	public void onStep();
	
	public void performAction(AgentAction action);
	public <V> V performQuery(AgentQuery<V> query);
	public Object getService(String serviceName);
}