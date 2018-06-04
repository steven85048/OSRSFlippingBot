package Commands;

public class Buy extends TradeCommand implements Command {

	// ===========================================================================
	// INSTANCE VARIABLES
	// ===========================================================================
	
	private int itemQuantity;
	private int itemId;
	private int itemPrice;
		
	public Buy(int aItemQuantity, int aItemId, int aItemPrice, ContextContainer container) {
		super(container);
		
		itemQuantity = aItemQuantity;
		itemId = aItemId;
		itemPrice = aItemPrice;	
	}
	
	@Override
	public void command() {
		try {
			ge.buy(itemId, itemQuantity, itemPrice);
		} catch (Exception e){
			System.out.println("Buy Command Failed");
			e.printStackTrace();
		}
	}

	@Override
	public boolean isRunnable() {
		return true;
	}
}
