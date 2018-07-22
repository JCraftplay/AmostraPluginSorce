package me.jcraftplay.curso;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.weather.WeatherChangeEvent;
import org.bukkit.inventory.ItemStack;

import me.jcraftplay.curso.scoreboard.ScoreDEV;

public class Eventos implements Listener {
	
	
	@EventHandler
	public void join(PlayerJoinEvent e) {
		e.setJoinMessage("O Jogador " + e.getPlayer().getName() + " Entrou no Servidor!");
		ScoreDEV.setscore(e.getPlayer());
	}

	@EventHandler
	public void left(PlayerQuitEvent e) {
		e.setQuitMessage("O Jogador " + e.getPlayer().getName() + "Saiu do Servidor!");
	}

	@EventHandler
	public void asy(AsyncPlayerChatEvent e) {
		e.setFormat("" + e.getPlayer().getName() + " §4" + e.getMessage());
	}

	@EventHandler
	public void evento(BlockPlaceEvent e) {
		if (e.getPlayer().hasPermission("colocar.bloco")) {

			e.setCancelled(false);
		} else {
			e.setCancelled(true);
		}
	}
	
	@EventHandler
	public void evento(BlockBreakEvent e) {
		e.setExpToDrop(10);
	}
	
	@EventHandler
	public void evento(WeatherChangeEvent e) {
	if (e.toWeatherState()==true) {
		e.setCancelled(true);
	}
	
	
	}
	
	@EventHandler
	public void fome(FoodLevelChangeEvent e) {
		e.setCancelled(true);
	}
	
	@EventHandler
	public void eventodano(EntityDamageEvent e) {
		Player p = (Player) e.getEntity();
		if (p.getWorld().equals("world")) {
		
		e.setCancelled(true);
		}
	}
	
	@EventHandler
	public void test(AsyncPlayerChatEvent e) {
		Player p = e.getPlayer();
		if (e.getMessage().contains("puta")) {
			e.setCancelled(true);
			p.kickPlayer("Nao utilize palavras ofensivas!");
			
		}
		if (e.getMessage().contains("cu")) {
			e.setCancelled(true); 
			p.kickPlayer("Nao utilize palavras ofensivas!");
	}
		if (e.getMessage().contains("desgraca")) {
			e.setCancelled(true);
			p.kickPlayer("Nao utilize palavras ofensivas!");
	}
		if (e.getMessage().contains("merda")) {
			e.setCancelled(true);
			p.kickPlayer("Nao utilize palavras ofensivas!");
	}
	}
	
}

// TODO Auto-generated method stub
