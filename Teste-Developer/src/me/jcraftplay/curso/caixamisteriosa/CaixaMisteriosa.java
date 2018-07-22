package me.jcraftplay.curso.caixamisteriosa;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;

import me.jcraftplay.curso.Main;
import net.eduard.api.lib.core.Mine;

public class CaixaMisteriosa implements Listener {
	public static void abrircaixa(Player p) {
		Inventory inv = Bukkit.createInventory(null, 3*9, "Abrindo...");
		ArrayList<ItemStack> lista = new ArrayList<>();
		//Itens a serem sorteados!
		ItemStack i1 = new ItemStack(Material.IRON_BLOCK, 16);
		ItemStack i2 = new ItemStack(Material.IRON_BLOCK, 64);
		ItemStack i3 = new ItemStack(Material.DIAMOND_BLOCK, 16);
		ItemStack i4 = new ItemStack(Material.DIAMOND_BLOCK, 64);
		ItemStack i5 = new ItemStack(Material.BEACON, 1);
		ItemStack i6 = new ItemStack(Material.OBSIDIAN, 16);
		ItemStack i7 = new ItemStack(Material.OBSIDIAN, 32);
		ItemStack i8 = new ItemStack(Material.GOLDEN_APPLE, 1);
		ItemStack i9 = new ItemStack(Material.IRON_BLOCK, 16);
		ItemStack i10 = new ItemStack(Material.IRON_BLOCK, 16);
		/*
		 * Colocar mais itens aqui!
		 */
		//Vidros Coloridos!
		/*

		
		
		
		*/
		//
		lista.add(i1);  //
		lista.add(i2);  //
		lista.add(i3);  // Adicionar os itens!
		lista.add(i4);  // 
		lista.add(i5);  //
		lista.add(i6);  //
		lista.add(i7);  //
		lista.add(i8);  //
		lista.add(i9);  //
		lista.add(i10); //
		new BukkitRunnable() {
		int contador = 10;	
			@Override
			public void run() {
				contador --;
				for (int id = 0; id < 3*9; id++) {
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
		if (e.getInventory().getName().equals("Abrindo...")) {
			e.setCancelled(true);
		}
	}
}
