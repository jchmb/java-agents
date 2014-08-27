package nl.jchmb.agents;

import nl.jchmb.agents.action.AgentAction;
import nl.jchmb.agents.query.AgentQuery;
import nl.jchmb.agents.universe.Universe;

public interface Agent {
	public void onStep();
	public void onAttach();
	
	public void performAction(AgentAction action);
	public <V> V performQuery(AgentQuery<V> query);
	public Object getService(String serviceName);
	
	public Universe getUniverse();
	public void setUniverse(Universe universe);
}