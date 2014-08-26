package nl.jchmb.agents;

import nl.jchmb.agents.action.AgentAction;
import nl.jchmb.agents.query.AgentQuery;
import nl.jchmb.agents.service.AgentServiceProvider;
import nl.jchmb.agents.service.DefaultAgentServiceProvider;
import nl.jchmb.utils.alarm.AlarmManager;
import nl.jchmb.utils.alarm.DefaultAlarmManager;

public class DefaultAgent implements Agent {
	private AlarmManager alarmManager;
	private AgentServiceProvider serviceProvider;
	
	public DefaultAgent() {
		alarmManager = new DefaultAlarmManager();
		serviceProvider = new DefaultAgentServiceProvider();
	}
	
	@Override
	public void onStep() {
		alarmManager.tryTrigger();
	}

	@Override
	public void performAction(AgentAction action) {
		action.execute(this);
	}

	@Override
	public <V> V performQuery(AgentQuery<V> query) {
		return query.execute(this);
	}

	@Override
	public Object getService(String serviceName) {
		return serviceProvider.getService(serviceName);
	}
}
