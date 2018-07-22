package me.jcraftplay.curso.menu;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Menu implements Listener {
	public static void abrirmenu(Player p) {
		Inventory inv = Bukkit.createInventory(null, 5 * 9, "Menu");
		ItemStack iten = new ItemStack(Material.GOLDEN_APPLE);
		ItemStack vidro = new ItemStack(Material.STAINED_GLASS_PANE, 1, DyeColor.LIGHT_BLUE.getData());
		ItemMeta metavidro = vidro.getItemMeta();
		metavidro.setDisplayName("");
		metavidro.setLore(Arrays.asList(""));
		ItemMeta metaiten = iten.getItemMeta();
		metaiten.setLore(Arrays.asList("Tag YT","Requisitos!"));
		iten.setItemMeta(metaiten);
		vidro.setItemMeta(metavidro);
		
		
		inv.setItem(22, iten);
		inv.setItem(0, vidro);
		inv.setItem(1, vidro);
		inv.setItem(2, vidro);
		inv.setItem(3, vidro);
		inv.setItem(4, vidro);
		inv.setItem(5, vidro);
		inv.setItem(6, vidro);
		inv.setItem(7, vidro);
		inv.setItem(8, vidro);
		inv.setItem(9, vidro);
		inv.setItem(10, vidro);
		inv.setItem(11, vidro);
		inv.setItem(12, vidro);
		inv.setItem(13, vidro);
		inv.setItem(14, vidro);
		inv.setItem(15, vidro);
		inv.setItem(16, vidro);
		inv.setItem(17, vidro);
		inv.setItem(27, vidro);
		inv.setItem(28, vidro);
		inv.setItem(29, vidro);
		inv.setItem(30, vidro);
		inv.setItem(31, vidro);
		inv.setItem(32, vidro);
		inv.setItem(33, vidro);
		inv.setItem(34, vidro);
		inv.setItem(35, vidro);
		inv.setItem(36, vidro);
		inv.setItem(37, vidro);
		inv.setItem(38, vidro);
		inv.setItem(39, vidro);
		inv.setItem(40, vidro);
		inv.setItem(41, vidro);
		inv.setItem(42, vidro);
		inv.setItem(43, vidro);
		inv.setItem(44, vidro);
		p.openInventory(inv);

	}

	@EventHandler
	public void join(InventoryClickEvent e) {
		if (e.getInventory().getName().equals("Menu")) {
			e.setCancelled(true);
			if (e.getRawSlot() == 22) {
				HumanEntity p = e.getWhoClicked();
				p.sendMessage("Tenha 10.000 subs para se tornar um YT");

			}
		}
	}

	@EventHandler
	public void Click(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		if (p.hasPermission("usar.gui")) {
			if (p.getItemInHand().getType() == Material.COMPASS) {
				p.sendMessage("Menu aberto com sucesso!");
				abrirmenu(p);
		}

	}

}
}
