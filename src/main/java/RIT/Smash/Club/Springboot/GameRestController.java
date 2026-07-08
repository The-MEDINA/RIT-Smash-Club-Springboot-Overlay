package RIT.Smash.Club.Springboot;

import org.springframework.web.bind.annotation.RestController;

@RestController
/**
 * REST api for hooking up frontend
 * should only be acted upon by HTTP requests and should only act upon a GameService
 * should not have any state, besides reference to the service, as required by REST 
 * GameRestController
 */
public class GameRestController {
    
}
