
import java.util.Scanner;
import java.util.Random;


public class principal {
	
	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.print("        BEM VINDO AO JOKENPO \n  O JOGO SERÁ UMA MELHOR DE 3, SENDO ASSIM QUEM VENCER 2X GANHA!! \n");
		System.out.print("  ESCOLHA SEU MOVIMENTO: \n");
		System.out.printf(" [1] Pedra \n [2] Papel \n [3] Tesoura \n Digite: ");
		int resp = teclado.nextInt();
		Random gerar = new Random();
		int bot = gerar.nextInt(3);
		bot = bot + 1;
		
		String jogador = " ";
		String computador = " ";
		
		switch (resp){
			case 1:
				jogador = "Pedra";
				break;
			
			case 2:
				jogador = "Papel";
				break;
				
			case 3:
				jogador = "Tesoura";
				break;
		}
		
		switch (bot){
		case 1:
			computador = "Pedra";
			break;
		
		case 2:
			computador = "Papel";
			break;
			
		case 3:
			computador = "Tesoura";
			break;
	}			
		
		System.out.print("============================== \n");
		if(jogador == computador) {
			System.out.print(" O Jogador escolheu: " + jogador + "\n O computador escolheu: " + computador +  "\n O vencedor é o: EMPATE");
		}else {
			if(jogador == "Pedra" && computador == "Tesoura") {
				System.out.print(" O Jogador escolheu: " + jogador + "\n O computador escolheu: " + computador +  "\n O vencedor é o: Jogador");
			}else {
				if(jogador == "Pedra" && computador == "Papel") {
					System.out.print(" O Jogador escolheu: " + jogador + "\n O computador escolheu: " + computador +  "\n O vencedor é o: Computador");
				}else {
					if(jogador == "Papel" && computador == "Tesoura") {
						System.out.print(" O Jogador escolheu: " + jogador + "\n O computador escolheu: " + computador +  "\n O vencedor é o: Computador");
					}
					else {
						if(jogador == "Tesoura" && computador == "Papel") {
							System.out.print(" O Jogador escolheu: " + jogador + "\n O computador escolheu: " + computador +  "\n O vencedor é o: Jogador");
						}else {
							if(jogador == "Tesoura" && computador == "Pedra") {
								System.out.print(" O Jogador escolheu: " + jogador + "\n O computador escolheu: " + computador +  "\n O vencedor é o: Computador");
							}else {
								if(jogador == "Papel" && computador == "Pedra") {
									System.out.print(" O Jogador escolheu: " + jogador + "\n O computador escolheu: " + computador +  "\n O vencedor é o: Jogador");
								}
							}
						}
					}
				}
			}	
		}
	}
}

