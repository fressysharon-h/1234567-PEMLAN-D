import java.util.ArrayList;

public class DataFutsal2d {

    public static void main(String[] args) {

        ArrayList<Integer> tinggiA = new ArrayList<Integer>();
        ArrayList<Integer> tinggiB = new ArrayList<Integer>();

        ArrayList<Integer> beratA = new ArrayList<Integer>();
        ArrayList<Integer> beratB = new ArrayList<Integer>();

        tinggiA.add(168);
        tinggiA.add(170);
        tinggiA.add(165);
        tinggiA.add(168);
        tinggiA.add(172);
        tinggiA.add(170);
        tinggiA.add(169);
        tinggiA.add(165);
        tinggiA.add(171);
        tinggiA.add(166);

        tinggiB.add(170);
        tinggiB.add(167);
        tinggiB.add(165);
        tinggiB.add(166);
        tinggiB.add(168);
        tinggiB.add(175);
        tinggiB.add(172);
        tinggiB.add(171);
        tinggiB.add(168);
        tinggiB.add(169);

        beratA.add(50);
        beratA.add(60);
        beratA.add(56);
        beratA.add(55);
        beratA.add(60);
        beratA.add(70);
        beratA.add(66);
        beratA.add(56);
        beratA.add(72);
        beratA.add(56);

        beratB.add(66);
        beratB.add(60);
        beratB.add(59);
        beratB.add(58);
        beratB.add(58);
        beratB.add(71);
        beratB.add(68);
        beratB.add(68);
        beratB.add(65);
        beratB.add(60);

        System.out.println("Tinggi badan yang sama:");

        for (int i = 0; i < tinggiA.size(); i++) {
            if (tinggiB.contains(tinggiA.get(i))) {
                System.out.println(tinggiA.get(i) + " cm");
            }
        }

        System.out.println("\nBerat badan yang sama:");

        for (int i = 0; i < beratA.size(); i++) {
            if (beratB.contains(beratA.get(i))) {
                System.out.println(beratA.get(i) + " kg");
            }
        }
    }
}
