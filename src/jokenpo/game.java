
package jokenpo;

import java.util.Random;
import java.util.Scanner;

public class game {

	
	 
	public static void main(String[] args) {
		
		
		
		
		Scanner leitor = new Scanner (System.in);
		
	System.out.println("Escolha um n�mero (1,2 ou 3) ");
	
	 
	 System.out.println("1- Pedra ");
	 
	 System.out.println("2- Papel ");
	 
	 System.out.println("3- Tesoura ");
	 
	 System.out.println("Digite a sua escolha:");
	 int ppt = leitor.nextInt();
	 
	 Random sorteio = new Random ();
	  
	  int valorSorteado  = sorteio.nextInt(3) + 1;
	  
	  
	 
	 
	 if (ppt == 1  && valorSorteado == 2) {
		 System.out.println("Voc� escolheu pedra");
		 System.out.println("O computador escolheu papel ");
		 System.out.println("O computador ganhou");
	 } else if (ppt == 1 && valorSorteado == 3) {
		 System.out.println("Voc� escolheu pedra");
		 System.out.println("O computador escolheu tesoura");
		 System.out.println("Voc� venceu!!");
	 } else if (ppt == 2 && valorSorteado == 3) {
		 System.out.println("Voc� escolheu papel");
		 System.out.println("O computador escolheu tesoura "); 
		 System.out.println("O computador ganhou: "); 
	 } else if (ppt == 2 && valorSorteado == 1) {
		 System.out.println("Voc� escolheu papel");
		 System.out.println("O computador escolheu pedra ");
		 System.out.println("Voc� venceu");
	 } else if (ppt == 3 && valorSorteado == 1) {
		 System.out.println("O computador ganhou");
	 } else if (ppt == 3 && valorSorteado == 1) {
		 System.out.println("Voc� venceu");
	 } else {
		 System.out.println("Voc� escolheu: " + ppt);
		 System.out.println("O computador escolheu  " + valorSorteado);
		 System.out.println("Empate");
	 } 
	 
	 
		 
	
	 }
	 

	 
		
		
		
		
		
		
	  
	  
	  
	

           }


