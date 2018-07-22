package me.jcraftplay.curso.poo.caixamisteriosa;


import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import me.jcraftplay.curso.Main;
import net.eduard.api.lib.core.ConfigAPI;
import net.eduard.api.lib.core.Mine;
import net.eduard.api.lib.storage.Storable;
import net.eduard.api.lib.storage.StorageAPI;

public class CaixaMisteriosaAPI implements Storable {
	private static CaixaMisteriosaManager manager;
	private static ConfigAPI config = new ConfigAPI("Caixas.yml", Main.main);
	static {
		StorageAPI.register(CaixaMisteriosa.class);
		StorageAPI.register(CaixaMisteriosaAPI.class);
		StorageAPI.register(CaixaMisteriosaManager.class);
		
	}
	public static void reload() {
		if (config.contains("Caixas")) {
			manager = (CaixaMisteriosaManager) config.get("Caixas");
		} else {
			manager = new CaixaMisteriosaManager();
			CaixaMisteriosa basica = manager.CreateCaixa("Basica", Mine.newItem(Material.CHEST, "§bCaixa Basica"));
			CaixaMisteriosa avancada = manager.CreateCaixa("Avancada", Mine.newItem(Material.ENDER_CHEST, "§bCaixa Avancada"));
			basica.getPremios().add(Mine.newItem(Material.DIAMOND_SWORD, "Espada de Diamante"));
			basica.RegistrarPremio(new ItemStack(Material.IRON_BLOCK, 16));
			avancada.RegistrarPremio(new ItemStack(Material.DIAMOND_BLOCK, 16));
			avancada.RegistrarPremio(new ItemStack(Material.IRON_BLOCK, 16));
			avancada.RegistrarPremio(new ItemStack(Material.GOLD_BLOCK, 16));
			save();
			
		}
	}
	public static void save() {
		config.set("Caixas", manager);
		config.saveConfig();
	}
	
	public static CaixaMisteriosaManager getManager() {
		return manager;
	}

	public static void setManager(CaixaMisteriosaManager manager) {
		CaixaMisteriosaAPI.manager = manager;
	}

	public static ConfigAPI getConfig() {
		return config;
	}

	public static void setConfig(ConfigAPI config) {
		CaixaMisteriosaAPI.config = config;
	}

}
