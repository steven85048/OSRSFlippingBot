package Client;

/*
 * Class that contains and updates the current user state
 */

import org.powerbot.script.rt4.ClientAccessor;
import org.powerbot.script.rt4.ClientContext;
import org.powerbot.script.rt4.Item;

import Utility.GrandExchange;
import Utility.Inventory;

public class ClientState extends ClientAccessor{
	
	public int FREEMIUM_SLOT = 5;
	
	// ===========================================================================
	// INSTANCE VARIABLES
	// ===========================================================================
	
	private Inventory inv;
	private GrandExchange ge;
	
	private int goldCount;
	private Item[] inventory;
	private int emptySlots;
	
	public ClientState(ClientContext ctx, Inventory inv, GrandExchange ge) {
		super(ctx);
		
		this.inv = inv;
		this.ge = ge;
	}
	
	// SETTERS for the client state
	
	public void updateClientState() {
		setGoldCount();
		setItems();
		setEmptySlots();
	}
	
	// ===========================================================================
	// SETTERS 
	// ===========================================================================
	
	public void setGoldCount(){
		this.goldCount = inv.getGoldCount();
	}
	
	public void setItems() {
		this.inventory = inv.getItems();
	}
	
	public void setEmptySlots() {
		this.emptySlots = ge.getAvailableSlots() - FREEMIUM_SLOT;
		System.out.println(emptySlots);
	}
	
	// ===========================================================================
	// GETTERS
	// ===========================================================================
	
	public int getGoldCount() {
		return this.goldCount;
	}
	
	public Item[] getItems() {
		return this.inventory;
	}
	
	public int getEmptySlots() {
		return this.emptySlots;
	}
}
