public class Teste_Construtor {
    static void main(String[] args) {
        Conta conta = new Conta(10,100,new Cliente("jorge","000.555.666-77")); // a conta e o cliente so podem ser criados se os parametros forem passados

        System.out.println(conta.getTitular());
        System.out.println(conta.getAgencia());
        System.out.println(conta.getNumero());
        System.out.println(conta.getTitular().getNome());
        System.out.println(conta.getTitular().getCpf());

    }
}
