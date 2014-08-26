package nl.jchmb.agents.builder;

import nl.jchmb.agents.Agent;

public interface AgentBuilder<T extends Agent> {
	public void buildAgent(T agent);
}