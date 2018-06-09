package Transaction;

import java.util.ArrayList;

/*
 * Saves the purchase data to obtain the margin profit after the purchased items are sold
 */

public class ItemPurchaseData {
	public static class PurchaseTuple<Quantity, Cost> {
		private Quantity quantity;
		private Cost cost;
		
		public PurchaseTuple(Quantity quantity, Cost cost){
			this.quantity = quantity;
			this.cost = cost;
		}
		
		public Quantity getQuantity() {
			return quantity;
		}
		
		public Cost getCost() {
			return cost;
		}
		
		public void setQuantity(Quantity quantity) {
			this.quantity = quantity;
		}
		
		public void setCost(Cost cost) {
			this.cost = cost;
		}
	}
	
	// Instance variables
	
	private ArrayList<PurchaseTuple<Integer, Integer>> purchases;
	
	// Methods:
	
	public ItemPurchaseData(){
		purchases = new ArrayList<PurchaseTuple<Integer, Integer>>();
	}
	
	public void addPurchase(int quantity, int cost) {
		for (int i = 0 ; i < purchases.size(); i++) {
			
		}
	}
	
	public int consumePurchase(int quantity, int cost) {
		int profit = 0;
		
		return profit;
	}
}