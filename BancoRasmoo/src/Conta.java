public class Conta {

        int agencia;
        int numero;
        Cliente titular ;
        double saldo;

        void depositar (double valor){
            saldo+= valor;

        }
        boolean sacar (double valor){

            if(valor<= saldo ){
                this.saldo-= valor;
                return true; //retornamos verdadeiro retirando do saldo o valor passado no parametro
            }
            else {
                System.out.println("ERRO!!!!\nValor de saque ivalido ou maior que o saldo.\n");
                return false; // retornamos falso com a mensagem de erro

            }

        }

        void transferir(double valor, Conta destino){

            //"this"faz referencia ao objeto que esta invocando o metodo
            boolean conseguiuSacar =this.sacar(valor);
            if(conseguiuSacar){
                destino.depositar(valor); // deposita o valor do saque ao destino ambos passados no parametro

            }

        }
    }

