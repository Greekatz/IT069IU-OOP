package Lab6.ex1;

public class Main {
    public static void main(String[] args) {
        MyPair<String, Integer> anders = new MyPair<>("Anders", 13);
        // It does not allow
        MyPair<String, Double> phoenix = new MyPair<>("Phoneix", 39.7);
        MyPair<String, Integer>[] grades = new MyPair[5];
        grades[0] = new MyPair<>("Hung", 100);
        grades[1] = new MyPair<>("Như",0);
        grades[2] = new MyPair<>("Luffytaro", 50);
        grades[3] = new MyPair<>("ThyGiang", 0);
        grades[4] = new MyPair<>("Zoro", 90);

        for (MyPair eachgrade:grades) {
            System.out.println(eachgrade.toString());
        }

        System.out.println(grades[0].Swap());

        // g)
        MyPair<MyPair<Integer, Integer>, String> appointment = new MyPair<>(new MyPair<>(1, 2),"OOP");
        System.out.println(appointment.Fst.Snd);


    }
}
