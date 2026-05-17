import java.util.Arrays;
import java.util.Collections;


public class DataFutsal1a {


    public static void main(String[] args) {


        Integer[] tinggiA = {168, 170, 165, 168, 172, 170, 169, 165, 171, 166};


        Integer[] tinggiB = {170, 167, 165, 166, 168, 175, 172, 171, 168, 169};


        System.out.println("=== TIM A ===");


        Arrays.sort(tinggiA);
        System.out.println("Ascending : " + Arrays.toString(tinggiA));


        Arrays.sort(tinggiA, Collections.reverseOrder());
        System.out.println("Descending: " + Arrays.toString(tinggiA));


        System.out.println("\n=== TIM B ===");


        Arrays.sort(tinggiB);
        System.out.println("Ascending : " + Arrays.toString(tinggiB));


        Arrays.sort(tinggiB, Collections.reverseOrder());
        System.out.println("Descending: " + Arrays.toString(tinggiB));
    }
}
