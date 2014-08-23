package nl.jchmb.agents.tests.simple;

import nl.jchmb.agents.DefaultAgent;

public class Main {
	public static void main(String[] args) {
		DefaultAgent agent = new DefaultAgent();
		
		RandomPercept<DefaultAgent> percept = new RandomPercept<DefaultAgent>();
		Integer perception = percept.perceive(agent);
		StringifierCognizer<DefaultAgent> cognizer = new StringifierCognizer<DefaultAgent>();
		String message = cognizer.cognize(agent, perception);
		PrintActuator<DefaultAgent> actuator = new PrintActuator<DefaultAgent>(message);
		agent.act(actuator);
	}
}
