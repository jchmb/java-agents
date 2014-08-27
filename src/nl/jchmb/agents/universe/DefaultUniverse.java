package nl.jchmb.agents.universe;

import java.util.ArrayList;
import java.util.Collection;

import nl.jchmb.agents.Agent;

public class DefaultUniverse implements Universe {
	private Collection<Agent> agents;
	private boolean running = false;
	
	public DefaultUniverse() {
		agents = new ArrayList<Agent>();
	}
	
	@Override
	public void addAgent(Agent agent) {
		agents.add(agent);
		agent.setUniverse(this);
		agent.onAttach();
	}

	@Override
	public void run() {
		while (running) {
			onStep();
			try {
				Thread.sleep(1000 * 30);
			} catch (InterruptedException e) {
				e.printStackTrace();
				running = false;
			}
		}
	}

	@Override
	public void start() {
		running = true;
		run();
	}

	@Override
	public void stop() {
		running = false;
	}

	@Override
	public void onStep() {
		for (Agent agent : agents) {
			agent.onStep();
		}
	}

	@Override
	public Collection<Agent> getAgents() {
		return agents;
	}
}
