package nl.jchmb.agents.tests.simple;

import nl.jchmb.agents.Agent;
import nl.jchmb.agents.cognizer.Cognizer;

public class StringifierCognizer<T extends Agent<T>> implements Cognizer<T, Integer, String> {
	@Override
	public String cognize(T agent, Integer perception) {
		return "Random number: " + perception;
	}
}
