
package jogo.da.velha;

import javax.swing.JFrame;

public class JogoDaVelha extends JFrame{

   public static void main(String[] args) {
      Jogo Tela = new Jogo();//Cria um novo objeto do tipo jogo.
      Tela.setDefaultCloseOperation(EXIT_ON_CLOSE);//Determina que ao fechar a tela a aplicacao é finalizada.
      Tela.setResizable(false);//Faz com que a tela nao seja maximizada
    }
    
}
