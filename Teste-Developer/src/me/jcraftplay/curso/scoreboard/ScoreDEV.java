package me.jcraftplay.curso.scoreboard;

import java.util.HashMap;

import org.bukkit.entity.Player;

import net.eduard.api.lib.game.DisplayBoard;

public class ScoreDEV {
	public static HashMap<Player, DisplayBoard> scores = new HashMap<>();
	public static void setscore(Player p) {
		DisplayBoard score = new DisplayBoard();
		score.setDisplay("Servidor");
		score.getLines().add("§4Lobby");
		score.getLines().add("");
		score.getLines().add("Player:" + p.getName());
		score.getLines().add("Money:");
		score.getLines().add("Cash:");
		score.getLines().add("Cargo:");
		score.getLines().add("");
		score.clear();
		score.setTitle("Servidor");
		score.update();
		
		
		score.apply(p);
		p.setScoreboard(score.getScore());
	}

}
