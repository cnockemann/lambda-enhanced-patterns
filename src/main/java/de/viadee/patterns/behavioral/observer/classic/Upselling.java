package de.viadee.patterns.behavioral.observer.classic;

import de.viadee.patterns.behavioral.observer.Call;
import de.viadee.patterns.behavioral.observer.CallCenterAgentListener;

public class Upselling implements CallCenterAgentListener {

	@Override
	public void acceptCall(Call call) {
		System.out.println("\"Try this new feature for only 10$ a month!\"");
	}

}
