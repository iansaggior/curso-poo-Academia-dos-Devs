import javax.swing.JOptionPane;

import classes.*;

public class App {
    public static void main(String[] args) throws Exception {
        String nome = JOptionPane.showInputDialog(null, "Digite o nome do personagem:", "NOME", JOptionPane.INFORMATION_MESSAGE);
        String classe = JOptionPane.showInputDialog(null, "Digite a classe do personagem:", "CLASSE", JOptionPane.INFORMATION_MESSAGE);

        Personagem guerreiro = new Personagem(nome, classe);
        guerreiro.mostrarStatus();


    }
}
