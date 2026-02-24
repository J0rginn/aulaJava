public class TESTE_NULL {
    static void main(String[] args) {

        Conta conta =new Conta();

        System.out.println(conta.agencia);
        System.out.println(conta.numero);
        System.out.println(conta.saldo);
        System.out.println(conta.titular);

        conta.titular = new Cliente();//resolução para o PointerExcepsion
        conta.titular.nome ="Jorge Henrique";

        System.out.println(conta.titular.nome);// Não foi feita essa referencia ainda, pois o titular e null


    }
}
