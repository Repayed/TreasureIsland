package me.repayed.treasureisland.command.subcommands.admin;

import me.repayed.treasureisland.TreasureIsland;
import me.repayed.treasureisland.command.SubCommand;
import org.bukkit.entity.Player;

public class SetSpawnCommand extends SubCommand {

    public SetSpawnCommand(TreasureIsland treasureIsland) {
        super(treasureIsland);
    }

    @Override
    protected String getName() {
        return "setspawn";
    }

    @Override
    protected PermissionType getPermissionType() {
        return PermissionType.ADMIN;
    }

    @Override
    protected String getUsage() {
        return "/arena setspawn <arena> <team>";
    }

    @Override
    protected String getDescription() {
        return null;
    }

    @Override
    protected void execute(Player player, String[] args) {

    }
}
