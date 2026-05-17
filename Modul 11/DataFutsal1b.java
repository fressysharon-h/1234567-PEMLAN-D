import java.util.Arrays;
import java.util.Collections;


public class DataFutsal1b {


    public static void main(String[] args) {


        Integer[] beratA = {50, 60, 56, 55, 60, 70, 66, 56, 72, 56};


        Integer[] beratB = {66, 60, 59, 58, 58, 71, 68, 68, 65, 60};


        System.out.println("=== TIM A ===");


        Arrays.sort(beratA);
        System.out.println("Ascending : " + Arrays.toString(beratA));


        Arrays.sort(beratA, Collections.reverseOrder());
        System.out.println("Descending: " + Arrays.toString(beratA));


        System.out.println("\n=== TIM B ===");


        Arrays.sort(beratB);
        System.out.println("Ascending : " + Arrays.toString(beratB));


        Arrays.sort(beratB, Collections.reverseOrder());
        System.out.println("Descending: " + Arrays.toString(beratB));
    }
}

