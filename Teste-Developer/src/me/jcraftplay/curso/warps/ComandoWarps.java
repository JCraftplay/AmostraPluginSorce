package me.jcraftplay.curso.warps;

import java.util.Set;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.jcraftplay.curso.Main;

public class ComandoWarps implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String lb, String[] args) {
		if (args.length == 0) {
			Player p =(Player) sender;
			p.sendMessage("§8● §7§m-------------------------§r §8●");
			Set<String> warps = Main.config.getSection("Warps").getKeys(false);
	        sender.sendMessage("§aWarps disponiveis: " + warps);
	        p.sendMessage("§8● §7§m-------------------------§r §8●");
		}
		// TODO Auto-generated method stub
		return false;
	}
	

}
