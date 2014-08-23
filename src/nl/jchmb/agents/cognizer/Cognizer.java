package nl.jchmb.agents.cognizer;

import nl.jchmb.agents.Agent;

public interface Cognizer<Perception, Cognition> {
	public Cognition cognize(Agent agent, Perception perception);
}
