package classes;

public class VideoGame {

    private Jogo jogo;
    private boolean estaLigado;

    public void ligar() {
        System.out.println("Ligando o videoGame");
        this.estaLigado = true;
    }
    
    public void jogar(Jogo jogo) {
        if (estaLigado) {
            System.out.println("Iniciando o jogo");
            this.jogo = jogo;
            jogo.jogar();
        } else {
            System.out.println("Videogame esta desligado");
        }
    }
    
    public void fechar() {
        if (estaLigado) {
            System.out.println("Fechando o jogo");
            boolean temJogoRodando = jogo != null;
            if (temJogoRodando) {
                jogo.fechar();
                jogo = null;
            } else {
                System.out.println("Nao tem nenhum jogo rodando");
            }
        } else {
            System.out.println("Videogame esta desligado");
        }
    }
}
