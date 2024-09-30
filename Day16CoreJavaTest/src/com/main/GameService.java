package com.main;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

public class GameService {
	public static List<Game> games;
	
	static {
		games = new ArrayList();
	}
	
	public GameService() {
		games.add(new Game("SnowBird", "Danny", 300f));
		games.add(new Game("FreshFood", "Ram", 450f));
		games.add(new Game("Batsman", "Kate", 400f));
		games.add(new Game("Pokiman", "Steeve", 600f));
		games.add(new Game("YammyTommy", "Narayan", 350f));
	}
	
	public List<Game> viewAll(){
		return games;
	}
	
	public String authorSearch(String author) {
		Optional<String> result = games.stream().filter(g -> g.getAuthorName().compareTo(author)==0).map(g -> g.getGameName()).findFirst();
		if(result.isPresent())
			return result.get();
		return "NOT FOUND";
	}
}
