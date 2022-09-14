public class exercicio02 {

    public static void main(String[] args){
        int operadorTabuada = 5;
        int maximoDePosicoes = 10;
        String tabuada = imprimirTabuada(operadorTabuada, maximoDePosicoes);
    }
    public static String imprimirTabuada(int operador, int maximo){

        String resultado = "";
        System.out.println("Tabuada do " + operador);
        System.out.println("----------------");
        System.out.println(" ");

        for (int i = 1; i <= maximo; i++) {
            System.out.println( operador + " x " + i + " = " + (operador * i));
        };

        return resultado;
    };
};
