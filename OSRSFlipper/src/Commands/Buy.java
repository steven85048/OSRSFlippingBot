package Commands;

public class Buy implements Command {

	// ===========================================================================
	// INSTANCE VARIABLES
	// ===========================================================================
	
	private int itemQuantity;
	private int itemId;
	
	public Buy(int aItemQuantity, int aItemId) {
		itemQuantity = aItemQuantity;
		itemId = aItemId;
	}
	
	@Override
	public void command() {
		
	}
}