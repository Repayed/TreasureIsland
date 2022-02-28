package me.repayed.treasureisland.event.listeners;

import me.repayed.treasureisland.TreasureIsland;
import me.repayed.treasureisland.arena.ArenaHandler;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class ServerListeners implements Listener {

    private final TreasureIsland treasureIsland;
    private final ArenaHandler arenaHandler;

    private final Location lobbyLocation;

    public ServerListeners(TreasureIsland treasureIsland) {
        this.treasureIsland = treasureIsland;
        this.arenaHandler = treasureIsland.getArenaHandler();
        this.lobbyLocation = treasureIsland.getConfigFile().loadNewLocation("server-lobby");
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        final Player player = event.getPlayer();
        player.teleport(lobbyLocation);

        treasureIsland.getConfigFile().getConfigStringList("messages.user.server-join");
        player.playSound(player.getLocation(), Sound.ENTITY_ARROW_HIT, .95F, 1.0F);

        event.setJoinMessage("&6&lTreasure &e&lIsland &8┃ &6" + player.getDisplayName() + " &ehas joined the network.");
    }

    @EventHandler
    public void onPlayerLeave(PlayerQuitEvent event) {
        Player player = event.getPlayer();

    }


}
