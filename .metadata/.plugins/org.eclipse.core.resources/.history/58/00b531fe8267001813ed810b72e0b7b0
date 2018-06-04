package Client;

/*
 * Defines the default behavior that is run in the background in between two commands
 */

import org.powerbot.script.rt4.ClientAccessor;
import org.powerbot.script.rt4.ClientContext;

import Utility.GrandExchange;

public class DefaultCommand extends ClientAccessor{
	private GrandExchange ge;
	
	public DefaultCommand(ClientContext ctx){
		super(ctx);
		
		ge = new GrandExchange(ctx);
	}
	
	public void defaultActivity() {
		ge.collectToInventory();
	}
	
}
