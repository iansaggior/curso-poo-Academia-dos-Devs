package classes;

public class Conta {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void depositar (double valor) {
        if (valor < 0) {
            System.err.println("Não é possivel depositar um valor negativo!!");
        } else {
            saldo =+ valor;
        }
    }
}
