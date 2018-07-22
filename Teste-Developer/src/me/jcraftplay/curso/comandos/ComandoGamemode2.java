package me.jcraftplay.curso.comandos;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ComandoGamemode2 implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (sender instanceof Player) {
			Player p = (Player) sender;
			if (args.length == 0) {
				if (p.getGameMode() == GameMode.SURVIVAL) {
					p.setGameMode(GameMode.CREATIVE);
					p.sendMessage("=================================================================="
							+ "Gamemode Inteligente by: Jose Luiz"
							+ "§4Seu modo de jogo foi alterado com sucesso!"
							+ "==================================================================");
				} else {
					p.setGameMode(GameMode.SURVIVAL);
					p.sendMessage("=================================================================="
							+ "Gamemode Inteligente by: Jose Luiz"
							+ "§4Seu modo de jogo foi alterado com sucesso!"
							+ "==================================================================");
				}
			} else if (args.length == 1) {
				String sub = args[0];
				if (sub.equalsIgnoreCase("1")) {
					p.setGameMode(GameMode.CREATIVE);
					p.sendMessage("=================================================================="
							+ "Gamemode Inteligente by: Jose Luiz"
							+ "§4Voce entrou com sucesso no modo §lCriativo!"
							+ "==================================================================");
				} else if (sub.equalsIgnoreCase("0")) {
					p.setGameMode(GameMode.SURVIVAL);
					p.sendMessage("=================================================================="
							+ "Gamemode Inteligente by: Jose Luiz"
							+ "§4Voce entrou com sucesso no modo §lSobrevivencia!"
							+ "==================================================================");
				} else if (sub.equalsIgnoreCase("2")) {
					p.setGameMode(GameMode.ADVENTURE);
					p.sendMessage("=================================================================="
							+ "Gamemode Inteligente by: Jose Luiz"
							+ "§4Voce entrou com sucesso no modo §lAventura!"
							+ "==================================================================");
				} else if (sub.equalsIgnoreCase("3")) {
					p.setGameMode(GameMode.SPECTATOR);
					p.sendMessage("=================================================================="
							+ "Gamemode Inteligente by: Jose Luiz"
							+ "§4Voce entrou com sucesso no modo §lEspectador"
							+ "==================================================================");
				}
			} else if (args.length == 2) {
				Player jogador = Bukkit.getPlayer(args[1]);
				if (jogador == null){
					p.sendMessage("=================================================================="
							+ "Gamemode Inteligente by: Jose Luiz"
							+ "§4O Player selecionado nao existe ou nao se encontra on-line!"
							+ "==================================================================");
					return true;
				}
				String sub = args[0];
				if (sub.equalsIgnoreCase("1")) {
					p.setGameMode(GameMode.CREATIVE);
					p.sendMessage("=================================================================="
							+ "Gamemode Inteligente by: Jose Luiz"
							+ "§4Voce alterou o modo de jogo de um Player!"
							+ "==================================================================");
					jogador.sendMessage("§4Voce entrou no modo §lCRIATIVO!");
				} else if (sub.equalsIgnoreCase("0")) {
					p.setGameMode(GameMode.SURVIVAL);
					p.sendMessage("=================================================================="
							+ "Gamemode Inteligente by: Jose Luiz"
							+ "§4Voce alterou o modo de jogo de um Player!"
							+ "==================================================================");
					jogador.sendMessage("§4Voce entrou no modo §lSOBREVIVENCIA!");
				} else if (sub.equalsIgnoreCase("2")) {
					p.setGameMode(GameMode.ADVENTURE);
					p.sendMessage("=================================================================="
							+ "Gamemode Inteligente by: Jose Luiz"
							+ "§4Voce alterou o modo de jogo de um Player!"
							+ "==================================================================");
					jogador.sendMessage("§4Voce entrou no modo §lAVENTURA!");
				} else if (sub.equalsIgnoreCase("3")) {
					p.setGameMode(GameMode.SPECTATOR);
					p.sendMessage("=================================================================="
							+ "Gamemode Inteligente by: Jose Luiz"
							+ "§4Voce alterou o modo de jogo de um Player!"
							+ "==================================================================");
					jogador.sendMessage("§4Voce entrou no modo §lESPECTADOR!");
				}
			}
		}
		// TODO Auto-generated method stub
		
		return false;
	}

}