package Commands;

import Transaction.ActiveTransaction;

/*
 * Default functions all commands must have
 */

public interface Command {
	// ===========================================================================
	// INSTANCE VARIABLES
	// ===========================================================================
	
	public boolean command();
	
	public boolean isRunnable();
	
	public ActiveTransaction activeTransaction();
}
