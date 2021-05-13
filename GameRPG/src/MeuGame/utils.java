package MeuGame;

import java.util.Scanner;

public class utils {

	private static Scanner sc;
	
	public static void oponenteNivel(int oponente) {
		System.out.println("==============================");
		System.out.println("==============================");
		System.out.printf("========= Oponente:%d =========\n", oponente);
		System.out.println("==============================");
		System.out.println("==============================\n");

	}
	
	public static void onMessage(int hpUser, int hpMachine, int contagemEspeciais, int machine) {
		System.out.println("________________________");
		System.out.println("HP do Jogador: "+ hpUser);
		System.out.println("HP do Oponente:"+machine+": "+ hpMachine);
		System.out.println("Quantidade de Especiais restantes: "+ contagemEspeciais);
		System.out.println("________________________");
	}
	
	@SuppressWarnings("resource")
	public static int onGameOver() {
		sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Game Over \n Deseja jogar outra partida? (1) SIM (2) NÃO");
		return sc.nextInt();
	}
	
	public static void wait(int ms){
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
	
}
