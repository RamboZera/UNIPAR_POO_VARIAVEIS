public class ContaBancaria {
    private double saldo;
    private String numeroConta;

    public ContaBancaria(String numeroConta) {
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Deposito de R$" + valor + " concluido com sucesso!");
        } else {
            System.out.println("Valor inválido para deposito!!");
        }
    }

    public void sacar(double valor) {
        if (valor > 0) {
            if (saldo >= valor) {
                saldo -= valor;
                System.out.println("Saque de R$" + valor + " realizado com sucesso!");
            } else {
                System.out.println("Saldo insuficiente para realizar o saque!");
            }
        } else {
            System.out.println("Valor inválido para saque.");
        }
    }

    public double consultarSaldo() {
        return saldo;
    }

}
