package me.jcraftplay.curso.poo.caixamisteriosa;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;

import me.jcraftplay.curso.Main;
import net.eduard.api.lib.core.Mine;

public class CaixaMisteriosaListener implements Listener {
	public static void abrircaixa(Player p, CaixaMisteriosa caixa) {
		Inventory inv = Bukkit.createInventory(null, 3 * 9, "Abrindo Caixa" + caixa.getNome());
		/*
		 * 
		 */
		List<ItemStack> lista = caixa.getPremios();
		new BukkitRunnable() {
			int contador = 10;

			@Override
			public void run() {
				contador--;
				for (int id = 0; id < 3 * 9; id++) {
					inv.setItem(id, new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) Mine.randomInt(1, 14)));
				}
				inv.setItem(Mine.getPosition(2, 5), Mine.getRandomItem(lista));
				if (contador == 0) {
					cancel();
					p.getInventory().addItem(inv.getItem(Mine.getPosition(2, 5)));
					p.closeInventory();

				}
				// TODO Auto-generated method stub

			}

		}.runTaskTimer(Main.main, 10, 10);

		// Fim da Lista... by: Jose Luiz A C Franco
		p.openInventory(inv);
	}

	@EventHandler
	public void cancelar(InventoryClickEvent e) {
		if (e.getInventory().getName().startsWith("Abrindo Caixa")) {
			e.setCancelled(true);
		}
	}

	@EventHandler
    	public void abrir(PlayerInteractEvent e) {
    		for (CaixaMisteriosa caixa:CaixaMisteriosaAPI.getManager().getLista()) {
    			if (caixa.getCaixa().isSimilar(e.getPlayer().getItemInHand())) {
    				e.setCancelled(true);
    				Player p = e.getPlayer();
    				abrircaixa(p, caixa);
    				ItemStack c = caixa.getCaixa().clone();
    				Mine.remove(p.getInventory(), c, 1);
    			}
    				
    		}
    	}
	

}
