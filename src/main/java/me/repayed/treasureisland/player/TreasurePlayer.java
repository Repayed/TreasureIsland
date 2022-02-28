package me.repayed.treasureisland.player;

import me.repayed.treasureisland.team.Team;

import java.util.UUID;

public class TreasurePlayer {

    enum Status {
        ALIVE, RESPAWNING
    }

    private final UUID uuid;
    private Team team;

    private Status status;

    public TreasurePlayer(UUID uuid, Team team) {
        this.uuid = uuid;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    @Override
    public boolean equals(Object other) {
        if(other == null) return false;

        if(this.getClass() != other.getClass()) return false;

        TreasurePlayer otherPlayer = (TreasurePlayer) other;
        return this.uuid.equals(otherPlayer.getUuid());
    }


}
