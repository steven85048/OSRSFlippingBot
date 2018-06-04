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
	
	// Singleton method
	public static CommandGenerator getInstance() {
		if (generator == null)
			generator = new CommandGenerator();
		
		return generator;
	}
	
	// registers a new client to the commandgenerator
	public void addContext(ContextContainer container, Queue<Command> commandList) { 
		contexts.add(container);
		commandLists.add(commandList); 
	}
	
	public void addCommand(int clientIndex) {
		// Get which user context to send the command to 
		ContextContainer aContainer = contexts.get(clientIndex);
		
		// Get the command queue for that client
		Queue<Command> aCommandList = commandLists.get(clientIndex);
		
		// For now lets just add one buy command
		for (int i = 0 ; i < 30; i++){
			Command buyCommand = new Buy(1, 1925, 100, aContainer);
			Command buyCommand2 = new Sell(1, 1925, 3, aContainer);
			
			aCommandList.add(buyCommand);
			aCommandList.add(buyCommand2);
		}
	}
}
