package MeuGame.interfaces;

import java.util.Scanner;

public interface personagem {


	
	default void welcome(String name) {
	  System.out.println("Voc� est� jogando com: "+name);
	}
	
    int onAtaquePernonagem();
    int onAtaqueNPC();
    
   
}


