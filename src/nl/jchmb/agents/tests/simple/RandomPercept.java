package nl.jchmb.agents.tests.simple;

import java.util.Random;

import nl.jchmb.agents.Agent;
import nl.jchmb.agents.percept.Percept;

public class RandomPercept implements Percept<Integer> {
	@Override
	public <T extends Agent> Integer perceive(T agent) {
		return new Random().nextInt();
	}
}
