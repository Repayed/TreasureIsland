package me.repayed.treasureisland.arena;

import me.repayed.treasureisland.player.TreasurePlayer;
import me.repayed.treasureisland.team.Team;;

import java.util.Set;

public class Arena {

    enum GameState {
        WAITING, STARTING, LIVE, ENDED
    }

    private int arenaName;

    private Team england;
    private Team spain;
    private Team pirates;
    private Team natives;

    private GameState gameState;
    private Set<TreasurePlayer> playerSet;
}
