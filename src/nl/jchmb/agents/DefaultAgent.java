package nl.jchmb.agents;

import nl.jchmb.agents.actuator.Actuator;
import nl.jchmb.agents.alarm.Alarm;
import nl.jchmb.agents.cognizer.Cognizer;
import nl.jchmb.agents.percept.Percept;
import nl.jchmb.utils.event.Trigger;

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

	@Override
	public void addAlarm(Alarm alarm) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addTrigger(Trigger<?> trigger) {
		// TODO Auto-generated method stub
		
	}
}
