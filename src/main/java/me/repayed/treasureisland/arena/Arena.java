package me.repayed.treasureisland.arena;

import me.repayed.treasureisland.player.TreasurePlayer;
import me.repayed.treasureisland.team.Team;
import org.bukkit.Location;;

import java.util.Set;

public class Arena {

    enum GameState {
        WAITING, STARTING, LIVE, ENDED
    }

    private String arenaName;
    private Location lobbyLocation;

    private Team england;
    private Team spain;
    private Team pirates;
    private Team natives;

    private GameState gameState;
    private Set<TreasurePlayer> playerSet;

    public Arena(String arenaName, Location lobbyLocation) {
        this.arenaName = arenaName;
        this.lobbyLocation = lobbyLocation;
    }

    public GameState getGameState() {
        return gameState;
    }

    private Location getLobbyLocation() {
        return lobbyLocation;
    }

    public Team getEnglandTeam() {
        return this.england;
    }

    public Team getSpainTeam() {
        return spain;
    }

    public Team getPiratesTeam() {
        return this.pirates;
    }

    public Team getNativesTeam() {
        return natives;
    }

    public Set<TreasurePlayer> getPlayers() {
        return this.playerSet;
    }
}
