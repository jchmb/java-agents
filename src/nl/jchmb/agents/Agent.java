package nl.jchmb.agents;

import nl.jchmb.agents.actuator.Actuator;
import nl.jchmb.agents.cognizer.Cognizer;
import nl.jchmb.agents.percept.Percept;

public interface Agent<T extends Agent<T>> {
	public void onStep();
	public <Perception> Perception perceive(Percept<T, Perception> percept);
	public <Feedback> Feedback act(Actuator<T, Feedback> actuator);
	public <Perception, Cognition> Cognition cognize(Cognizer<T, Perception, Cognition> cognizer, Perception perception);
}