package classes;

public class PingPong implements Jogo {

    @Override
    public void jogar() {
        System.out.println("CutsCene inicial");
        System.out.println("Mostrando o menu inicial");
        System.out.println("Tocando musica de fundo");
    }

    @Override
    public void fechar() {
        System.out.println("Salvar o oprogresso do jogo");
        System.out.println("Fechar");
    }
    
}
