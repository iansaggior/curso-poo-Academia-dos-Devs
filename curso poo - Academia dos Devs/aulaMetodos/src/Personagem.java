import java.util.Random;

/**
 * @author Ian
 */

public class Personagem {

    String nome;
    int nivel;
    int forca;

    /**
     * Método que mostra as informações de um personagem
     */
    public void mostrarStatus () {
        System.out.printf("Personagem: %s (lvl %d) com %d de força. \n",
        nome, nivel, forca); 
    }

    /**
     * Método que calcula o dano causado por um personagem através de um número aleatório gerado no dado de 20 faces
     * @return dano (numeroDado + Força)
     */
    public int calcularDano () {
        Random geradorAleatorio = new Random();
        int dado20Faces = 1 + geradorAleatorio.nextInt(19);
        int dano = forca + dado20Faces;
        return dano;
    }

    /**
     * Método que faz o personagem escolhido atacar outro personagem usando ou não uma habilidade
     * @param alvo String
     * @param habilidade String
     */
    public void atacar(String alvo, String habilidade) {
        int danoCausado = calcularDano();

        if (habilidade.length() == 0) {
            System.out.printf("%s atacou %s e causou %d de dano!\n",
            nome, alvo, danoCausado);
        } else {
            System.out.printf("%s usou '%s' contra %s e causou %d de dano!\n",
            nome, habilidade, alvo, danoCausado);

        }
    }
}
