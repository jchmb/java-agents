package nl.jchmb.agents;

import nl.jchmb.agents.action.AgentAction;
import nl.jchmb.agents.alarm.AgentAlarm;
import nl.jchmb.agents.query.AgentQuery;
import nl.jchmb.agents.service.AgentServiceProvider;
import nl.jchmb.agents.service.DefaultAgentServiceProvider;
import nl.jchmb.agents.universe.Universe;
import nl.jchmb.utils.alarm.AlarmManager;
import nl.jchmb.utils.alarm.DefaultAlarmManager;

public class DefaultAgent implements Agent {
	private AlarmManager alarmManager;
	private AgentServiceProvider serviceProvider;
	private Universe universe;
	
	public DefaultAgent() {
		alarmManager = new DefaultAlarmManager();
		serviceProvider = new DefaultAgentServiceProvider();
	}
	
	protected AlarmManager getAlarmManager() {
		return alarmManager;
	}
	
	protected void addAlarm(AgentAlarm alarm) {
		alarmManager.addAlarm(alarm);
		alarm.setAgent(this);
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

	@Override
	public Universe getUniverse() {
		return universe;
	}

	@Override
	public void setUniverse(Universe universe) {
		this.universe = universe;
	}

	@Override
	public void onAttach() {
		// TODO Auto-generated method stub
		
	}
}
