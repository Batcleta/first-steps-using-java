import java.util.Arrays;

public class vetores {

    public static void main(String[] args){
        int[] numeros = new int[5];
        String[] textos = {"w", "w", "w", "w", "w"};
        int numeros2[] = {1,2,3,4,5};

        //numeros[0] = 5;
        //numeros[1] = 4;
        //numeros[2] = 3;
        //numeros[3] = 2;
        //numeros[4] = 1;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (5- i);
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        System.out.println(Arrays.toString(textos));

        //Calculo de media simples, maior, menor

        int[] notas = {10, 8, 9, 3, 4, 5, 6};
        int maior = notas[0];
        int menor = notas[0];
        int media = 0;

        for (int i = 0; i < notas.length; i++) {
            if (notas[1] > maior) maior = notas[i];
            if (notas[i] < menor) menor = notas[i];
            media += notas[1];
        }

        System.out.println("maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Media: " + media / notas.length);
    }
}
