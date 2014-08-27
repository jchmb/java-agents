package nl.jchmb.agents.alarm;

import nl.jchmb.agents.Agent;
import nl.jchmb.agents.action.AgentAction;
import nl.jchmb.utils.alarm.DefaultAlarm;

public class AgentAlarm extends DefaultAlarm {
	private Agent agent;
	private AgentAction action;
	
	public AgentAlarm(long interval, boolean repeating) {
		super(interval, repeating);
	}
	
	public void setAgent(Agent agent) {
		this.agent = agent;
	}
	
	public void setAction(AgentAction action) {
		this.action = action;
	}

	@Override
	public void trigger() {
		agent.performAction(action);
	}
}
