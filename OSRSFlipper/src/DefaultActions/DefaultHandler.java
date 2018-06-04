package DefaultActions;

import java.util.Queue;

import Commands.Command;
import Commands.ContextContainer;

public class DefaultHandler {
	ContextContainer contextContainer;
	Queue<Command> commandQueue;
	
	public DefaultHandler(ContextContainer contextContainer, Queue<Command> commandQueue) {
		this.contextContainer = contextContainer;
		this.commandQueue = commandQueue;
	}
	
	public void defaultAction() {
		
	}
}
