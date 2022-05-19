package com.algaworks.listas;

import java.util.ArrayList;
import java.util.List;

//WARM UP MSR 0 
public class Exemplo1 {

	public static void main (String[] args) {
		
		//declarar lista , interface de lista java .util 
		List<String> nomes = new ArrayList<>();
		
		//Gravar itens na lista 
		nomes.add("Jos�");
		nomes.add("Maria");
		nomes.add("Zezin");
		
		System.out.println(nomes);
		
		//Remover itens adicionados na lista, usando o indice como referencia 
		//seta qual elemento deseja eliminar com base no indice ,come�a no 0
		nomes.remove(0);
		System.out.println(nomes);
		
		//Remover itens adicionados na lista, usando o conte�do como refer�ncia 
		nomes.remove("Zezin");
		System.out.println(nomes);
		
		nomes.add("Jos�");
		nomes.add("Zezin");
		System.out.println(nomes);
		
		//Itera,, percorre a Lista 
		//pelo �ndice, atrav�s do loop
		for (int i = 0; i < nomes.size(); i ++ ) {
			System.out.println("Nome"+ (i +1)+ ": " + nomes.get(i));
		}
			System.out.println("---------For aprimorado -------");
			
		//loop aprimorado , tipo do elemento mais variavel local : variavel com elementos em lista
		//Usar se n�o precisar do �ndice;
		for (String nome : nomes ) {
			System.out.println("Nome: " + nome);
					
		}
			
	}
}
