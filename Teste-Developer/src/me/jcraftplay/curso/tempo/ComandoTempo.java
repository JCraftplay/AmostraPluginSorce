package me.jcraftplay.curso.tempo;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import me.jcraftplay.curso.Main;

public class ComandoTempo implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String lb, String[] args) {
		if (sender instanceof Player) {
			Player p = (Player) sender;
			if (p.hasPermission("usar.timer")) {
				// delay
				new Runnable() {
					public void run() {
						p.sendMessage("teste");
					}
				};
				Runnable teste = () -> {
					p.sendMessage("teste");

				};
				new BukkitRunnable() {

					@Override
					public void run() {
						p.sendMessage("delay concluido");
						
						// TODO Auto-generated method stub

					}
				}.runTaskLater(Main.main, 20*15);
			}
		}

		// TODO Auto-generated method stub
		return false;
	}

}
