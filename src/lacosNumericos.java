import java.util.Arrays;
import java.util.List;

public class lacosNumericos {
    public static void main(String[] args){
        // repeat 1 2 3 4 5 6 7 8 9 10

        //int loopTimes = 10;
        //for (int i = 0; i < loopTimes; i++) {
        //    System.out.println("Loop" + i + 1); // whrong way
        //}
        //System.out.println(" ");
        //System.out.println("_________ USING ARRAY _________");
        //System.out.println(" ");

        //int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };

        //for (int i = 0; i < intArray.length; i++) {
        //    System.out.println("Loop" + (i + 1));
        //}

        //System.out.println(" ");
        //System.out.println("_________ USING ARRAY _________");
        //System.out.println(" ");

        //List<Integer> loopNumbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        //loopNumbers.forEach(number->System.out.println(number));

        //System.out.println(" ");
        //System.out.println("_________ USING ARRAY _________");
        //System.out.println(" ");

        //List<String> stringList = Arrays.asList("teste", "teste");
        //stringList.forEach(text-> System.out.println(text));

        // Taboada

        List<Integer> tabuada = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        tabuada.forEach(range-> {
            System.out.println(" ");
            System.out.println("Tabuada do: " + range);
            for (int i = 1; i <= 10; i++) {
                System.out.println(range + " x " + i + " = " + (range*i));
            }
            System.out.println(" ");
            System.out.println("__________________ ");
        });
    }
}
