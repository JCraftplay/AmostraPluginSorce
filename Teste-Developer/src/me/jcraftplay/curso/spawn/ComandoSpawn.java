package me.jcraftplay.curso.spawn;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.jcraftplay.curso.Main;

public class ComandoSpawn implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (sender instanceof Player) {
			Player p = (Player) sender;
			if (Main.config.contains("Spawn")) {
				p.teleport(Main.config.getLocation("Spawn"));
				p.sendMessage("==============================================");
				p.sendMessage(" Voce foi teleportado para o Spawn com sucesso!");
				p.sendMessage("==============================================");
			}
			
			
		}
		// TODO Auto-generated method stub
		return false;
	}


}
