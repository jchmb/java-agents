package nl.jchmb.agents;

import nl.jchmb.agents.actuator.Actuator;
import nl.jchmb.agents.cognizer.Cognizer;
import nl.jchmb.agents.percept.Percept;

public interface Agent {
	public void onStep();
	public <Perception> Perception perceive(Percept<Perception> percept);
	public <Feedback> Feedback act(Actuator<Feedback> actuator);
	public <Perception, Cognition> Cognition cognize(Cognizer<Perception, Cognition> cognizer, Perception perception);
}