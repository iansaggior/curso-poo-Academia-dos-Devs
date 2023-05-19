package classes;

public class TiroAoAlvoOnline implements Jogo {

    @Override
    public void jogar() {
        System.out.println("Carregando o jogo");
        System.out.println("Conectando ao servidor...");
        System.out.println("carregando partida");
    }

    @Override
    public void fechar() {
        System.out.println("Salvar progesso no servidor");
        System.out.println("Sair da partida");
        System.out.println("Sair do jogo");
    }
    
}
