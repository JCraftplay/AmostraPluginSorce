package me.jcraftplay.curso.poo.caixamisteriosa;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ComandoHelpCaixaMisteriosa implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender s, Command cmd, String lb, String[] args) {
		if (s instanceof Player) {
			
			Player p = (Player) s;
			if (args.length == 0) {
				p.sendMessage("Em Breve");
				
			}
			if (args.length == 1) {
				String sub = args[1];
				if (sub.equalsIgnoreCase("lista")) {
					p.sendMessage("Lista de Caixas disponiveis: ");
				//	CaixaMisteriosa caixa = CaixaMisteriosaAPI.getManager().g);
					p.sendMessage("Em Breve");
				}
			}
		}
		// TODO Auto-generated method stub
		return false;
	}

}
