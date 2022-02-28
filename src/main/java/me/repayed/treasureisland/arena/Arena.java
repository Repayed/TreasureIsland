package me.repayed.treasureisland.arena;

import me.repayed.treasureisland.player.TreasurePlayer;
import me.repayed.treasureisland.team.Team;
import me.repayed.treasureisland.team.TeamInfo;
import org.bukkit.Location;;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class Arena {

    enum GameState {
        WAITING, STARTING, LIVE, ENDED
    }

    private String arenaName;
    private Location lobbyLocation;

    private Team england = new Team(TeamInfo.ENGLAND);
    private Team spain = new Team(TeamInfo.SPAIN);
    private Team pirates = new Team(TeamInfo.PIRATES);
    private Team natives = new Team(TeamInfo.NATIVES);

    private GameState gameState;
    private Set<TreasurePlayer> players;

    public Arena(String arenaName, Location lobbyLocation) {
        this.arenaName = arenaName;
        this.lobbyLocation = lobbyLocation;
    }

    public String getArenaName() {
        return this.arenaName;
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
        return this.players;
    }

    public void assignTeam(TreasurePlayer treasurePlayer, Team team) {
        treasurePlayer.setTeam(team);
    }

    public void assignRandomTeam(TreasurePlayer treasurePlayer) {
        List<Team> teamList = Arrays.asList(england, spain, pirates, natives);
        Team assignedTeam = teamList.get(ThreadLocalRandom.current().nextInt(teamList.size()));
        treasurePlayer.setTeam(assignedTeam);
    }
}
