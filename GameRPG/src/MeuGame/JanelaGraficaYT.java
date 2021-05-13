package MeuGame;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JanelaGraficaYT extends JFrame{
	
	JButton jb = new JButton("Iniciar");
	
	


	public JanelaGraficaYT() {
	

		jb.setBounds(0, 0, 100, 50);
		add(jb);
		
		
		JFrame jf = new JFrame();//função Janela Grafica
		
		jf.setTitle("COMBATE X");// titulo da janela
		jf.setSize(1024,720);// tamanho da janela em pixels
		jf.setLocationRelativeTo(null);// redimencionar a janela 
		jf.setResizable(false);//true ou false para redimencionamento da janela
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//função clicar no X e fechar
		jf.setVisible(true);//Deixar visivel a janela com true ou false
	
	}
	public static void main(String[] args) {
		new JanelaGraficaYT();
		

		
	}
}
