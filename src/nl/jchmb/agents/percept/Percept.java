package nl.jchmb.agents.percept;

import nl.jchmb.agents.Agent;

public interface Percept<Perception> {
	public <T extends Agent> Perception perceive(T agent);
}
