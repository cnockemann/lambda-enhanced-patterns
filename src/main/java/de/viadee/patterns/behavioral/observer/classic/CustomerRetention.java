package de.viadee.patterns.behavioral.observer.classic;

import de.viadee.patterns.behavioral.observer.Call;
import de.viadee.patterns.behavioral.observer.CallCenterAgentListener;

public class CustomerRetention implements CallCenterAgentListener {

	@Override
	public void acceptCall(Call call) {
		System.out.println("\"Please stay with us!\"");
	}

}
