package nl.jchmb.agents.response;

import nl.jchmb.agents.Agent;
import nl.jchmb.agents.stimulus.Stimulus;

public interface Response<T extends Agent<T>, V extends Stimulus> {
	public void perform(T agent, V stimulus);
}
