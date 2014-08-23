package nl.jchmb.agents.trigger;

import nl.jchmb.agents.Agent;
import nl.jchmb.utils.event.Event;

public abstract class DefaultAgentTrigger<T extends Agent<T>, E extends Event> implements AgentTrigger<T, E> {
	private T agent;
	
	@Override
	public T getAgent() {
		return agent;
	}

	@Override
	public void setAgent(T agent) {
		this.agent = agent;
	}
}
