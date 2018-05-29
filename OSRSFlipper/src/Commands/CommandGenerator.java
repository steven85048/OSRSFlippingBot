package Commands;

/*
 * Singleton class that updates the commands for the client(s). The actual
 * logic for the updating is performed in the CommandUpdater.
 */

public class CommandGenerator {
	private static CommandGenerator generator;
	
	public static CommandGenerator getInstance() {
		if (generator == null)
			generator = new CommandGenerator();
		
		return generator;
	}
}