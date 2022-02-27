package me.repayed.treasureisland.team;

import org.bukkit.Location;
import org.bukkit.inventory.ItemStack;

public class Team {

    private TeamInfo teamInfo;

    private Location spawnLocation;
    private Location stashLocation;

    public Team(TeamInfo teamInfo, Location spawnLocation, Location stashLocation) {
        this.teamInfo = teamInfo;
        this.spawnLocation = spawnLocation;
        this.stashLocation = stashLocation;
    }
}
