package Commands;

import org.powerbot.script.rt4.Item;

public class Sell extends TradeCommand implements Command {

	private Item item;
	private int itemQuantity;
	private int itemPrice;
	private int itemId = -1;
	
	public Sell(Item aItem, int aItemQuantity, int aItemPrice, ContextContainer container) {
		super(container);
		
		item = aItem;
		itemQuantity = aItemQuantity;
		itemPrice = aItemPrice;
	}
	
	public Sell(int itemID, int aItemQuantity, int aItemPrice, ContextContainer container) {
		super(container);
		
		itemQuantity = aItemQuantity;
		itemPrice = aItemPrice;
		this.itemId = itemID;
	}
	
	@Override
	public void command() {
		if (itemId != -1)
			item = inv.getItemById(itemId);
		
		if (item == null) {
			System.out.println("Item is invalid for selling");
		} else {
			ge.sell(item, itemQuantity, itemPrice);
		}
	}

	@Override
	public boolean isRunnable() {
		return true;
	}
}
