package me.repayed.treasureisland.command.subcommands.admin;

import me.repayed.treasureisland.TreasureIsland;
import me.repayed.treasureisland.command.SubCommand;
import org.bukkit.entity.Player;

public class CreateArenaCommand extends SubCommand {

    public CreateArenaCommand(TreasureIsland treasureIsland) {
        super(treasureIsland);
    }

    @Override
    protected String getName() {
        return "create";
    }

    @Override
    protected PermissionType getPermissionType() {
        return PermissionType.ADMIN;
    }

    @Override
    protected String getUsage() {
        return "/arena create <name>";
    }

    @Override
    protected String getDescription() {
        return "Creates an arena.";
    }

    @Override
    protected void execute(Player player, String[] args) {

    }
}
