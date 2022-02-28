package me.repayed.treasureisland.event;

import me.repayed.treasureisland.arena.Arena;
import me.repayed.treasureisland.player.TreasurePlayer;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class ArenaLeaveEvent extends Event implements Cancellable {

    private static final HandlerList HANDLERS = new HandlerList();

    private TreasurePlayer treasurePlayer;
    private Arena arena;

    private boolean isCancelled;

    public ArenaLeaveEvent(TreasurePlayer treasurePlayer, Arena arena) {
        this.treasurePlayer = treasurePlayer;
        this.arena = arena;
        this.isCancelled = false;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public Arena getArena() {
        return arena;
    }

    public TreasurePlayer getTreasurePlayer() {
        return treasurePlayer;
    }

    @Override
    public boolean isCancelled() {
        return this.isCancelled;
    }

    @Override
    public void setCancelled(boolean cancel) {
        this.isCancelled = cancel;
    }
}