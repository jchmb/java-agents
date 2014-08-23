package nl.jchmb.agents.percept;

import nl.jchmb.agents.Agent;

public interface Percept<T extends Agent, Perception> {
	public Perception perceive(T agent);
}
