package me.jcraftplay.curso.entidades;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class ComandoEspawnarEntidades implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String lb, String[] args) {
		if (sender instanceof Player) {
			Player p = (Player) sender;
			if (p.hasPermission("sumonar.armorstand")) {
				ArmorStand sea = (ArmorStand) p.getWorld().spawnEntity(p.getLocation(), EntityType.ARMOR_STAND);
				sea.setCustomNameVisible(true);
				sea.setCustomName("Dev Jose Luiz");
				sea.setVisible(false);
			}
			if (p.hasPermission("sumonar.creeper")) {
				Creeper sec = (Creeper) p.getWorld().spawnEntity(p.getLocation(), EntityType.CREEPER);

			}
			if (p.hasPermission("sumonar.NPC")) {
				Entity senpc = p.getWorld().spawnEntity(p.getLocation(), EntityType.VILLAGER);
				senpc.setCustomNameVisible(true);
				senpc.setCustomName("NPC");

			}
			if (p.hasPermission("sumonar.blocoemqueda")) {
				p.getWorld().spawnFallingBlock(p.getLocation(), Material.ANVIL, (byte) 0);
			}
			if (p.hasPermission("sumonar.flechaquevoa")) {
				p.getWorld().spawnArrow(p.getLocation(), p.getLocation().getDirection(), 10, 10);
			}
		}
		// TODO Auto-generated method stub
		return false;
	}

}
