package Animais;

public class Pombo extends Ave{
    private int cartasEnviadas;

    public Pombo(String nome) {
        super(nome);
        this.cartasEnviadas = 10;
    }

    public void enviarCarta() {
        cartasEnviadas++;
        System.out.printf("%s enviou %d cartas\n", getNome(), getCartasEnviadas());
    }

    public void fazerPru() {
        System.out.printf("%s soltou um PRUU\n", getNome());
    }

    public int getCartasEnviadas() {
        return cartasEnviadas;
    }
    
}
