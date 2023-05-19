import classes.*;


public class App {
    public static void main(String[] args) throws Exception {

        VideoGame xdevOne = new VideoGame();
        xdevOne.ligar();
        xdevOne.jogar(new TiroAoAlvoOnline());
        xdevOne.fechar();
    }
}
