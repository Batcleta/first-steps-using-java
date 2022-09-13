public class main {
    public static void someBasics(String[] args){

        short birthDate = 1990;
        short thisYear = 2022;
        int age = thisYear - birthDate;

        String saudacao = "olá";
        String name = "washington Ferreira";
        String congrats = "Parabéns!! Hoje, você completa "+age+" anos de idade";

        System.out.println(saudacao + " " + name + ". " + congrats);

        name = "Artur lambe saco";
        System.out.println(saudacao + " " + name + ". " + congrats);


        int a;
        int b = 2;
        a = 3;

        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        //float divisao = a / b;  O resultado da operação será um float de inteiros 1.0
        float divisao = (float) a / b; // O resultado da operação será um float 1.5

        // É necessário transformar a operação de números que podem dar resultados reais
        // em float. Do contrário, o java interpreta que o resultado, mesmo atribuido a uma
        // variável float, sempre será um inteiro. ou seja, será 1.0 ao invés de 1.5

        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(multiplicacao);
        System.out.println(divisao);

    }
}


