public class Conta {

       private int agencia;
       private int numero;
       private Cliente titular ; // colocamos o tipo Cliente no atributo titular para que possamos fazer referencia
        private double saldo; // variavel privada para ser acessada apenas nessa classe
        private static int total; // essa variavel não pertence mais ao objeto e sim a classe



//    public Conta (){ // neste podemos criar a conta sem passar nenhum parametro
//
//    }

    public Conta(int agencia,int numero){ // podemos criar varios construtores, para criarmos exceções, neste não e obrigatorio dizer o titular
        this.agencia =agencia;
        this.numero = numero;
    }

    public Conta(int agencia, int numero, Cliente titular){ //construtor é usado quando queremos instanciar um objeto
        this.agencia = agencia;
        this.numero =numero;
        this.titular = titular;
        Conta.total ++;
    }

        public void depositar (double valor){
            this.saldo+= valor;

        }
        public boolean  sacar (double valor){

            if(valor<= this.saldo ){
                this.saldo-= valor;
                return true; //retornamos verdadeiro retirando do saldo o valor passado no parametro
            }
            else {
                return false; // retornamos falso com a mensagem de erro

            }

        }

        public void transferir(double valor, Conta destino){

            //"this"faz referencia ao objeto que esta invocando o metodo
            boolean conseguiuSacar =this.sacar(valor);
            if(conseguiuSacar){
                destino.depositar(valor); // deposita o valor do saque ao destino ambos passados no parametro

            }

        }

        public double getSaldo(){
            return this.saldo;
        }
//        public void setsaldo(double saldo) {
//                this.saldo = saldo; // o atributo saldo vai receber o valor do parametro
//        }

        public int getAgencia(){
            return this.agencia;
        }

        public void setAgencia(int agencia){
            if(agencia >0){
                this.agencia = agencia; // verificação para aceitar somente numeros inteiros positivos
            }                           // se nao manter numero default


        }

        public int getNumero(){
            return this.numero;
        }
        public void setNumero(int numero){
            this.numero =numero;
        }

        public Cliente getTitular(){
            return this.titular;
        }

        public void setTitular(Cliente titular){
            this.titular =titular;
        }

        public static int getTotal(){
        return Conta.total;
        }

    }

