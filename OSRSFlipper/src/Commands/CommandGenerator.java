package Commands;

import java.util.ArrayList;
import java.util.Queue;

import org.powerbot.script.rt4.ClientContext;

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
	private ArrayList<Queue<Command>> commandLists;
	
	// ===========================================================================
	// PUBLIC FUNCTIONS
	// ===========================================================================
	
	public static CommandGenerator getInstance() {
		if (generator == null)
			generator = new CommandGenerator();
		
		return generator;
	}
	
	public void addContext(ClientContext ctx) {
		ContextContainer newContainer = new ContextContainer(ctx);
		contexts.add(newContainer);
	}
	
	public void addCommand(int clientIndex) {
		
	}
}
