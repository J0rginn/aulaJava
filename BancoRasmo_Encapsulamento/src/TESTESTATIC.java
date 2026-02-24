public class TESTESTATIC {
    static void main(String[] args) {
        Conta conta =new Conta(10,100,new Cliente("jorge","000.000.006-89"));
        Conta conta2 = new Conta(12,1002,new Cliente( "pedro", "000.675.222.-00"));

        System.out.println("Total de contas é:"+Conta.getTotal());





    }
}
