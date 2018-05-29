package Commands;

import java.util.ArrayList;

import org.powerbot.script.rt4.ClientContext;

import Client.ClientState;

/*
 * Singleton class that updates the commands for the client(s). The actual
 * logic for the updating is performed in the CommandUpdater.
 */

public class CommandGenerator {
	
	// ===========================================================================
	// INSTANCE VARIABLES
	// ===========================================================================

	// singleton class
	private static CommandGenerator generator;
	
	// list of contexts (may be refactored to hashmap of client ID : obj in future)
	private ArrayList<ContextContainer> contexts;
	
	// ===========================================================================
	// PUBLIC FUNCTIONS
	// ===========================================================================
	
	public static CommandGenerator getInstance() {
		if (generator == null)
			generator = new CommandGenerator();
		
		return generator;
	}
	
	public void addContext(ClientContext ctx, ClientState state) {
		ContextContainer newContainer = new ContextContainer(ctx, state);
		contexts.add(newContainer);
	}
}
