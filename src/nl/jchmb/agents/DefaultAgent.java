package nl.jchmb.agents;

import java.util.ArrayList;
import java.util.Collection;

import nl.jchmb.agents.association.Association;
import nl.jchmb.agents.response.Response;
import nl.jchmb.agents.stimulus.Stimulus;

public class DefaultAgent<T extends Agent<T>> implements Agent<T> {
	private Collection<Association<T, ? extends Response<T, ?>>> associations;
	
	public DefaultAgent() {
		associations = new ArrayList<Association<T, ? extends Response<T, ?>>>();
	}

	@Override
	public <S extends Stimulus> void stimulate(S stimulus) {
		Response<T, ?> response;
		for (Association<T, ? extends Response<T, ?>> association : associations) {
			response = association.associate(stimulus);
			response.perform((T) this, stimulus);
		}
	}

	@Override
	public <R extends Response<T, ?>> void addAssociation(
			Association<T, R> association) {
		// TODO Auto-generated method stub
		
	}
}
