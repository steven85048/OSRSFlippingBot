package Client;

/*
 * Main Client Container - Receives commands from the CommandGenerator and runs them sequentially
 * in the poll method.
 */

import java.util.LinkedList;
import java.util.Queue;

import org.powerbot.script.PollingScript;
import org.powerbot.script.Script;
import org.powerbot.script.rt4.ClientContext;

@Script.Manifest(
		name = "GeExchange",
		description = "Flipping Bot"
)
public class OSRSFlipper extends PollingScript<ClientContext>{
	
// ===========================================================================
// INSTANCE VARIABLES
// ===========================================================================
	
    private GrandExchange ge;
    private Inventory inv;
	
	private Queue<String> commandList = new LinkedList<String>();
		
// ===========================================================================
// MAIN FUNCTIONS
// ===========================================================================
	
	// Initialize the worker classes that will be used within the tasks
	@Override
	public void start() {
		ge = new GrandExchange(ctx);
		inv = new Inventory(ctx);
	}
	
	// Method that will be continuously called for this client
	@Override
	public void poll() {

	}
	
	// Cleanup method to deallocate resources
	@Override
	public void stop() {

	}
}
