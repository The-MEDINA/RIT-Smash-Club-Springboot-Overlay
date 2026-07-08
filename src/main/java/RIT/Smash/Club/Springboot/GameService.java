package RIT.Smash.Club.Springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {
    /**
     * this is our backend api
     * any request that works upon data should pass through this
     * depending on data persistance this may or may not hold the data
     * should only be invoked by the controller and should only act upon GameSets
     */
    @Autowired
    private List<GameSet> sets;
}
