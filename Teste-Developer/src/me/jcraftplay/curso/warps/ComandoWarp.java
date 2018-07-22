package me.jcraftplay.curso.warps;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.jcraftplay.curso.Main;

public class ComandoWarp implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String lb, String[] args) {
		if (sender instanceof Player) {
			Player p =(Player) sender;
			if (args.length ==0) {
			p.sendMessage("§8● §7§m--------------------------------------------------------------------------------§r §8●");
			p.sendMessage("§c&lWarps §8> §7%Utilize /warp <nomedawarp>");
			p.sendMessage("§c&lWarps §8> §7%Para saber todas as warps e ter um teleporte mais facil utilize: /warps");
			p.sendMessage("§8● §7§m--------------------------------------------------------------------------------§r §8●");
			} else {
				String nomedawarp = args [0];
				p.teleport(Main.config.getLocation("Warps."+nomedawarp));
				p.sendMessage("§8● §7§m--------------------------------------§r §8●");
				p.sendMessage("§c&lWarps §8> §7%Voce foi teleportado com sucesso!");
				p.sendMessage("§8● §7§m--------------------------------------§r §8●");
			}
			
		}
		// TODO Auto-generated method stub
		return false;
	}

}
