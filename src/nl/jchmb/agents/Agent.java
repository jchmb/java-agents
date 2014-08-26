package nl.jchmb.agents;

import nl.jchmb.agents.association.Association;
import nl.jchmb.agents.response.Response;
import nl.jchmb.agents.stimulus.Stimulus;

public interface Agent<T extends Agent<T>> {
	public <S extends Stimulus> void stimulate(S stimulus);
	public <R extends Response<T, ?>> void addAssociation(Association<T, R> association);
}