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
}
