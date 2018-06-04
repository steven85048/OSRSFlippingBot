package Client;

/*
 * Class that contains and updates the current user state
 */

import org.powerbot.script.rt4.ClientAccessor;
import org.powerbot.script.rt4.ClientContext;
import org.powerbot.script.rt4.Item;

import Commands.Inventory;

public class ClientState extends ClientAccessor{
	
	// ===========================================================================
	// INSTANCE VARIABLES
	// ===========================================================================
	
	private Inventory inv;
	
	private int goldCount;
	private Item[] inventory;
	private int emptySlots;
	
	public ClientState(ClientContext ctx, Inventory inv) {
		super(ctx);
		
		this.inv = inv;
	}
	
	// SETTERS for the client state
	
	public void updateClientState() {
		setGoldCount();
		setItems();
	}
	
	public void setGoldCount(){
		this.goldCount = inv.getGoldCount();
	}
	
	public void setItems() {
		this.inventory = inv.getItems();
	}
	
	
}
