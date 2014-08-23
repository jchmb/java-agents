package nl.jchmb.agents.actuator;

import nl.jchmb.agents.Agent;

public interface Actuator<Feedback> {
	public Feedback act(Agent agent);
}
