import prova1.VerificarFinalString;
import prova2.view.Menu;

public class Main {
    public static void main(String[] args) {
        VerificarFinalString verificarFinalString = new VerificarFinalString();

        System.out.println(verificarFinalString.verifica("proaaaaaaagramação", "ãoproaaaagrama"));
        System.out.println(verificarFinalString.verifica("olá", "mundo"));
        System.out.println(verificarFinalString.verifica("dontuseia", "iamworld"));
        System.out.println(verificarFinalString.verifica("aa", "a"));

        Menu.show();

        System.exit(0);

    }
}