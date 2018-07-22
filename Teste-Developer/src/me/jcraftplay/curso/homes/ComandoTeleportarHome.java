package me.jcraftplay.curso.homes;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.jcraftplay.curso.Main;

public class ComandoTeleportarHome implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String lb, String[] args) {
		if (sender instanceof Player) {
			Player p =(Player) sender;
			if (args.length ==0) {
			p.sendMessage("§8● §7§m--------------------------------------------------------------------------------§r §8●");
			p.sendMessage("§c&lMyHome §8> §7%Utilize /home <nomedahome");
			p.sendMessage("§c&lMyHome §8> §7%Para saber todas as suas homes e ter um teleporte mais facil utilize: /homes");
			p.sendMessage("§8● §7§m--------------------------------------------------------------------------------§r §8●");
			} else {
				String nomedahome = args [0];
				p.teleport(Main.config.getLocation("Homes."+p.getName()+"."+nomedahome));
				p.sendMessage("§8● §7§m--------------------------------------§r §8●");
				p.sendMessage("§c&lMyHome §8> §7%Voce foi teleportado com sucesso!");
				p.sendMessage("§8● §7§m--------------------------------------§r §8●");
			}
			
		}
		// TODO Auto-generated method stub
		return false;
	}

}
