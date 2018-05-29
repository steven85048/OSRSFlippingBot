package Client;

/*
 * Main Client Container - Receives commands from the CommandGenerator and runs them sequentially
 * in the poll method. Does not directly handle the context!
 */

import java.util.LinkedList;
import java.util.Queue;

import org.powerbot.script.PollingScript;
import org.powerbot.script.Script;
import org.powerbot.script.rt4.ClientContext;

import Commands.Command;
import Commands.CommandGenerator;

@Script.Manifest(
		name = "GeExchange",
		description = "Flipping Bot"
)
public class OSRSFlipper extends PollingScript<ClientContext>{
	
// ===========================================================================
// INSTANCE VARIABLES
// ===========================================================================

	private CommandGenerator generator;
	private Queue<Command> commandList;
		
// ===========================================================================
// MAIN FUNCTIONS
// ===========================================================================
	
	// Initialize the worker classes that will be used within the tasks
	@Override
	public void start() {
		commandList = new LinkedList<Command>();
		 
		// get singleton instance of generator and add context
		generator = CommandGenerator.getInstance();
		generator.addContext(ctx, commandList);
		
		generator.addCommand(0);
	}
	
	// Method that will be continuously called for this client
	@Override
	public void poll() {
		if (!commandList.isEmpty() && commandList.peek().isRunnable()){
			commandList.poll().command();
			
			// Wait a bit until next command
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	// Cleanup method to deallocate resources
	@Override
	public void stop() {

	}
}
