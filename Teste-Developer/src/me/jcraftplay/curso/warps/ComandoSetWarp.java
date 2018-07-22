package me.jcraftplay.curso.warps;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.jcraftplay.curso.Main;

public class ComandoSetWarp implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String lb, String[] args) {
		if (sender instanceof Player) {
			Player p =(Player) sender;
			if (args.length ==0) {
				p.sendMessage("§c&lWarps §8> §7%Utilize /setwarp <nome>");
			} else {
				String nomedawarp = args [0];
				Main.config.setLocation("Warps."+nomedawarp, p.getLocation());
				Main.config.saveConfig();
				p.sendMessage("§8● §7§m-------------------------§r §8●");
				p.sendMessage("§4A warp "+ nomedawarp +" §4foi setada com sucesso!");
				p.sendMessage("§8● §7§m-------------------------§r §8●");
			}
					
			
			
		}
		// TODO Auto-generated method stub
		return false;
	}


}
