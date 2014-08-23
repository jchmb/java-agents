package nl.jchmb.agents.tests.simple;

import nl.jchmb.agents.Agent;
import nl.jchmb.agents.cognizer.Cognizer;

public class StringifierCognizer implements Cognizer<Integer, String> {
	@Override
	public <T extends Agent> String cognize(T agent, Integer perception) {
		return "Random number: " + perception;
	}
}
