/*Criar uma aplicação em Java que tenha uma função recursiva que
calcule o somatório do N primeiros número NATURAIS (a função deve
retornar zero para números negativos)*/

package view;

import controller.controller;

public class Principal {
	public static void main (String [] args) {
		controller soma = new controller();
		
		int num = 10;
		int somatorio = soma.somatorio(num);
		System.out.println(somatorio);
		
	}
}
