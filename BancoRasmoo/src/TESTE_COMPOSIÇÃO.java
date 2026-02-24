public class TESTE_COMPOSIÇÃO {
    static void main(String[] args) {
        Cliente clienteJorge = new Cliente();
        clienteJorge.nome="Jorge";
        clienteJorge.cpf ="000.000.000-00";
        clienteJorge.profissao="Soldier";
        clienteJorge.salario=2000;

        Conta conta =new Conta();
        conta.titular=clienteJorge; // aqui esta sendo feito a composição

        System.out.println(clienteJorge);
        System.out.println(conta.titular);
        System.out.println(conta.titular.nome); // acessando os atributos do cliente pelo objeto conta atraves da referencia e composição
        System.out.println(conta.titular.cpf);
        System.out.println(conta.titular.profissao);


    }
}
