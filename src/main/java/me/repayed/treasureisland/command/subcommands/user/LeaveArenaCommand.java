package me.repayed.treasureisland.command.subcommands.user;

import me.repayed.treasureisland.TreasureIsland;
import me.repayed.treasureisland.command.SubCommand;
import org.bukkit.entity.Player;

public class LeaveArenaCommand extends SubCommand {

    public LeaveArenaCommand(TreasureIsland treasureIsland) {
        super(treasureIsland);
    }

    @Override
    protected String getName() {
        return "leave";
    }

    @Override
    protected PermissionType getPermissionType() {
        return PermissionType.USER;
    }

    @Override
    protected String getUsage() {
        return "/arena leave";
    }

    @Override
    protected String getDescription() {
        return "Removes the player from the arena.";
    }

    @Override
    protected void execute(Player player, String[] args) {

    }
}
