import classes.Conta;
import classes.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Bill hill");
        pessoa.setAltura(1.80);
        pessoa.setIdade(35);
        
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getAltura());

        Conta conta = new Conta();
        System.out.println(conta.getSaldo());
        conta.depositar(100);
        System.out.println(conta.getSaldo());
    }
}
