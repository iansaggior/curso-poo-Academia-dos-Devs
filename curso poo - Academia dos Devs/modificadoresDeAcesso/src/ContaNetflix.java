public class ContaNetflix {
    private String idiomaPreferencial;
    private String resolucaoTela;
    
    public void entrar () {
        buscarPreferenciasDoUsuario();
        identificarResolucao();
    }

    public void assistirFilme (String nomeFilme) {
        System.out.println("Iniciando o filme " + nomeFilme);
        System.out.println("Carregando o filme na resolução: " + resolucaoTela);
        carregarAudioFilme();
    }

    private void buscarPreferenciasDoUsuario() {
        idiomaPreferencial = "PT-BR";
    }

    private void identificarResolucao() {
        resolucaoTela = "Full HD";
    }

    private void carregarAudioFilme() {
        if (idiomaPreferencial == "PT-BR" || idiomaPreferencial == "EN-US") {
            System.out.println("Carregando o audio em " + idiomaPreferencial);
        } else {
            System.out.println("Carregando o audio em EN-US");
        }
    }

}
