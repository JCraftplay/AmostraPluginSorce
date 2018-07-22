package me.jcraftplay.curso.comandos;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ComandoFly implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (sender instanceof Player) {
			Player p = (Player) sender;
			if (p.getAllowFlight() == true) {
				p.setAllowFlight(false);
				p.sendMessage("§4Voce desativou o modo de voo");
			} else {
				p.setAllowFlight(true);
				p.sendMessage("§4Voce ativou o modo de voo");
			}

		}
		// TODO Auto-generated method stub
		return false;
	}

}
