package nl.jchmb.agents.action;

import nl.jchmb.agents.Agent;

public interface AgentAction<T extends Agent<T>> {
	public void execute(T agent);
}
