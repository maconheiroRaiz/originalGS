package MeuGame.interfaces;

import java.util.Scanner;

public interface personagem {


	
	default void welcome(String name) {
	  System.out.println("Você está jogando com: "+name);
	}
	
    int onAtaquePernonagem();
    int onAtaqueNPC();
    
   
}


