package me.repayed.treasureisland.event;

import me.repayed.treasureisland.arena.Arena;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class ArenaTickEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    private Arena arena;

    public ArenaTickEvent(Arena arena) {
        this.arena = arena;
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

}
