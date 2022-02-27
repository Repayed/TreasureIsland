package me.repayed.treasureisland.command.subcommands.admin;

import me.repayed.treasureisland.TreasureIsland;
import me.repayed.treasureisland.command.SubCommand;
import org.bukkit.entity.Player;

public class RemoveArenaCommand extends SubCommand {

    public RemoveArenaCommand(TreasureIsland treasureIsland) {
        super(treasureIsland);
    }

    @Override
    protected String getName() {
        return "remove";
    }

    @Override
    protected PermissionType getPermissionType() {
        return PermissionType.ADMIN;
    }

    @Override
    protected String getUsage() {
        return "/arena remove <name>";
    }

    @Override
    protected String getDescription() {
        return null;
    }

    @Override
    protected void execute(Player player, String[] args) {

    }
}
