package nl.jchmb.agents.query;

import nl.jchmb.agents.Agent;

public interface AgentQuery<T extends Agent<T>, V> {
	public V execute(T agent);
}
