package de.viadee.patterns.behavioral.strategy;

public class Safe {

	private boolean hasLock = false;

	private boolean open = false;

	private int sturdiness = 9001;

	public boolean hasLock() {
		return hasLock;
	}

	public boolean isOpen() {
		return open;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}

	public int getSturdiness() {
		return sturdiness;
	}

}
