package me.repayed.treasureisland;

import me.repayed.treasureisland.data.ConfigFile;
import org.bukkit.plugin.java.JavaPlugin;

public final class TreasureIsland extends JavaPlugin {

    private ConfigFile configFile;

    @Override
    public void onEnable() {
        this.configFile = new ConfigFile(this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public ConfigFile getConfigFile() {
        return this.configFile;
    }
}
