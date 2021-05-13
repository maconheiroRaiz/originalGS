package MeuGame.personagens;

import java.util.Scanner;

import MeuGame.baltalha.batalha;
import MeuGame.interfaces.personagem;

public class Akyra extends batalha implements personagem{
	
	String name = "Akyra";
	
	public Akyra() {
		super(150, 50);
		welcome(name);
		run();
	}

	
	
	@SuppressWarnings("resource")
	@Override
	public int onAtaquePernonagem() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escolha seu ataque");
		System.out.println("[1] SOCO");
		System.out.println("[2] CHUTE");
		System.out.println("[3] ESPECIAL");
		return entrada.nextInt();
	}
	

	
	@Override
	public void onAtaques() {
		switch (onAtaquePernonagem()) {
		case 1:
			System.out.println("VOCÊ ATACOU O OPONENTE COM UM SOCO");
			hpMachine -=7;
			break;
		case 2:
			System.out.println("VOCÊ ATACOU O OPONENTE COM UM CHUTE");
			hpMachine -=9;
			break;
		case 3:
			System.out.println("VOCÊ ATACOU O OPONENTE COM UM GOLPE SECRETO");
			hpMachine -=20;
			contagemEspecial --;
			if (contagemEspecial < 0) {
				contagemEspecial = 0;
				hpMachine += 20;
				
				System.out.println("VOCÊ ERROU O ATAQUE!!!\nO Jogador está muito cansado para efetuar esse tipo de ataque! \n");
			}
			break;
		default:
			System.out.println("Seu personagem não aprendeu este golpe.");
		}
		
	}



	@Override
	public int onAtaqueNPC() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	


	
}
