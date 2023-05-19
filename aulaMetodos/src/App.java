public class App {
    public static void main(String[] args) throws Exception {

        Personagem heroi = new Personagem();
        heroi.nome = "Hércules";
        heroi.nivel = 2;
        heroi.forca = 20;

        Personagem princesa = new Personagem();
        princesa.nome = "Leya";
        princesa.nivel = 3;
        princesa.forca = 12;

        heroi.mostrarStatus();
        princesa.mostrarStatus();

        heroi.atacar("Hydra", "espada");
        princesa.atacar("Droydes", "sabre de luz");
    }
}
