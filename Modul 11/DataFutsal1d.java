import java.util.Arrays;


public class DataFutsal1d {


    public static void main(String[] args) {


        int[] timB = {170, 167, 165, 166, 168, 175, 172, 171, 168, 169};


        int[] timC = Arrays.copyOf(timB, timB.length);


        System.out.println("Data Tim B");
        System.out.println(Arrays.toString(timB));


        System.out.println("\nData Tim C");
        System.out.println(Arrays.toString(timC));
    }
}

