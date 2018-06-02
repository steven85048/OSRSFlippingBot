package Commands;

public class Buy extends TradeCommand implements Command {

	// ===========================================================================
	// INSTANCE VARIABLES
	// ===========================================================================
	
	private int itemQuantity;
	private int itemId;
	private int itemPrice;
		
	private int itemCost;
		
	public Buy(int aItemQuantity, int aItemId, int aItemPrice, ContextContainer container) {
		super(container);
		
		itemQuantity = aItemQuantity;
		itemId = aItemId;
		itemPrice = aItemPrice;	
		
		itemCost = itemPrice * itemQuantity;
	}
	
	@Override
	public boolean command() {
		try {
			return ge.buy(itemId, itemQuantity, itemPrice);
		} catch (Exception e){
			System.out.println("Buy Command Failed");
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean isRunnable() {
		if (container.getClientState().getEmptySlots() <= 0) {
			System.out.println("COMMAND_ERR: Not enough slots");
			return false;
		}
		
		if (container.getClientState().getGoldCount() < itemCost ) {
			System.out.println("COMMAND_ERR: Not enough gold to purchase");
			return false;
		}
		
		return true;
	}
}
