package RIT.Smash.Club.Springboot;

import lombok.Data;

@Data
/**
 * class representing a game
 * should be contained only within a GameSet
 * Game
 */
public class Game {
    private String playerOneTag;
    private String playerTwoTag;
    private String charOne;
    private String charTwo;
    private String winner;

}
