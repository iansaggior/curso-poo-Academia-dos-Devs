package classes;

public class Xadrez implements Jogo {

    @Override
    public void jogar() {
        System.out.println("Exibir menu");
        System.out.println("Exibir jogadas de fundo");
    }

    @Override
    public void fechar() {
        System.out.println("Fechando o jogo");
    }
    
}
