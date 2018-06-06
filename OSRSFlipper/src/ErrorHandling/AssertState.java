package ErrorHandling;

import org.powerbot.script.rt4.ClientAccessor;
import org.powerbot.script.rt4.ClientContext;

import Utility.GrandExchange;

/*
 * Assert whether or not the client is in the correct state to proceed
 */

public class AssertState {
	private GrandExchange ge;
	
	public AssertState(GrandExchange ge) {		
		this.ge = ge;
	}
	
	public boolean assertMainState() {
		if (ge.mainWindowOpened())
			return true;
		
		// if its open but in the right subwindow, just close and reopen
		if (ge.opened()){
			return ge.close() && ge.open();
		}
		
		// if your character is somewhere else
		return ge.open();
	}
}
