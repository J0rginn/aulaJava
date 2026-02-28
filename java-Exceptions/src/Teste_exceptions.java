import java.awt.event.ContainerAdapter;

public class Teste_exceptions {
    static void main(String[] args) {
        try { // tente fazer
            int resultado = 5 / 2;
            System.out.println(resultado);

            Cliente jorge=new Cliente("jorge","666.999.888-99");
            Conta conta = new Conta(10,1002,jorge);
            conta.depositar(1000);
            conta.sacar(1090);


            System.out.println("O saldo da minha conta é :" + conta.getSaldo());

//            ArithmeticException arithmeticException =new ArithmeticException("Divisão por 0 não é possivel"); // Lançando uma exceção
//            throw arithmeticException;

        }
//        catch (ArithmeticException|NullPointerException ex) { // muti-catch > tratamento para vários erros esperados
//            System.out.println("O motivo do erro é : " + ex.getMessage());
//
//        }
        catch (RuntimeException ex){ // erro tratado pela classe generica Runtime
            System.out.println(ex.getMessage());
        }
        finally { //sera executado sempre (mais utilizado para fechar conexões)
            System.out.println("Mesmo com o erro tratado ou não esse bloco sempre sera executado");
        }
        System.out.println("Agora o programa continua mesmo depois do erro.");
    }
}
