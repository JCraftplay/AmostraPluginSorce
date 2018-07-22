package me.jcraftplay.curso.comandos;

import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class ComandoLuzInteligente implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (sender instanceof Player) {
			Player p = (Player) sender;
			if (args.length == 0) {
				if (p.hasPermission("usar.luz")) {
				if (p.hasPotionEffect(PotionEffectType.NIGHT_VISION)) {
					p.removePotionEffect(PotionEffectType.NIGHT_VISION);
					p.sendMessage("Modo LUZ desativado!");
					p.getWorld().playSound(p.getLocation(), Sound.CLICK, 1, 1);
				} else {
					p.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 99999, 2));
					p.sendMessage("Modo LUZ ativado!");
					p.getWorld().playSound(p.getLocation(), Sound.CLICK, 1, 1);
				}
			} else {
				p.sendMessage("Voce nao tem permisao para utilizar o /luz !");
				p.getWorld().playSound(p.getLocation(), Sound.CLICK, 1, 1);
			}
			}
		}
		// TODO Auto-generated method stub
		return false;
	}

}
