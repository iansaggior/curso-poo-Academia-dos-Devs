package classes;

import javax.swing.JOptionPane;

public class Personagem {

    private String nome;
    private int nivel;
    private int forca;
    private int vida;
    private String classe;


    
    public Personagem(String nome, String classe) {
        this.nome = nome;
        this.classe = classe;
        nivel = 10;
        vida = nivel * 1000;
        if (classe.equals("Guerreiro") || classe.equals("guerreiro")) {
            forca = nivel * 2;
        } else {
            forca = nivel;
        }
    }

    public void mostrarStatus() {
        String status = String.format("Nome: %s \nNível: %d \nVida: %d \nClasse: %s \nForça: %d\n"
        ,nome, nivel, vida, classe, forca);
        JOptionPane.showMessageDialog(null, status, "STATUS PERSONAGEM", JOptionPane.INFORMATION_MESSAGE);
    }

    

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public int getForca() {
        return forca;
    }
    public void setForca(int forca) {
        this.forca = forca;
    }
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public String getClasse() {
        return classe;
    }
    public void setClasse(String classe) {
        this.classe = classe;
    }

    


}
