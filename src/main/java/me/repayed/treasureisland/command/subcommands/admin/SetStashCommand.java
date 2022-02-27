package me.repayed.treasureisland.command.subcommands.admin;

import me.repayed.treasureisland.TreasureIsland;
import me.repayed.treasureisland.command.SubCommand;
import org.bukkit.entity.Player;

public class SetStashCommand extends SubCommand {
    public SetStashCommand(TreasureIsland treasureIsland) {
        super(treasureIsland);
    }

    @Override
    protected String getName() {
        return "setstash";
    }

    @Override
    protected PermissionType getPermissionType() {
        return PermissionType.ADMIN;
    }

    @Override
    protected String getUsage() {
        return "/arena setstash <arena> <team>";
    }

    @Override
    protected String getDescription() {
        return null;
    }

    @Override
    protected void execute(Player player, String[] args) {

    }
}
