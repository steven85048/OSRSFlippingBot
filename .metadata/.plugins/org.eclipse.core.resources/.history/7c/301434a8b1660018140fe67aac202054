package Commands;

import org.powerbot.script.rt4.ClientContext;

import Client.ClientState;

public class ContextContainer {
	// ===========================================================================
	// INSTANCE VARIABLES
	// ===========================================================================
	
	ClientContext ctx;
	GrandExchange ge;
	Inventory inv;
	ClientState clientState;
	
	// ===========================================================================
	// MAIN FUNCTIONS
	// ===========================================================================
	
	public ContextContainer(ClientContext ctx) {
		// Initialize client specific functionality
		this.ctx = ctx;
		ge = new GrandExchange(ctx);
		inv = new Inventory(ctx);
		clientState = new ClientState(ctx, inv);
		
		// Get initial client state
		clientState.updateClientState();
	}
	
	public ClientContext getContext() {
		return ctx;
	}
	
	public GrandExchange getGE() {
		return ge;
	}
	
	public Inventory getInv() {
		return inv;
	}
	
	public ClientState getClientState() {
		return clientState;
	}
}
