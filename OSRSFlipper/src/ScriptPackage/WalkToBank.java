package ScriptPackage;

import java.util.concurrent.Callable;

import org.powerbot.script.Condition;
import org.powerbot.script.rt4.ClientContext;
import org.powerbot.script.rt4.TilePath;

public class WalkToBank extends Task<ClientContext> {
    private final String BOX_NAME = "Bank deposit box";
    private double nextDist;
    private TilePath pathToBank;

    public WalkToBank(ClientContext ctx) {
        super(ctx);
        nextDist = 1 + Math.random() * 3;
    }

    @Override
    public boolean activate() {
        return ctx.objects.select().name(BOX_NAME).isEmpty() && ctx.inventory.select().count() == 28 && (!ctx.players.local().inMotion() || ctx.players.local().tile().distanceTo(ctx.movement.destination()) < nextDist|| ctx.players.local().tile().distanceTo(ctx.bank.nearest().tile()) < (ctx.movement.destination().distanceTo(ctx.bank.nearest().tile()) + nextDist));
    }

    @Override
    public void execute() {
        if(pathToBank == null)          
            pathToBank = ctx.movement.newTilePath(ctx.bank.nearest().tile());
        nextDist = 1 + Math.random() * 3;
        pathToBank.traverse();
        Condition.wait(new Callable<Boolean>() {
            @Override
            public Boolean call() throws Exception {
            return (ctx.players.local().inMotion());
        }}, 500, 10);
    }
}