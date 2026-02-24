public class ContaCorrente extends Conta {

    //Criacao dos contrutores
    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    public ContaCorrente(int agencia, int numero, Cliente titular) {
        super(agencia, numero, titular);
    }

    // sobrescrevendo metodos
    //Inserindo taxa de 2 reais no saque
    @Override//sobrescrita
    public boolean sacar(double valor) {
        double novoValor =valor +2;
            return super.sacar(novoValor);
    }

    //Retirando taxa de 2 reais da transferencia
    @Override
    public void transferir(double valor, Conta destino) {
        double novoValor = valor -2;
        super.transferir(novoValor, destino);
    }
}
