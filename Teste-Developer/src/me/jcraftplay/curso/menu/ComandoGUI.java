package me.jcraftplay.curso.menu;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ComandoGUI implements CommandExecutor
{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String lb, String[] args) {
		if(sender instanceof Player) {
			Player p = (Player) sender;
			Menu.abrirmenu(p);
			

		}
		// TODO Auto-generated method stub
		return false;
	}

}
