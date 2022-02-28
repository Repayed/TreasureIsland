package me.repayed.treasureisland.command;

import me.repayed.treasureisland.TreasureIsland;
import me.repayed.treasureisland.command.subcommands.admin.*;
import me.repayed.treasureisland.command.subcommands.user.JoinArenaCommand;
import me.repayed.treasureisland.command.subcommands.user.LeaveArenaCommand;
import me.repayed.treasureisland.data.ConfigFile;
import me.repayed.treasureisland.util.Chat;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.HashSet;
import java.util.Set;

public class CommandHandler implements CommandExecutor {

    private final Set<SubCommand> subCommands;
    private final TreasureIsland treasureIsland;
    private final ConfigFile configFile;

    public CommandHandler(final TreasureIsland treasureIsland) {
        this.subCommands = new HashSet<>();
        this.treasureIsland = treasureIsland;
        this.configFile = treasureIsland.getConfigFile();

        this.subCommands.add(new JoinArenaCommand(treasureIsland));
        this.subCommands.add(new LeaveArenaCommand(treasureIsland));
        this.subCommands.add(new ArenaListCommand(treasureIsland));
        this.subCommands.add(new CreateArenaCommand(treasureIsland));
        this.subCommands.add(new SetLobbyCommand(treasureIsland));
        this.subCommands.add(new SetSpawnCommand(treasureIsland));
        this.subCommands.add(new SetStashCommand(treasureIsland));
        this.subCommands.add(new JoinArenaCommand(treasureIsland));
        this.subCommands.add(new LeaveArenaCommand(treasureIsland));

    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage("[TreasureIsland] Only players can access this command.");
        } else {
            Player player = (Player) sender;
            final String adminPermission = treasureIsland.getConfig().getString("permissions.treasure-admin");

            SubCommand usedCommand = this.subCommands.stream()
                    .filter(subCommand -> subCommand.getName().equalsIgnoreCase(args[0]))
                    .findFirst().get();

            if (usedCommand != null) {
                if (usedCommand.getPermissionType() == SubCommand.PermissionType.ADMIN) {
                    if (!player.hasPermission(adminPermission)) {
                        player.sendMessage(configFile.getConfigStringMessage("messages.no-permission"));
                        player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BASS, 0.95F, 1.0F);
                    } else {
                        usedCommand.execute(player, args);
                    }
                }

            } else {
                if(!(player.hasPermission(adminPermission))) {
                    player.sendMessage(configFile.getConfigStringMessage("messages.user.unknown-command"));
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BASS, 0.95F, 1.0F);
                } else {
                    configFile.getConfigStringList("messages.admin.game-menu").forEach(player::sendMessage);
                    player.playSound(player.getLocation(), Sound.ENTITY_COW_STEP, .95F, 1.0F);
                }
            }
        }
        return true;
    }
}






