import java.util.ArrayList;
import java.util.Collections;

public class DataFutsal2c {

    public static void main(String[] args) {

        ArrayList<Integer> timA = new ArrayList<Integer>();

        timA.add(50);
        timA.add(60);
        timA.add(56);
        timA.add(55);
        timA.add(60);
        timA.add(70);
        timA.add(66);
        timA.add(56);
        timA.add(72);
        timA.add(56);

        Collections.sort(timA);

        int jumlah56 = Collections.frequency(timA, 56);
        int jumlah53 = Collections.frequency(timA, 53);

        System.out.println("Data Tim A : " + timA);

        System.out.println("\nJumlah pemain dengan berat 56 kg : " + jumlah56);
        System.out.println("Jumlah pemain dengan berat 53 kg : " + jumlah53);
    }
}

