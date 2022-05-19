package com.algaworks.listas;

import java.util.ArrayList;
import java.util.List;

public class Exemplo2 {
	
	public static void main (String[] args) {
		List<Cliente> clientes = new ArrayList<>();
		
		//Declarar clientes
		clientes.add(new Cliente (1L, "José"));
		clientes.add(new Cliente (2L, "Square"));
		clientes.add(new Cliente (3L, "Pix"));
		
		//interar nos clientes, %n quebra de linha
		
		clientes.forEach(cliente -> System.out.printf("ID: %d, Nome: %s%n",
				cliente.getId(),cliente.getNome()));
		
	}
}
