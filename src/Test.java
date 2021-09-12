import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        System.out.println("Test");


        int[] inputNumbers = new int[] { 2454,4, 1, 565, 231};

        for(int no:inputNumbers) {
            System.out.println("The entry is " + no);
        }



        Arrays.sort(inputNumbers);

        for(int no:inputNumbers) {
            System.out.println("The sorted entry is " + no);
        }
    }
}
