public class VAR_BOOLEAN {
    // escrever main para facilitar
    static void main() {
        boolean hetero = false;
        byte idadejorge = 20;

        // escrever sout para facilitar
        System.out.println(hetero);
        System.out.println(idadejorge > 19);

        System.out.println(hetero == true && idadejorge >21);

        boolean usuarioativomenorque21 = hetero == true && idadejorge < 21;
        System.out.println("O usuario esta ativo e tem menos que 21 anos ? " + usuarioativomenorque21 );
    }
}
