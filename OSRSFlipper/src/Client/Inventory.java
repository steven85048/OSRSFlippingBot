package Client;

/*
 * Contains methods relevant to the handling of the user's inventory.
 */

import org.powerbot.script.rt4.ClientAccessor;
import org.powerbot.script.rt4.ClientContext;
import org.powerbot.script.rt4.Item;

public class Inventory extends ClientAccessor{

	public static int GOLD_ID = 995;
	
	public Inventory(ClientContext ctx) {
		super(ctx);
	}
	
	// ===========================================================================
	// MAIN FUNCTIONS
	// ===========================================================================
		
	// Get all items currently in inventory
	public Item[] getItems() {
		return ctx.inventory.items();
	}
	
	// Get the current gold count in inventory
	public int getGoldCount() {
		Item[] items = ctx.inventory.items();
		
		for (int i = 0 ; i < items.length; i++){
			if (items[i].id() == GOLD_ID){
				return items[i].stackSize();
			}
		}
		
		// return error return
		return -1;
	}
	
}