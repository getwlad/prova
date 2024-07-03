package prova1;

public class VerificarFinalString {
    public boolean verifica(String palavraDoisUltimos, String  palavraDoisPrimeiros){
        if (palavraDoisPrimeiros.length() <= 1 || palavraDoisUltimos.length() <= 1){
            return false;
        }

        if(palavraDoisUltimos.length() > 2){
            palavraDoisUltimos = palavraDoisUltimos.substring(palavraDoisUltimos.length() - 2);
        }

        palavraDoisPrimeiros = palavraDoisPrimeiros.substring(0, 2);

        return palavraDoisUltimos.equals(palavraDoisPrimeiros);
    }
}
