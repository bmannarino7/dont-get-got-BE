package io.DontGetGot.DontGetGot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@SpringBootApplication
@RestController
public class DontGetGotApplication {

	public static void main(String[] args) {
		SpringApplication.run(DontGetGotApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

	@GetMapping("/api/wallet/{playerId}")
	@ResponseBody
	public String player(@PathVariable Map<String, String> pathVarsMap) {
		
		String playerId = pathVarsMap.get("playerId");
		
		// missions.put("1", "Sit on the floor for a while, then get a player to help you up.");
		// missions.put("2", "Put a bandage on your body and get a player to comment on it (without being prompted).");

		Mission mission = new Mission("1", "Sit on the floor for a while, then get a player to help you up.");

		return mission.getMissionText();
	}
}

//
// Missions	
// 
// Sit on the floor for a while, then get a player to help you up. 
// Put a bandage on your body and get a player to comment on it (without being prompted). 
// Get a player to argue with you about which way north is. 
// Point and get a player to look somewhere three time sin one day. 
// Get a player to make you a hot drink, then show them this card. (You must ask them, they can’t offer). 
// Start talking in rhymes. If another player starts doing the same, show them this card. 
// Get a player to say “I love you.”
// Convince a player that something is voice-activated (when it isn’t) and get them to try it out. 
// Get a player to repeat themselves three times. 
// Get a player to fix something for you. 
// Say you feel itchy and start scratching your body in front of another player. Get them to scratch themselves. 
// Make up a word and get a player to ask what it means. 
//