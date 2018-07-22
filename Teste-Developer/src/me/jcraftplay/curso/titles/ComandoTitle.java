package me.jcraftplay.curso.titles;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.eduard.api.lib.core.Mine;

public class ComandoTitle implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String lb, String[] args) {
		if (sender instanceof Player) {
			Player p = (Player) sender;
			
			if (p.hasPermission("player.title")) {
				Mine.sendTitle(p, "Bem Vindo ao servidor!", "Utilize /login <senha>", 20, 20, 20);
			}
		}
		// TODO Auto-generated method stub
		return false;
	}

}
