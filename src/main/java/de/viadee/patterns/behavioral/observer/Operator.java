package de.viadee.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Operator {

	private List<CallCenterAgentListener> agents = new ArrayList<>();

	public void distributeCall(Call call) {

		for (CallCenterAgentListener agent : agents) {
			agent.acceptCall(call);
		}

	}

	public void registerAgent(CallCenterAgentListener agent) {
		this.agents.add(agent);
	}

}
