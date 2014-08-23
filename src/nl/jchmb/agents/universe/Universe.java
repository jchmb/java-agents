package nl.jchmb.agents.universe;

import nl.jchmb.agents.Agent;

public interface Universe {
	public void addAgent(Agent<?> agent);
	public void run();
	public void start();
	public void stop();
	public void onStep();
}
