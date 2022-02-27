package me.repayed.treasureisland.arena;

import me.repayed.treasureisland.TreasureIsland;
import me.repayed.treasureisland.data.ConfigFile;
import me.repayed.treasureisland.player.TreasurePlayer;
import org.bukkit.Location;
import org.bukkit.configuration.file.FileConfiguration;

import java.util.ArrayList;
import java.util.List;

public class ArenaHandler {

    private List<Arena> arenaList;
    private FileConfiguration config;

    private ConfigFile configFile;

    public ArenaHandler(TreasureIsland treasureIsland) {
        this.arenaList = new ArrayList<>();
        this.config = treasureIsland.getConfig();

        this.configFile = treasureIsland.getConfigFile();
    }

    public List<Arena> getArenas() {
        return this.arenaList;
    }

    /**
     * Load Arenas from config.yml to the List
     */

    public void loadArenas() {
        this.config.getConfigurationSection("arenas").getKeys(false).forEach(key -> {
            String name = config.getString(key+".name");
            Location lobbyLocation = configFile.loadNewLocation(key+".lobby");
            Location englandLocation = configFile.loadNewLocation(key+".england");
            Location spainLocation = configFile.loadNewLocation(key+".spain");
            Location piratesLocation = configFile.loadNewLocation(key+".pirates");
            Location nativesLocation = configFile.loadNewLocation(key+".natives");
        });
    }

    public void removeArena(Arena arena) {

    }

    public void addArena(Arena arena) {

    }

    public void addPlayer(TreasurePlayer treasurePlayer) {

    }

    public void removePlayer(TreasurePlayer treasurePlayer) {

    }

}
