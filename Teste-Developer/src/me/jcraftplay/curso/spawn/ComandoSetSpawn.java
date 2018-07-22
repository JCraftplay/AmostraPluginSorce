package me.jcraftplay.curso.spawn;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.jcraftplay.curso.Main;

public class ComandoSetSpawn implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (sender instanceof Player) {
			Player player = (Player) sender;
			Main.config.setLocation("Spawn", player.getLocation());
			Main.config.saveConfig();
			player.sendMessage("=========================");
			player.sendMessage("Spawn setado com sucesso!");
			player.sendMessage("=========================");

		}

		// TODO Auto-generated method stub
		return false;
	}

}
