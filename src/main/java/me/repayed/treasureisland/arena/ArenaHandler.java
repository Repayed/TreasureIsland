package me.repayed.treasureisland.arena;

import me.repayed.treasureisland.TreasureIsland;
import me.repayed.treasureisland.data.ConfigFile;
import me.repayed.treasureisland.player.TreasurePlayer;
import org.bukkit.Location;
import org.bukkit.configuration.file.FileConfiguration;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ArenaHandler {

    private List<Arena> arenaList;
    private FileConfiguration config;

    private ConfigFile configFile;

    public ArenaHandler(TreasureIsland treasureIsland) {
        this.arenaList = new ArrayList<>();
        this.config = treasureIsland.getConfig();

        this.configFile = treasureIsland.getConfigFile();
        loadArenas();
    }

    public List<Arena> getArenas() {
        return this.arenaList;
    }

    /**
     * Load Arenas from config.yml to the List
     */

    public void loadArenas() {
        this.config.getConfigurationSection("arenas").getKeys(false).forEach(key -> {
            String name = config.getString(key + ".name");
            Location lobbyLocation = configFile.loadNewLocation(key + ".lobby-location");
            Location englandLocation = configFile.loadNewLocation(key + ".england");
            Location spainLocation = configFile.loadNewLocation(key + ".spain");
            Location piratesLocation = configFile.loadNewLocation(key + ".pirates");
            Location nativesLocation = configFile.loadNewLocation(key + ".natives");

            Location englandStashLocation = configFile.loadNewLocation(key + ".england-stash");
            Location spainStashLocation = configFile.loadNewLocation(key + ".spain-stash");
            Location piratesStashLocation = configFile.loadNewLocation(key + ".pirates-stash");
            Location nativesStashLocation = configFile.loadNewLocation(key + ".natives-stash");

            Arena arena = new Arena(name, lobbyLocation);

            arena.getEnglandTeam().setSpawnLocation(englandLocation);
            arena.getEnglandTeam().setStashLocation(englandStashLocation);

            arena.getSpainTeam().setSpawnLocation(spainLocation);
            arena.getSpainTeam().setStashLocation(spainStashLocation);

            arena.getPiratesTeam().setSpawnLocation(piratesLocation);
            arena.getPiratesTeam().setStashLocation(piratesStashLocation);

            arena.getNativesTeam().setStashLocation(nativesLocation);
            arena.getNativesTeam().setStashLocation(nativesStashLocation);

            this.arenaList.add(arena);
        });
    }

    public Arena findAvailableArena() {
        Optional<Arena> arenaOptional = this.arenaList.stream()
                .filter(arena -> arena.getGameState() == Arena.GameState.WAITING || arena.getGameState() == Arena.GameState.STARTING).findFirst();
        if (arenaOptional.get() != null) return arenaOptional.get();
        return null;
    }

    public boolean isPlayerInArena(TreasurePlayer treasurePlayer) {
        for (Arena arena : getArenas()) {
            TreasurePlayer player = arena.getPlayers().stream().filter(player1 -> treasurePlayer.equals(player1)).findFirst().get();
            if (player != null) return true;
        }
        return false;
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
