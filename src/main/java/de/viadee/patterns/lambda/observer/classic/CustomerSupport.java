package de.viadee.patterns.lambda.observer.classic;

import de.viadee.patterns.lambda.observer.Call;
import de.viadee.patterns.lambda.observer.CallCenterAgentListener;

public class CustomerSupport implements CallCenterAgentListener {

	@Override
	public void acceptCall(Call call) {
		System.out.println("\"Have you tried turning it off and on again?\"");
	}
}
