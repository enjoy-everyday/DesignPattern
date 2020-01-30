package com.sise.wxy;

public class FirstCommand extends Command {
	
	private Receiver receiver = new Receiver();

	@Override
	public void execute() {
		receiver.action();
	}
	
}
