package me.repayed.treasureisland;

import me.repayed.treasureisland.arena.ArenaHandler;
import me.repayed.treasureisland.data.ConfigFile;
import org.bukkit.plugin.java.JavaPlugin;

public final class TreasureIsland extends JavaPlugin {

    private ConfigFile configFile;
    private ArenaHandler arenaHandler;

    @Override
    public void onEnable() {
        this.configFile = new ConfigFile(this);
        this.arenaHandler = new ArenaHandler(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public ConfigFile getConfigFile() {
        return this.configFile;
    }

    public ArenaHandler getArenaHandler() {
        return this.arenaHandler;
    }
}
