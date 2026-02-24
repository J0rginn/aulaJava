public class TestePolimorfismo {
    static void main(String[] args) {
        Cliente jorge = new Cliente("jorge","26.5.55.9.99");
        ContaCorrente cc = new ContaCorrente(10,100012,jorge);
        ContaPoupanca cp =new ContaPoupanca(10,1005,jorge);


        cc.depositar(1000);
        cp.depositar(10000);

        cc.sacar(100);
        cp.sacar(1000);

        cc.transferir(500,cp);

        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());

        System.out.println(cc);

    }
}
