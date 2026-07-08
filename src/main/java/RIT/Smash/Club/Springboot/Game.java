package RIT.Smash.Club.Springboot;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
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
