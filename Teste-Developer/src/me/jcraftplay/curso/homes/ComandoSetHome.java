package me.jcraftplay.curso.homes;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.jcraftplay.curso.Main;

public class ComandoSetHome implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String lb, String[] args) {
		if (sender instanceof Player) {
			Player p = (Player) sender;
			if (p.hasPermission("setar.home")) {
				if (args.length < 1) {
					p.sendMessage("Utilize: /sethome <nome>");
					p.sendMessage("Info: <nome> = Nome da Home!");
				} else {
					String nomedahome = args [0];
					Main.config.setLocation("Homes."+p.getName()+"."+nomedahome, p.getLocation());
					Main.config.saveConfig();
					p.sendMessage("§8● §7§m-------------------------§r §8●");
					p.sendMessage("§4A home "+ nomedahome +" §4foi setada com sucesso!");
					p.sendMessage("§8● §7§m-------------------------§r §8●");
				}
					
			}
			
		}
		// TODO Auto-generated method stub
		return false;
	}

}
