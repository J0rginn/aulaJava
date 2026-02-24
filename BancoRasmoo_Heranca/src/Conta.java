public class Conta  {
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;
    private double saldo;

    public Conta(int agencia, int numero){
        this.agencia= agencia;
        this.numero = numero;
    }
    public Conta(int agencia, int numero, Cliente titular){
        this.agencia= agencia;
        this.numero =numero;
        this.titular= titular;

        Conta.total++;
    }

        public void depositar(double valor){
        if (valor> 0.0){
            this.saldo += valor;
        }
     }

         public boolean sacar(double valor){
            if (valor<=saldo){
                this.saldo = saldo - valor;
                return true;
        }
            else{
            return false;
        }
        }

        public void transferir( double valor, Conta destino){
            boolean conseguiuSacar = this.sacar(valor);

            if (conseguiuSacar){
                destino.depositar(valor);
            }
        }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getTotal() {
        return Conta.total;
    }

    public void setTotal(int total) {
        Conta.total = total;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


    @Override
    public String toString() {
        return "Conta{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", titular=" + titular +
                ", saldo=" + saldo +
                '}';
    }
}
