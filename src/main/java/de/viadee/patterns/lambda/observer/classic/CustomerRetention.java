package de.viadee.patterns.lambda.observer.classic;

import de.viadee.patterns.lambda.observer.Call;
import de.viadee.patterns.lambda.observer.CallCenterAgentListener;

public class CustomerRetention implements CallCenterAgentListener {

	@Override
	public void acceptCall(Call call) {
		System.out.println("\"Please stay with us!\"");
	}

}
