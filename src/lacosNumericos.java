
public class lacosNumericos {

    private static void main(String[] args){
        // repeat 1 2 3 4 5 6 7 8 9 10

        int loopTimes = 10;
        for (int i = 0; i < loopTimes; i++) {
            System.out.println("Loop" + i);
        }

        int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };

        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Loop" + i);
        }

    }
}
