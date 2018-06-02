package Commands;

import org.powerbot.script.rt4.ClientContext;

/*
 * Default functions all commands must have
 */

public interface Command {
	// ===========================================================================
	// INSTANCE VARIABLES
	// ===========================================================================
	
	public boolean command();
	
	public boolean isRunnable();
}
