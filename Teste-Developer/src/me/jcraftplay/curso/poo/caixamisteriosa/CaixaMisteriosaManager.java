package me.jcraftplay.curso.poo.caixamisteriosa;

import java.util.ArrayList;

import org.bukkit.inventory.ItemStack;

import net.eduard.api.lib.storage.Storable;

public class CaixaMisteriosaManager implements Storable {
	private ArrayList<CaixaMisteriosa> lista = new ArrayList<>();

	public ArrayList<CaixaMisteriosa> getLista() {
		return lista;
	}

	public void setLista(ArrayList<CaixaMisteriosa> lista) {
		this.lista = lista;
	}

	public CaixaMisteriosa GetCaixaPeloNome(String nome) {
		for (CaixaMisteriosa caixa : lista) {
			if (caixa.getNome().equalsIgnoreCase(nome)) {
				return caixa;

			}

		}
		return null;
	}

	public CaixaMisteriosa GetCaixaPeloItem(ItemStack item) {
		for (CaixaMisteriosa caixa : lista) {
			if (caixa.getCaixa().isSimilar(item)) {
				return caixa;
				
			}
			
		}
		return null;
	}
	
	public CaixaMisteriosa CreateCaixa(String nome, ItemStack iten) {
		CaixaMisteriosa caixa = new CaixaMisteriosa();
		caixa.setNome(nome);
		caixa.setCaixa(iten);
		lista.add(caixa);
		return caixa;
		
	}
	
	public void RegisterCaixa(CaixaMisteriosa caixa) { // Ou ADD
		lista.add(caixa);
	}

}
