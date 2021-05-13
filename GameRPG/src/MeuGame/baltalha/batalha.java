package MeuGame.baltalha;

import java.util.Random;

import MeuGame.RPGjogo;
import MeuGame.utils;

public abstract class batalha{

	
	protected int hpMachine;
	private int hpUser;
	protected int contagemEspecial;
	public static int batalhas = 1;
	private int user_vida = 150;
	private int tempo_jogo = 0; // 1 segundo.
	
	
	public batalha() {}
	
	public batalha(int hpUser, int contagemEspecial) {
		this.hpUser = hpUser;
		this.contagemEspecial = contagemEspecial;
		hpMachine = 10;
	}
	
	
	public void run() {
	

		while (this.hpUser > 0) {
			
			utils.oponenteNivel(batalhas);
		
			while(hpUser > 0 && hpMachine > 0) {
				utils.wait(tempo_jogo);
				
				utils.onMessage(hpUser, hpMachine, contagemEspecial, batalhas);
				
				onAtaques();
				
				utils.wait(tempo_jogo);
				
				if(hpMachine > 0) {
					onNPCAttack();
					
				}else {
					System.out.println("Você derrotou o NPC");
				}
			}
			
			
			if(hpUser > 0) {
				Random r = new Random();
				if(r.nextInt(10) >= 7) {
					hpUser += 5;
					if (hpUser >= 150) {
						hpUser = 150;
						System.out.println("Sua vida já está cheia, sem bonus de hp.\n");
					}
					System.out.println("BONUS DE HP!!!\nSeu HP Aumentou em 5 pontos por ter eliminado um oponente.\n");
				}
				}else {
					if(utils.onGameOver() != 1) {
						System.out.println("Rodadas: "+batalhas);
						
							if(batalhas == 1) {
								System.out.println("Jogou nada em pcrin kkk falo nada");
							}else {
								System.out.println("Parabens por chegar até aqui!");
							}
							utils.wait(tempo_jogo);
							break;
					}
				}
				if(hpMachine < 0) {
					hpMachine = 10 + (1 * batalhas);
				}
				if(batalhas % 10 == 0) {
					contagemEspecial++;
					if(contagemEspecial > 5) {
						contagemEspecial = 5;
					}
				}
				batalhas++;
			}
	}
	
	private int ataqueComputador(int i) {
		Random gerador = new Random();
		return gerador.nextInt(i)+1; // return 1 && 3 
		
	}
	
	public abstract void onAtaques();
	
	public void onNPCAttack() {
		int danoOponente;
		switch (ataqueComputador(3)) {
		case 1:
			hpUser -= 2 +(hpMachine / 10);
			danoOponente = hpUser - user_vida;
			System.out.printf("SEU OPONENTE ATACOU VOCÊ COM UM SOCO. %d de HP \n",danoOponente);
			break;
		case 2:
			hpUser -= 3 +(hpMachine / 10);
			danoOponente = hpUser - user_vida;
			System.out.printf("\nSEU OPONENTE ATACOU VOCÊ COM UM CHUTE. %d de HP \n",danoOponente);
			break;
		case 3:
			hpUser -= 4 +(hpMachine / 10);
			danoOponente = hpUser - user_vida;
			System.out.printf("SEU OPONENTE ATACOU VOCÊ COM UM GOLPE SECRETO. %d de HP \n",danoOponente);
			break;
		default:
			System.out.println("O NPC errou o golpe.");
		}
	}
	
	


	
}
