public class Testa_Conta {
    static void main(String[] args) {
        Conta primeiraConta= new Conta(10,100,new Cliente("jorge","0"));
        primeiraConta.setTitular(new Cliente("",""));// utilisamos o setTitular() para ter acesso aos metodos do objeto Cliente atraves da referencia

        Conta segundaConta =  new Conta(44,700,new Cliente("",""));

        primeiraConta.depositar(1000);
        primeiraConta.transferir(500, segundaConta);
        primeiraConta.getTitular().setNome("jorge"); // atraves do metodo getTitular estamos acessando os metodos do objeto Cliente
        primeiraConta.getTitular().setCpf("000.403.333-44");

        System.out.println(primeiraConta.getTitular().getNome());
        System.out.println(primeiraConta.getTitular().getCpf());
        System.out.println(primeiraConta.getSaldo());
        System.out.println(segundaConta.getSaldo());

    }
}
