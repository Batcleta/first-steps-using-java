import java.util.Random;

public class booleans {
    public static void main(String[] args){

        Random gerador = new Random();
        int number = gerador.nextInt(21);
        boolean vidaEFoda = false;

        boolean resultado = number > 10? false : true;

        if (resultado && !vidaEFoda) {
            System.out.println("Deu bom");
        } else {
            System.out.println("Deu ruim");
        }

    }
}
