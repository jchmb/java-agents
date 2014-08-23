package nl.jchmb.agents;

import nl.jchmb.agents.actuator.Actuator;
import nl.jchmb.agents.cognizer.Cognizer;
import nl.jchmb.agents.percept.Percept;
import nl.jchmb.utils.alarm.AlarmManager;
import nl.jchmb.utils.alarm.DefaultAlarmManager;

public class DefaultAgent implements Agent {
	private AlarmManager alarmManager;
	
	public DefaultAgent() {
		alarmManager = new DefaultAlarmManager();
	}
	
	@Override
	public void onStep() {
		alarmManager.tryTrigger();
	}

	@Override
	public <Perception> Perception perceive(
			Percept<Perception> percept) {
		return percept.perceive(this);
	}

	@Override
	public <Feedback> Feedback act(Actuator<Feedback> actuator) {
		return actuator.act(this);
	}

	@Override
	public <Perception, Cognition> Cognition cognize(
			Cognizer<Perception, Cognition> cognizer, Perception perception) {
		return cognizer.cognize(this, perception);
	}
}
