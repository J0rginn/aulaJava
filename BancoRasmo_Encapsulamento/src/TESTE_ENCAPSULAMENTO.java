public class TESTE_ENCAPSULAMENTO {
    static void main() {
        Conta conta = new Conta(10,100,new Cliente("",""));
        conta.depositar(1000);
        conta.sacar(00);
        conta.setAgencia(10);

//      Cliente cliente = new Cliente();
//
//      cliente.setNome("jorge");
//      cliente.setCpf("000.000.000-00");
//      cliente.setProfissao("Jogador");
//      cliente.setSalario(20000);
//
//      conta.setTitular(cliente);// relacionando a variavel cliente ao objeto privado titular atraves do metodo set
//        System.out.println(cliente.getnNome());

        conta.setTitular(new Cliente("","")); //O metodo esta pegando Cliente de referencia atraves do parametro
        conta.getTitular().setNome("Jorgin");
        conta.getTitular().setSalario(3000);
        System.out.println(conta.getTitular().getNome());
        System.out.println(conta.getTitular().getSalario());
        System.out.println(conta.getAgencia());
        System.out.println(conta.getSaldo());

    }
}
