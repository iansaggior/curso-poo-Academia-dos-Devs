public class App {
    public static void main(String[] args) throws Exception {
        // Iphone 12, tela de 6.1", 256gb
        // Galaxy Note 20 Ultra, tela de 6.9", 256gb
        // Xiaomi Mi 11 pro, tela de 6.81", 128gb

        // Declarando objeto do tipo Celular = Instanciando um objeto
        Celular celularA = new Celular();
        celularA.nome = "Iphone 12";
        celularA.tamanhoTela = 6.1f;
        celularA.espacaoArmazenamento = 256;
        celularA.sistemaOperacional = "iOS";

        Celular celularB = new Celular();
        celularB.nome = "Galaxy Note 20 Ultra";
        celularB.tamanhoTela = 6.9f;
        celularB.espacaoArmazenamento = 256;
        celularB.sistemaOperacional = "Android";

        Celular celularC = new Celular();
        celularC.nome = "Xiaomi Mi 11 pro";
        celularC.tamanhoTela = 6.81f;
        celularC.espacaoArmazenamento = 128;
        celularC.sistemaOperacional = "Android";
        
        System.out.printf("Celular %s com tela de %.2f\", com %dgb e SO %s \n", celularA.nome, celularA.tamanhoTela, celularA.espacaoArmazenamento, celularA.sistemaOperacional);
        System.out.printf("Celular %s com tela de %.2f\", com %dgb e SO %s\n", celularB.nome, celularB.tamanhoTela, celularB.espacaoArmazenamento, celularB.sistemaOperacional);
        System.out.printf("Celular %s com tela de %.2f\", com %dgb e SO %s\n", celularC.nome, celularC.tamanhoTela, celularC.espacaoArmazenamento, celularC.sistemaOperacional);

    }
}
