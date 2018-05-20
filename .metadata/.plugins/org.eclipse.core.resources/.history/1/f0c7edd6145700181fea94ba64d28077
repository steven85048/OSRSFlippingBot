package ScriptPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;

import org.powerbot.script.Condition;
import org.powerbot.script.PollingScript;
import org.powerbot.script.Script;
import org.powerbot.script.rt4.ClientContext;
import org.powerbot.script.rt4.GameObject;
import org.powerbot.script.rt4.Npc;
import org.powerbot.script.rt4.TilePath;

@Script.Manifest(
		name = "Chopping",
		description = "Basic Script Example"
)
public class OSRSFlipper extends PollingScript<ClientContext>{
    private final String BOX_NAME = "Bank deposit box";
    private double nextDist = 1 + Math.random() * 3;
    private TilePath pathToBank;
	
	private List<Task> taskList = new ArrayList<Task>();
		
	@Override
	public void start() {
		
	}
	
	@Override
	public void poll() {
		
		System.out.println(ctx.npcs.select().name("Chicken").nearest().poll().tile());
		
		if(pathToBank == null)          
            pathToBank = ctx.movement.newTilePath(ctx.npcs.select().name("Chicken").nearest().poll().tile());
        nextDist = 1 + Math.random() * 3;
        pathToBank.traverse();
        Condition.wait(new Callable<Boolean>() {
            @Override
            public Boolean call() throws Exception {
            return (ctx.players.local().inMotion());
        }}, 500, 10);
		
		/**
		if (ctx.players.local().animation() == -1){
			Npc obj = ctx.npcs.select().name("Chicken").nearest().poll();
			obj.interact("Attack");
		}*/
		
		/**
		for (Task task: taskList) {
			if (task.activate()) {
				task.execute();
			}
		}
		*/
	}
	
	@Override
	public void stop() {
		System.out.println("stop");
	}
}
