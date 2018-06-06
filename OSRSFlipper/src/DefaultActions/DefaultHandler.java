package DefaultActions;

import java.util.Queue;

import Commands.Command;
import Commands.ContextContainer;
import Transaction.TransactionAcceptor;

/*
 * Defines actions that occur when a command is not run
 */

public class DefaultHandler {
	ContextContainer contextContainer;
	Queue<Command> commandQueue;
	
	TransactionAcceptor acceptor;
	
	public DefaultHandler(ContextContainer contextContainer, Queue<Command> commandQueue) {
		this.contextContainer = contextContainer;
		this.commandQueue = commandQueue;
		
		acceptor = new TransactionAcceptor(this.contextContainer);
	}
	
	// default function
	public void defaultAction() {
		// First collect the transactions and update the ItemPurchaseData
		acceptor.collectTransactions();
	}
}
