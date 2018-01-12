package de.viadee.patterns.lambda.observer.classic;

import de.viadee.patterns.lambda.observer.Call;
import de.viadee.patterns.lambda.observer.CallCenterAgentListener;

public class Upselling implements CallCenterAgentListener {

	@Override
	public void acceptCall(Call call) {
		System.out.println("\"Try this new feature for only 10$ a month!\"");
	}

}
