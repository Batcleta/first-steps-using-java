public class funcoes {

    public static void main(String[] args){
        String nome = "Washington";
        saudacao(nome);

        int resultado = soma(2,3);
        System.out.println(resultado);
    }

    public static void saudacao (String nome){
        System.out.println("Olá, " + nome);
    }

    public static int soma(int n1, int n2){
        return n1 + n2;
    };
}
