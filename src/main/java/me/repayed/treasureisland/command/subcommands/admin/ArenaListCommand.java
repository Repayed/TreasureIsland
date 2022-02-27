package me.repayed.treasureisland.command.subcommands.admin;

import me.repayed.treasureisland.TreasureIsland;
import me.repayed.treasureisland.command.SubCommand;
import org.bukkit.entity.Player;

public class ArenaListCommand extends SubCommand {

    public ArenaListCommand(TreasureIsland treasureIsland) {
        super(treasureIsland);
    }

    @Override
    protected String getName() {
        return "list";
    }

    @Override
    protected PermissionType getPermissionType() {
        return PermissionType.ADMIN;
    }

    @Override
    protected String getUsage() {
        return "/arena list";
    }

    @Override
    protected String getDescription() {
        return "Displays all of the arenas";
    }

    @Override
    protected void execute(Player player, String[] args) {

    }
}
