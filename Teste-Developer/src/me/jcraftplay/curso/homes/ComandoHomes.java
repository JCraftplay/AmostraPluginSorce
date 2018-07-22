package me.jcraftplay.curso.homes;

import java.util.Set;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.jcraftplay.curso.Main;

public class ComandoHomes implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String lb, String[] args) {
		if (sender instanceof Player) {
			Player p = (Player) sender;
			if (p.hasPermission("ver.homes")) {
				p.sendMessage("§8● §7§m-------------------------§r §8●");
				Set<String> homes = Main.config.getSection("Homes."+p.getName()).getKeys(false);
		        sender.sendMessage("§aHomes disponiveis: " + homes);
		        p.sendMessage("§8● §7§m-------------------------§r §8●");
			}
		}
		return false;
	}
}
		        

