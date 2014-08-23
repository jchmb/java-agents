package nl.jchmb.agents.trigger;

import nl.jchmb.agents.Agent;
import nl.jchmb.utils.event.Event;
import nl.jchmb.utils.event.Trigger;

public interface AgentTrigger<T extends Agent<T>, E extends Event> extends Trigger<E> {
	public T getAgent();
	public void setAgent(T agent);
}
