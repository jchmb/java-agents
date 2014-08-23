package nl.jchmb.agents.tests.simple;

import java.util.Random;

import nl.jchmb.agents.Agent;
import nl.jchmb.agents.percept.Percept;

public class RandomPercept<T extends Agent<T>> implements Percept<T, Integer> {
	@Override
	public Integer perceive(T agent) {
		return new Random().nextInt();
	}
}
