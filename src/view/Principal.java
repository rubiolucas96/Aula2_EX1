/*Criar uma aplica��o em Java que tenha uma fun��o recursiva que
calcule o somat�rio do N primeiros n�mero NATURAIS (a fun��o deve
retornar zero para n�meros negativos)*/

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
