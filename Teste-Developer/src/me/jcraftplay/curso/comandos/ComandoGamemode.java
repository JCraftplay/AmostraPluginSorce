package me.jcraftplay.curso.comandos;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ComandoGamemode implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (sender instanceof Player) {
			Player p = (Player) sender;
			if (args.length == 0) {
				if (p.getGameMode() == GameMode.SURVIVAL) {
					p.setGameMode(GameMode.CREATIVE);
					p.sendMessage("§4Seu modo de jogo foi alterado com sucesso!");
				} else {
					p.setGameMode(GameMode.SURVIVAL);
					p.sendMessage("§4Seu modo de jogo foi alterado com sucesso!");
				}
			} else if (args.length == 1) {
				String sub = args[0];
				if (sub.equalsIgnoreCase("1")) {
					p.setGameMode(GameMode.CREATIVE);
					p.sendMessage("§4Voce entrou no modo §1CRIATIVO");
				} else if (sub.equalsIgnoreCase("0")) {
					p.setGameMode(GameMode.SURVIVAL);
					p.sendMessage("§4Voce entrou no modo §2SOBREVIVENCIA");
				} else if (sub.equalsIgnoreCase("2")) {
					p.setGameMode(GameMode.ADVENTURE);
					p.sendMessage("§4Voce entrou no modo AVENTURA");
				} else if (sub.equalsIgnoreCase("3")) {
					p.setGameMode(GameMode.SPECTATOR);
					p.sendMessage("§7Voce entrou no modo ESPECTADOR");
				}
			} else if (args.length == 2) {
				Player jogador = Bukkit.getPlayer(args[1]);
				if (jogador == null){
					p.sendMessage("§4O Jogardor esta OfLine, insira um player OnLine!");
					return true;
				}
				String sub = args[0];
				if (sub.equalsIgnoreCase("1")) {
					jogador.setGameMode(GameMode.CREATIVE);
					jogador.sendMessage("§4Voce entrou no modo §1CRIATIVO");
					p.sendMessage("Voce alterou o modo de jogo do "+jogador.getName());
				} else if (sub.equalsIgnoreCase("0")) {
					jogador.setGameMode(GameMode.SURVIVAL);
					jogador.sendMessage("§4Voce entrou no modo §2SOBREVIVENCIA");
					p.sendMessage("Voce alterou o modo de jogo do "+jogador.getName());
				} else if (sub.equalsIgnoreCase("2")) {
					jogador.setGameMode(GameMode.ADVENTURE);
					jogador.sendMessage("§4Voce entrou no modo AVENTURA");
					p.sendMessage("Voce alterou o modo de jogo do "+jogador.getName());
				} else if (sub.equalsIgnoreCase("3")) {
					jogador.setGameMode(GameMode.SPECTATOR);
					jogador.sendMessage("§7Voce entrou no modo ESPECTADOR");
					p.sendMessage("Voce alterou o modo de jogo do "+jogador.getName());
				}
			}
		}
		// TODO Auto-generated method stub
		return false;
	}

}
