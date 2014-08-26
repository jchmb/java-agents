package nl.jchmb.agents.query;

import nl.jchmb.agents.Agent;

public interface AgentQuery<V> {
	public V execute(Agent agent);
}
