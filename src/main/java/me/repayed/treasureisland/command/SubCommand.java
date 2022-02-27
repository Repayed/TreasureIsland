package me.repayed.treasureisland.command;

import me.repayed.treasureisland.TreasureIsland;
import org.bukkit.entity.Player;

public abstract class SubCommand {

    public enum PermissionType {
        USER, ADMIN
    }

    private final TreasureIsland treasureIsland;

    public SubCommand(TreasureIsland treasureIsland) {
        this.treasureIsland = treasureIsland;
    }

    protected abstract String getName();
    protected abstract PermissionType getPermissionType();
    protected abstract String getUsage();
    protected abstract String getDescription();
    protected abstract void execute(Player player, String[] args);

    }

