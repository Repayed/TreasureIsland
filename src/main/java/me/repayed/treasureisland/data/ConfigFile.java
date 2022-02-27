package me.repayed.treasureisland.data;

import me.repayed.treasureisland.TreasureIsland;
import me.repayed.treasureisland.util.Chat;
import org.bukkit.Location;
import org.bukkit.configuration.file.FileConfiguration;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.bukkit.Bukkit.*;

public class ConfigFile {

    private final FileConfiguration config;

    public ConfigFile(final TreasureIsland treasureIsland) {
        this.config = treasureIsland.getConfig();
    }

    public Location loadNewLocation(String path) {
        final String locationWorld = this.config.getString(path + ".world");
        final double xLocation = this.config.getDouble(path + ".x");
        final double yLocation = this.config.getDouble(path + ".y");
        final double zLocation = this.config.getDouble(path + ".z");
        final float yaw = (float) this.config.getDouble(path + ".yaw");
        final float pitch = (float) this.config.getDouble(path + ".pitch");

        Optional<String> locationWorldName = Optional.ofNullable(locationWorld);
        return locationWorldName.map(s -> new Location(getWorld(s), xLocation, yLocation, zLocation, yaw, pitch)).orElse(null);
    }

    public String getConfigStringMessage(String path) {
        final String prefix = Chat.format(config.getString("messages.prefix"));
        final String formattedMessage = Chat.format(config.getString(path)).replace("%prefix%", prefix);
        return formattedMessage;
    }

    public List<String> getConfigStringList(String path) {
        List<String> stringList = config.getStringList(path);
        stringList.forEach(Chat::format);
        return stringList;
    }
}

