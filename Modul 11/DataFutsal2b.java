import java.util.ArrayList;
import java.util.Collections;

public class DataFutsal2b {

    public static void main(String[] args) {

        ArrayList<Integer> timB = new ArrayList<Integer>();

        timB.add(170);
        timB.add(167);
        timB.add(165);
        timB.add(166);
        timB.add(168);
        timB.add(175);
        timB.add(172);
        timB.add(171);
        timB.add(168);
        timB.add(169);

        Collections.sort(timB);

        int jumlah168 = Collections.frequency(timB, 168);
        int jumlah160 = Collections.frequency(timB, 160);

        System.out.println("Data Tim B : " + timB);

        System.out.println("\nJumlah pemain dengan tinggi 168 cm : " + jumlah168);
        System.out.println("Jumlah pemain dengan tinggi 160 cm : " + jumlah160);
    }
}
