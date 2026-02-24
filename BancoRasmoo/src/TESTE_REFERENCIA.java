public class TESTE_REFERENCIA {
    static void main(String[] args) {
        Conta primeiraConta =new Conta(); // essa variavel esta fazendo referencia ao objeto conta.
        Conta segundaConta =new Conta();
        Conta terceiraConta = primeiraConta; // esta variavel esta recebendo a referencia da referencia
                                            // elas apontam para o mesmo espaço de memoria


        primeiraConta.depositar(1000);
        primeiraConta.transferir(1500, segundaConta);

        System.out.println("Referencia da primeiraConta: "+primeiraConta);
        System.out.println("Referencia da terceiraConta: "  +terceiraConta);

        System.out.println("\nEsse e o saldo da primeira conta: R$" +primeiraConta.saldo);
        System.out.println("Esse e o saldo da segunda conta: R$" +segundaConta.saldo);

    }
}
