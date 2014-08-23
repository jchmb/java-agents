package nl.jchmb.agents.cognizer;

import nl.jchmb.agents.Agent;

public interface Cognizer<T extends Agent, Perception, Cognition> {
	public Cognition cognize(T agent, Perception perception);
}
