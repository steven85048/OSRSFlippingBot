package Client;

import java.util.ArrayList;
import java.util.HashMap;

/*
 * Class that contains and updates the current user state
 */

import org.powerbot.script.rt4.ClientAccessor;
import org.powerbot.script.rt4.ClientContext;
import org.powerbot.script.rt4.Item;

import Transaction.ActiveTransaction;
import Transaction.ItemPurchaseData;
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
	private HashMap<Integer, ItemPurchaseData> purchaseMap;
	private ArrayList<ActiveTransaction> activeTransactions;
	
	public ClientState(ClientContext ctx, Inventory inv, GrandExchange ge) {
		super(ctx);
		
		this.inv = inv;
		this.ge = ge;
		
		updateClientState();
		purchaseMap = new HashMap<Integer, ItemPurchaseData>();
		activeTransactions = new ArrayList<ActiveTransaction>();
	}
	
	// SETTERS for the client state
	
	public void updateClientState() {
		setGoldCount();
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
	}

	public void addTransaction(ActiveTransaction transaction) {
		activeTransactions.add(transaction);
	}
	
	// ===========================================================================
	// TRANSACTION METHODS
	// ===========================================================================
	
	public void transactionCompletionHandler() {
		ArrayList<ActiveTransaction> currTransactions = ge.getSlotPurchase();
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
