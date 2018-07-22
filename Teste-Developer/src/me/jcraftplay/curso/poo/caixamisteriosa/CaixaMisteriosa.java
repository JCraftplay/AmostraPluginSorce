package me.jcraftplay.curso.poo.caixamisteriosa;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.inventory.ItemStack;

import net.eduard.api.lib.storage.Storable;

public class CaixaMisteriosa implements Storable{
	private String nome;
	private ItemStack caixa;
	private List<ItemStack> premios = new ArrayList<>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ItemStack getCaixa() {
		return caixa;
	}

	public void setCaixa(ItemStack caixa) {
		this.caixa = caixa;
	}

	public List<ItemStack> getPremios() {
		return premios;
	}

	public void setPremios(List<ItemStack> premios) {
		this.premios = premios;
	}
	
	public void RegistrarPremio(ItemStack premio) {
		premios.add(premio);
		
	}

}
