package nl.jchmb.agents.universe;

import java.util.Collection;

import nl.jchmb.agents.Agent;

public interface Universe {
	public void addAgent(Agent agent);
	public Collection<Agent> getAgents();
	public void run();
	public void start();
	public void stop();
	public void onStep();
}
