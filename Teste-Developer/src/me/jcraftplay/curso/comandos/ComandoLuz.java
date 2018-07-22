package me.jcraftplay.curso.comandos;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class ComandoLuz implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (sender instanceof Player) {
			Player p = (Player) sender;
			if (p.hasPermission("usar.luz")) {
				p.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 99999, 2));
			} else {
				p.sendMessage("Voce nao tem permisao para executar o comando /luz !");
			}
				
			}
		// TODO Auto-generated method stub
		return false;
	}

}
