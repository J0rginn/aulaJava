public class Conta {

        int agencia;
        int numero;
        String titular;
        double saldo;

        void depositar (double valor){
            saldo+= valor;

        }
        boolean sacar (double valor){

            if(valor<= saldo ){
                saldo-= valor;
                return true;

            }
            else {

                return false;
            }

        }

        void transferir(double valor, Conta destino){
            //"this"faz referencia ao objeto que esta invocando o metodo
            boolean conseguiuSacar =this.sacar(valor);
            if(conseguiuSacar){
                destino.depositar(valor);

            }
            else {

            }

        }
    }

