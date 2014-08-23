package nl.jchmb.agents.percept;

import nl.jchmb.agents.Agent;

public interface Percept<Perception> {
	public Perception perceive(Agent agent);
}
