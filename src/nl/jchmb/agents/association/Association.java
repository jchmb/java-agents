package nl.jchmb.agents.association;

import nl.jchmb.agents.Agent;
import nl.jchmb.agents.response.Response;
import nl.jchmb.agents.stimulus.Stimulus;

public interface Association<T extends Agent<T>, R extends Response<T, ?>> {
	public R associate(Stimulus stimulus);
}