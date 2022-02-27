package me.repayed.treasureisland.command.subcommands.user;

import me.repayed.treasureisland.TreasureIsland;
import me.repayed.treasureisland.command.SubCommand;
import org.bukkit.entity.Player;

public class JoinArenaCommand extends SubCommand{

    public JoinArenaCommand(TreasureIsland treasureIsland) {
        super(treasureIsland);
    }

    @Override
    protected String getName() {
        return "join";
    }

    @Override
    protected PermissionType getPermissionType() {
        return PermissionType.USER;
    }

    @Override
    protected String getUsage() {
        return "/arena join";
    }

    @Override
    protected String getDescription() {
        return "Joins any available arena";
    }

    @Override
    protected void execute(Player player, String[] args) {

    }
}
