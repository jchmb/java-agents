package nl.jchmb.agents.tests.simple;

import nl.jchmb.agents.DefaultAgent;

public class Main {
	public static void main(String[] args) {
		DefaultAgent agent = new DefaultAgent();
		
		RandomPercept percept = new RandomPercept();
		Integer perception = percept.perceive(agent);
		StringifierCognizer cognizer = new StringifierCognizer();
		String message = cognizer.cognize(agent, perception);
		PrintActuator actuator = new PrintActuator(message);
		agent.act(actuator);
	}
}
