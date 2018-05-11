package jogodavelhaArray;

import java.util.Scanner;

public class GameVelha {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		char tabuleiro[] = {'_','_','_','_','_','_','_','_','_'};
		boolean player = false;
		char vencedor = ' ';
		
		System.out.println("Ola! Benvindo ao Jogo da Velha!"
 				+ "\nO X sempre comeca!");
		
		System.out.printf("\nInsira a posicao de (1 a 9) ");
		
		for (int i = 0; i < tabuleiro.length; i++){
				int posicao = entrada.nextInt() -1;
				
				if (!player) {	
					tabuleiro[posicao] = 'x';	
				}else{
					tabuleiro[posicao] = 'o';
					player = false;
				}
				if (tabuleiro[posicao] == 'x'){
					player = true;
				}
				//verifica vencedor
				if (tabuleiro[0] != '_' && tabuleiro[0] == tabuleiro[1] && tabuleiro[1] == tabuleiro[2]){
						i = tabuleiro.length;
						vencedor = tabuleiro[posicao];
				}
				else if  
					(tabuleiro[3] != '_' && tabuleiro[3] == tabuleiro[4] && tabuleiro[4] == tabuleiro[5]){
						i = tabuleiro.length;
						vencedor = tabuleiro[posicao];
				}
				else if  
				(tabuleiro[6] != '_' && tabuleiro[6] == tabuleiro[7] && tabuleiro[7] == tabuleiro[8]){
					i = tabuleiro.length;
					vencedor = tabuleiro[posicao];
				}	
				else if  
				(tabuleiro[0] != '_' && tabuleiro[0] == tabuleiro[3] && tabuleiro[3] == tabuleiro[6]){
					i = tabuleiro.length;
					vencedor = tabuleiro[posicao];
				}
				else if  
				(tabuleiro[1] != '_' && tabuleiro[1] == tabuleiro[4] && tabuleiro[4] == tabuleiro[7]){
					i = tabuleiro.length;
					vencedor = tabuleiro[posicao];
				}
				else if  
				(tabuleiro[2] != '_' && tabuleiro[2] == tabuleiro[5] && tabuleiro[5] == tabuleiro[8]){
					i = tabuleiro.length;
					vencedor = tabuleiro[posicao];
				}
				else if  
				(tabuleiro[0] != '_' && tabuleiro[0] == tabuleiro[4] && tabuleiro[4] == tabuleiro[8]){
					i = tabuleiro.length;
					vencedor = tabuleiro[posicao];
				}
				else if  
				(tabuleiro[2] != '_' && tabuleiro[2] == tabuleiro[4] && tabuleiro[4] == tabuleiro[6]){
					i = tabuleiro.length;
					vencedor = tabuleiro[posicao];
				}
					
				//imprime += tabuleiro[posicao];
				System.out.println("\nInsira a posicao de (1 a 9) ");
				System.out.println(tabuleiro[0] + " | " + tabuleiro[1] + " | " + tabuleiro[2] + "\n"
								   + tabuleiro[3]+ " | " + tabuleiro[4]+ " | " + tabuleiro[5] + "\n"
						    + tabuleiro[6]+ " | " + tabuleiro[7]+ " | " + tabuleiro[8] + "\n");
				
			}
		System.out.println("O jogador ("+ vencedor + ") Venceu");
					
		}
	}
