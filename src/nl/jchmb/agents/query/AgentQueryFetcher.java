package nl.jchmb.agents.query;

import nl.jchmb.agents.Agent;
import nl.jchmb.utils.fetcher.Fetcher;

public class AgentQueryFetcher<V> implements Fetcher<V> {
	private Agent agent;
	private AgentQuery<V> query;

	public void setAgent(Agent agent) {
		this.agent = agent;
	}
	
	public void setQuery(AgentQuery<V> query) {
		this.query = query;
	}
	
	@Override
	public V fetch() {
		if (agent == null || query == null) {
			return null;
		}
		return agent.performQuery(query);
	}
}
