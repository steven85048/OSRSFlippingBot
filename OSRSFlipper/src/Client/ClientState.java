package Client;

import java.util.LinkedList;
import java.util.Queue;

import org.powerbot.script.rt4.Item;

public class ClientState {
	
	// ===========================================================================
	// INSTANCE VARIABLES
	// ===========================================================================
	
	private int goldCount;
	private Item[] inventory;
	private Queue<String> commandList = new LinkedList<String>();
	private int emptySlots;
	
	public ClientState() {
		
	}
	
	// SETTERS for the client state
	
	public void updateClientState() {
		
	}
	
	public void setGoldCount(){
		
	}
	
	
}
