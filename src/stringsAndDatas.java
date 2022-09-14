import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class stringsAndDatas {

    public static void main(String[] args){
        String nome = "Washington";

        //System.out.println("nome: " + nome);
        //System.out.println("toLowerCase: " + nome.toLowerCase());
        //System.out.println("toUpperCase: " + nome.toUpperCase());
        //System.out.println("concat: " + nome.concat("teste"));
        //System.out.println("length: " + nome.length());

        //System.out.println(" ");
        //System.out.println("-----------------------");
        //System.out.println("Comparing");
        //System.out.println(" ");
        //comparing

        //String nomeOutro = "washington";
        //System.out.println("equals: " + nome.equals(nomeOutro));
        //System.out.println("equalsIgnoreCase: " + nome.equalsIgnoreCase(nomeOutro)); //ignore case sensitivity
        //System.out.println("== (cond): " + nome == nomeOutro);


        //dATAS iso8601

        // Olá, { nome }. Hoje é { diaDaSemana }, { saudacao }

        LocalDate hoje = LocalDate.now();
        //System.out.println(hoje);
        //System.out.println(hoje.getDayOfMonth());
        Locale Brasil = new Locale("pt", "BR");
        //System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, Brasil));
        String diaDaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, Brasil);
        String saudacao;

        LocalDateTime agora =  LocalDateTime.now();
        int now = agora.getHour();

        if (now > 0 && now < 12) {
            saudacao = "Bom dia";
        }else if (now >= 12 && now < 18 ){
            saudacao = "Boa tarde";
        }else{
            saudacao = "Boa noite";
        }

        //System.out.println("Olá " + nome + ". Hoje é " + diaDaSemana + ", " + saudacao.toUpperCase());
        System.out.printf("olá %s. Hoje é %s, %s%n", nome, diaDaSemana, saudacao.toUpperCase());


        //System.out.println(hoje.getDayOfYear());
        //System.out.println(hoje.getChronology());


    }
}
