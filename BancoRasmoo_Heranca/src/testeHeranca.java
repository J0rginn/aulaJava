public class testeHeranca {
  static void main(String[] args) {

    Cliente jorge = new Cliente("Jorge", "00.999.666-88");
    ContaCorrente cc = new ContaCorrente(10,1000,jorge);
    cc.depositar(1000);
    System.out.println(cc.getTitular().getNome());
    System.out.println(cc.getSaldo());

  }
}
