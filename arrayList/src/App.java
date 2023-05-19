import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

/*                 ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
                pessoas.add(new Pessoa("Maria", 50));
                pessoas.add(new Pessoa("João", 20));
                pessoas.add(new Pessoa("Pedro", 35));
        
                for (Pessoa pessoa : pessoas) {
                    System.out.println(pessoa.getNome() + "\t" + pessoa.getIdade());
                } */

/*         ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(10);
        numeros.add(150);
        numeros.add(46);
        numeros.add(67);
        numeros.add(-1);
        numeros.add(3);
        numeros.add(20);
        numeros.add(2);

        //Collections.sort(numeros); // ordenar numeros de forma crescente
        Collections.sort(numeros, Collections.reverseOrder()); // ordenar numeros de forma decrescente

        for (Integer num : numeros) {
            System.out.println(num);
        } */


        ArrayList<String> nomes = new ArrayList<String>();

        nomes.add("Maria");
        nomes.add("João");
        nomes.add("Zeus");
        nomes.add("Pedro");
        nomes.add("Abelha");

        //Collections.sort(nomes); // ordenar numeros de forma crescente
        Collections.sort(nomes, Collections.reverseOrder()); // ordenar numeros de forma decrescente

        for (String nome : nomes) {
            System.out.println(nome);
        }

    }
}
