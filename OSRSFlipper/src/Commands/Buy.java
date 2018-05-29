package Commands;

public class Buy implements Command {

	// ===========================================================================
	// INSTANCE VARIABLES
	// ===========================================================================
	
	private int itemQuantity;
	private int itemId;
	private int itemPrice;
	
	private GrandExchange ge;
	
	public Buy(int aItemQuantity, int aItemId, int aItemPrice, ContextContainer container) {
		itemQuantity = aItemQuantity;
		itemId = aItemId;
		itemPrice = aItemPrice;
		
		ge = container.getGE();
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
