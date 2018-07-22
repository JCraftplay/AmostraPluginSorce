package me.jcraftplay.curso.poo.caixamisteriosa;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import net.eduard.api.lib.core.Mine;

public class CaixaMisteriosaComando implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String lb, String[] args) {
		if (sender instanceof Player) {
			Player p = (Player) sender;
			if (args.length < 3) {
				p.sendMessage("§c§lJ-CaixasM §8> §FUtilize: /darcaixa <player> <tipo> <quantidade>");
			} else {
				Player jogador = Bukkit.getPlayer(args[0]);
				if (jogador == null) {
					p.sendMessage("§c§lJ-CaixasM §8> §FInsira um Player Valido!");
					return true;
				}
				Integer quantidade = Mine.toInt(args[2]);
				CaixaMisteriosa caixa = CaixaMisteriosaAPI.getManager().GetCaixaPeloNome(args[1]);
				if (caixa == null) {
					p.sendMessage("§c§lJ-CaixasM §8> §F" + args[1] + "§F nao e uma caixa valida!");

				} else {
					ItemStack item = caixa.getCaixa().clone();
					item.setAmount(quantidade);
					jogador.getInventory().addItem(item);
					p.sendMessage("§c§lJ-CaixasM §8> §FVoce acaba de enviar a caixa "+caixa.getNome() + " para o jogador " + jogador.getName() + " com sucesso! Quantidade: "+ quantidade);
				}
			}

		}
		// TODO Auto-generated method stub
		return false;
	}

}
