package me.jcraftplay.curso.homes;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.jcraftplay.curso.Main;

public class ComandoDeletarHome implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String lb, String[] args) {
		if (sender instanceof Player) {
			Player p =(Player) sender;
			if (args.length ==0) {
		 p.sendMessage("§c&lMyHome §8> §7%Utilize /delwarp <nome>");
			} else {
				String nomedahome = args [0];
				Main.config.getLocation(nomedahome);
				Main.config.remove("Homes."+p.getName()+"."+nomedahome);;
				p.sendMessage("§c&lMyHome §8> §7%Home deletada com sucesso");
			}
		}
		// TODO Auto-generated method stub
		return false;
	}

}