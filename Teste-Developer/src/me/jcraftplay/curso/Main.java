package me.jcraftplay.curso;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import me.jcraftplay.curso.caixamisteriosa.CaixaMisteriosa;
import me.jcraftplay.curso.caixamisteriosa.ComandoCaixaMisteriosa;
import me.jcraftplay.curso.comandos.ComandoBan;
import me.jcraftplay.curso.comandos.ComandoFly;
import me.jcraftplay.curso.comandos.ComandoGamemode;
import me.jcraftplay.curso.comandos.ComandoLuz;
import me.jcraftplay.curso.comandos.ComandoLuzInteligente;
import me.jcraftplay.curso.comandos.ComandoTirarLuz;
import me.jcraftplay.curso.entidades.ComandoEspawnarEntidades;
import me.jcraftplay.curso.homes.ComandoDeletarHome;
import me.jcraftplay.curso.homes.ComandoHomes;
import me.jcraftplay.curso.homes.ComandoSetHome;
import me.jcraftplay.curso.homes.ComandoTeleportarHome;
import me.jcraftplay.curso.menu.ComandoGUI;
import me.jcraftplay.curso.menu.Menu;
import me.jcraftplay.curso.poo.caixamisteriosa.CaixaMisteriosaAPI;
import me.jcraftplay.curso.poo.caixamisteriosa.CaixaMisteriosaComando;
import me.jcraftplay.curso.poo.caixamisteriosa.CaixaMisteriosaListener;
import me.jcraftplay.curso.spawn.ComandoSetSpawn;
import me.jcraftplay.curso.spawn.ComandoSpawn;
import me.jcraftplay.curso.tempo.ComandoMistureba;
import me.jcraftplay.curso.tempo.ComandoTempo;
import me.jcraftplay.curso.tempo.ComandoTimer;
import me.jcraftplay.curso.titles.ComandoTitle;
import me.jcraftplay.curso.warps.ComandoDeleteWarp;
import me.jcraftplay.curso.warps.ComandoSetWarp;
import me.jcraftplay.curso.warps.ComandoWarp;
import me.jcraftplay.curso.warps.ComandoWarps;
import net.eduard.api.lib.Configs;

public class Main extends JavaPlugin {
	public static Main main;
	public static Configs config;
	public void onEnable() {
		main = this;
		config=new Configs("configuracao.yml", this);
		config.saveConfig();
		Bukkit.getConsoleSender().sendMessage("Bem Vindo ao Sevidor!");
		getCommand("fly").setExecutor(new ComandoFly());
		getCommand("gm").setExecutor(new ComandoGamemode());
		Bukkit.getPluginManager().registerEvents(new Eventos(), this);
		getCommand("setspawn").setExecutor(new ComandoSetSpawn());
		getCommand("spawn").setExecutor(new ComandoSpawn());
		getCommand("aluz").setExecutor(new ComandoLuz());
		getCommand("tluz").setExecutor(new ComandoTirarLuz());
		getCommand("luz").setExecutor(new ComandoLuzInteligente());
		getCommand("eban").setExecutor(new ComandoBan());
		getCommand("setwarp").setExecutor(new ComandoSetWarp());
		getCommand("warp").setExecutor(new ComandoWarp());
		getCommand("delwarp").setExecutor(new ComandoDeleteWarp());
		getCommand("warps").setExecutor(new ComandoWarps());
		getCommand("gui").setExecutor(new ComandoGUI());
		Bukkit.getPluginManager().registerEvents(new Menu(), this);
		getCommand("sumonar").setExecutor(new ComandoEspawnarEntidades());
		getCommand("delay").setExecutor(new ComandoTempo());
		getCommand("temporizador").setExecutor(new ComandoTimer());
		getCommand("mistureba").setExecutor(new ComandoMistureba());
		getCommand("darcaixa").setExecutor(new ComandoCaixaMisteriosa());
		Bukkit.getPluginManager().registerEvents(new CaixaMisteriosa(), this);
		getCommand("ola").setExecutor(new ComandoTitle());
		getCommand("homes").setExecutor(new ComandoHomes());
		getCommand("sethome").setExecutor(new ComandoSetHome());
		getCommand("home").setExecutor(new ComandoTeleportarHome());
		getCommand("delhome").setExecutor(new ComandoDeletarHome());
		CaixaMisteriosaAPI.reload();
		getCommand("darcaixa").setExecutor(new CaixaMisteriosaComando());
		Bukkit.getPluginManager().registerEvents(new CaixaMisteriosaListener(), this);
	}
}
