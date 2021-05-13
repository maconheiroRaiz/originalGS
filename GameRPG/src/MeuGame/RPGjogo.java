package MeuGame;

import java.util.ArrayList;
import java.util.Scanner;

import MeuGame.baltalha.batalha;
import MeuGame.personagens.Akyra;
import MeuGame.personagens.Kyan;

public class RPGjogo {

	public static ArrayList<String> user;
	
	public static void main(String[] args) {
		user = new ArrayList<>();
		Scanner entrada = new Scanner(System.in);
		int continua = 1;
		int record = 0;
		
		onChoices();

		while (continua == 1) {
			record = batalha.batalhas;
		
			onChoices();
			
			if (batalha.batalhas > 20) {
				System.out.println("Parabéns!! você é um dos melhores");	
				System.out.printf("\nSEU RECORD FOI DE: %d\n", record);
			}
			
			
		}
		entrada.close();
		
	}
	
	public static void Personagens() {
		user.add("Akyra");
		user.add("Kyan");
		
		System.out.println("Escolha o seu personagem");
		for(int i = 0; i < user.size(); i++) {
			System.out.println("["+i+"] " + user.get(i));
		}
	}
	
	public static void onChoices() {
		Scanner perso = new Scanner(System.in);
	
		Personagens();
		user.clear();
		
			switch (perso.nextInt()) {
			case 0:
				new Akyra();
				break;
			case 1:
				new Kyan();
				break;
			default:
				try {
					System.out.println("Opção Inválida");
					Thread.sleep(1000);
					onChoices();
					
				}catch (InterruptedException e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
				break;
			}
	}

}
