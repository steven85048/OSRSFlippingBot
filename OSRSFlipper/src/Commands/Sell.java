package Commands;

import org.powerbot.script.rt4.Item;

public class Sell implements Command {

	private Item item;
	private int itemQuantity;
	private int itemPrice;
	
	public Sell() {
		
	}
	
	@Override
	public void command() {
		
	}

	@Override
	public boolean isRunnable() {
		return false;
	}
}
