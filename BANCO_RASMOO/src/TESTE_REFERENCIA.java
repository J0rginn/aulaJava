public class TESTE_REFERENCIA {
    static void main(String[] args) {
        Conta primeiraConta =new Conta();
        Conta segundaConta =new Conta();


        primeiraConta.depositar(1000);
        primeiraConta.transferir(500, segundaConta);

        boolean conseguiuTransferir =


        System.out.println(primeiraConta.saldo);
        System.out.println(segundaConta.saldo);

    }
}
