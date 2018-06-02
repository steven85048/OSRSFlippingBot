package Commands;

import Utility.GrandExchange;
import Utility.Inventory;

public class TradeCommand {
	public GrandExchange ge;
	public Inventory inv;
	public ContextContainer container;
	
	public TradeCommand(ContextContainer container) {
		ge = container.getGE();
		inv = container.getInv();
		this.container = container;
	}
}
