package me.jcraftplay.curso.tempo;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import me.jcraftplay.curso.Main;

public class ComandoTimer implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String lb, String[] args) {
		if (sender instanceof Player) {
			Player p = (Player) sender;
			if (p.hasPermission("usar.timer")) {
				new BukkitRunnable() {
					int limite = 10;
					@Override
					public void run() {
						limite--;
						p.sendMessage("timmer pronto");
						if (limite == 0) {
							cancel();
						}
						// TODO Auto-generated method stub
						
					}
				}.runTaskTimer(Main.main, 20*5, 20*10);
			}
			
		}
		// TODO Auto-generated method stub
		return false;
	}

}
