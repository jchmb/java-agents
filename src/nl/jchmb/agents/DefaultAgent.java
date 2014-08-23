package nl.jchmb.agents;

import nl.jchmb.agents.actuator.Actuator;
import nl.jchmb.agents.cognizer.Cognizer;
import nl.jchmb.agents.percept.Percept;

public class DefaultAgent implements Agent<DefaultAgent> {
	@Override
	public void onStep() {
		
	}

	@Override
	public <Perception> Perception perceive(
			Percept<DefaultAgent, Perception> percept) {
		return percept.perceive(this);
	}

	@Override
	public <Feedback> Feedback act(Actuator<DefaultAgent, Feedback> actuator) {
		return actuator.act(this);
	}

	@Override
	public <Perception, Cognition> Cognition cognize(
			Cognizer<DefaultAgent, Perception, Cognition> cognizer, Perception perception) {
		return cognizer.cognize(this, perception);
	}
}
