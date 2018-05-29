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
	
	public CommandGenerator() {
		contexts = new ArrayList<ContextContainer>();
		commandLists = new ArrayList<Queue<Command>>();
	}
	
	public static CommandGenerator getInstance() {
		if (generator == null)
			generator = new CommandGenerator();
		
		return generator;
	}
	
	public void addContext(ClientContext ctx, Queue<Command> commandList) { 
		ContextContainer newContainer = new ContextContainer(ctx);
		contexts.add(newContainer);
		commandLists.add(commandList); 
	}
	
	public void addCommand(int clientIndex) {
		ContextContainer aContainer = contexts.get(clientIndex);
		Queue<Command> aCommandList = commandLists.get(clientIndex);
		
		// For now lets just add one buy command
		//Command buyCommand = new Buy(1, 554, 50, aContainer);
		Command buyCommand2 = new Sell(554, 1, 3, aContainer);
		
		//aCommandList.add(buyCommand);
		aCommandList.add(buyCommand2);
	}
}
