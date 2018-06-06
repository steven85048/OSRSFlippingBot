package Transaction;

import org.powerbot.script.rt4.Item;

import Utility.Timer;

public class ActiveTransaction {
	
	// Too lazy to make getters
	
	public Item item;
	public boolean buySell;
	public int itemQuantity;
	public int itemCost;
	public long startTime;
	
	public ActiveTransaction(Item item, boolean buySell, int itemQuantity, int itemCost) {
		this.item = item;
		this.buySell = buySell;
		this.itemQuantity = itemQuantity;
		this.itemCost = itemCost;
		startTime = Timer.getCurrentTime();
	}
}
