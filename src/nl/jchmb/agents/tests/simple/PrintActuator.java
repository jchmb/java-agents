package nl.jchmb.agents.tests.simple;

import nl.jchmb.agents.Agent;
import nl.jchmb.agents.actuator.Actuator;

public class PrintActuator implements Actuator<Void> {
	private String message;
	
	public PrintActuator(String message) {
		this.message = message;
	}
	
	@Override
	public <T extends Agent> Void act(T agent) {
		System.out.println(message);
		return null;
	}
}