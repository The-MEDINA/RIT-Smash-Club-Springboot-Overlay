package RIT.Smash.Club.Springboot;

import java.util.List;

import lombok.Data;

@Data
/**
 * class representing a set of games
 * holds the games and allows for modification of games
 * should only be acted upon by the game service.
 * GameSet
 */
public class GameSet {
    private List<Game> record;

    public Game getGameInfo(int gameNum) {
        return record.get(gameNum);
    }

}
