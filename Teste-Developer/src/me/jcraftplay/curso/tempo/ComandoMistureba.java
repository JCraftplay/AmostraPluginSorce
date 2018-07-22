package me.jcraftplay.curso.tempo;

import java.util.ArrayList;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import me.jcraftplay.curso.Main;

public class ComandoMistureba implements CommandExecutor {
	public static ArrayList<Player> jogadores = new ArrayList<>();

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String lb, String[] args) {
		if (sender instanceof Player) {
			Player p = (Player) sender;
			if (p.hasPermission("usar.mistureba")) {
				new Runnable() {
					public void run() {

					}
				};
				p.sendMessage("Entrou no codal");
				jogadores.add(p);

				new BukkitRunnable() {

					@Override
					public void run() {
						p.sendMessage("saiu do codal");
						jogadores.remove(p);
						// TODO Auto-generated method stub

					}
				}.runTaskLater(Main.main, 80);

			}
			
		}
		return false;
	}

}
