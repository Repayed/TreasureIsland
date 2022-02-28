package me.repayed.treasureisland.team;

import org.bukkit.Location;

public class Team {

    private TeamInfo teamInfo;

    private Location spawnLocation;
    private Location stashLocation;

    public Team(TeamInfo teamInfo) {
        this.teamInfo = teamInfo;
    }

    public Location getSpawnLocation() {
        return this.spawnLocation;
    }

    public void setSpawnLocation(Location spawnLocation) {
        this.spawnLocation = spawnLocation;
    }

    public Location getStashLocation() {
        return stashLocation;
    }

    public void setStashLocation(Location location) {
        this.stashLocation = location;
    }


}
