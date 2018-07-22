package me.jcraftplay.curso.comandos;

import org.bukkit.BanList;
import org.bukkit.BanList.Type;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ComandoBan implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String lb, String[] args) {
		if (args.length <2) {
			Player target = Bukkit.getPlayer(args[0]);
			if (target == null) {
				sender.sendMessage("Para banir utilize um player valido!");
			} else {
				StringBuilder builder = new StringBuilder();
	            for (int i = 1; i < args.length; i++) {
	                builder.append(args[i] + " ");
	            }
				BanList lista = Bukkit.getBanList(Type.NAME);
				lista.addBan(target.getName(), null, null, null);
				target.kickPlayer("Voce foi banido de nosso servidor!\n \n Tempo: PERMANENTEMENTE! \n Ban injusto? Entre em nosso site \n Site: EM BREVE");
			}

		}

		// TODO Auto-generated method stub
		return false;
	}

}
