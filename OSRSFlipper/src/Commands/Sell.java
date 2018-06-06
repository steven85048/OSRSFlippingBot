package Commands;

import org.powerbot.script.rt4.Item;

import Client.ClientState;
import Transaction.ActiveTransaction;

public class Sell extends TradeCommand implements Command {

	private Item item;
	private int itemQuantity;
	private int itemPrice;
	private int itemId = -1;
	
	private ActiveTransaction mActiveTransaction;
		
	public Sell(int aItemQuantity, Item aItem, int aItemPrice, ContextContainer container) {
		super(container);
		
		item = aItem;
		itemQuantity = aItemQuantity;
		itemPrice = aItemPrice;
		
		mActiveTransaction = new ActiveTransaction(aItem.name().toLowerCase(), false, itemQuantity, itemPrice, 0, 0);
	}
	
	public Sell(int aItemQuantity, int itemID, int aItemPrice, ContextContainer container) {
		super(container);
		
		itemQuantity = aItemQuantity;
		itemPrice = aItemPrice;
		this.itemId = itemID;
		
		mActiveTransaction = new ActiveTransaction(ge.getNameFromId(itemId).toLowerCase(), false, itemQuantity, itemPrice, 0, 0);
	}
	
	@Override
	public boolean command() {
		if (itemId != -1)
			item = inv.getItemById(itemId);
		
		if (item == null) {
			System.out.println("Item is invalid for selling");
			return false;
		} else {
			return ge.sell(item, itemQuantity, itemPrice);
		}
	}

	@Override
	public boolean isRunnable() {
		if (clientState.getEmptySlots() <= 0) {
			System.out.println("COMMAND_ERR: Not enough slots");
			return false;
		}
		
		return true;
	}
	
	@Override
	public ActiveTransaction activeTransaction() {
		mActiveTransaction.setStartTime();
		return mActiveTransaction;
	}
}
