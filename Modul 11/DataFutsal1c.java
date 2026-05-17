import java.util.Arrays;

public class DataFutsal1c {

    public static void main(String[] args) {

        int[] tinggiA = {168, 170, 165, 168, 172, 170, 169, 165, 171, 166};
        int[] beratA = {50, 60, 56, 55, 60, 70, 66, 56, 72, 56};

        int[] tinggiB = {170, 167, 165, 166, 168, 175, 172, 171, 168, 169};
        int[] beratB = {66, 60, 59, 58, 58, 71, 68, 68, 65, 60};

        Arrays.sort(tinggiA);
        Arrays.sort(beratA);
        Arrays.sort(tinggiB);
        Arrays.sort(beratB);

        System.out.println("=== TIM A ===");
        System.out.println("Tinggi Minimum : " + tinggiA[0] + " cm");
        System.out.println("Tinggi Maksimum: " + tinggiA[tinggiA.length - 1] + " cm");

        System.out.println("Berat Minimum  : " + beratA[0] + " kg");
        System.out.println("Berat Maksimum : " + beratA[beratA.length - 1] + " kg");

        System.out.println("\n=== TIM B ===");
        System.out.println("Tinggi Minimum : " + tinggiB[0] + " cm");
        System.out.println("Tinggi Maksimum: " + tinggiB[tinggiB.length - 1] + " cm");

        System.out.println("Berat Minimum  : " + beratB[0] + " kg");
        System.out.println("Berat Maksimum : " + beratB[beratB.length - 1] + " kg");
    }
}
