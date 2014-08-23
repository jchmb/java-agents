package nl.jchmb.agents.cognizer;

import nl.jchmb.agents.Agent;

public interface Cognizer<Perception, Cognition> {
	public <T extends Agent> Cognition cognize(T agent, Perception perception);
}
