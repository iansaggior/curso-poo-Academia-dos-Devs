import Animais.*;

public class App {
    public static void main(String[] args) throws Exception {
        Cachorro cachorro = new Cachorro("caramelo");
        cachorro.comer();
        cachorro.beber();
        cachorro.latir();
        
        Dragao dragao = new Dragao("Bangela");
        dragao.beber();
        dragao.comer();
        dragao.voar();
        dragao.soltarFogo();

        Pombo pombo = new Pombo("Pombo da sedex");
        pombo.voar();
        pombo.enviarCarta();
        pombo.fazerPru();
    }
}
