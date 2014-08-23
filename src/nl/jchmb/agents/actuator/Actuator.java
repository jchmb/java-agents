package nl.jchmb.agents.actuator;

import nl.jchmb.agents.Agent;

public interface Actuator<Feedback> {
	public <T extends Agent> Feedback act(T agent);
}
