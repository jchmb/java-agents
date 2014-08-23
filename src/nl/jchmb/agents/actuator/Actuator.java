package nl.jchmb.agents.actuator;

import nl.jchmb.agents.Agent;

public interface Actuator<T extends Agent, Feedback> {
	public Feedback act(T agent);
}
