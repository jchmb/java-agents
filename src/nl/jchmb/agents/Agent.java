package nl.jchmb.agents;

public interface Agent<T extends Agent<T>> {
	public void onStep();
	
	public void performAction(AgentAction<T> action);
	public <V> V performQuery(AgentQuery<T, V> query);
}