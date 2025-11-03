package opgave04;

import java.util.ArrayList;

public class SwimmerApp {
    public static void main(String[] args) {
        TrainingPlan planA = new TrainingPlan('A', 10, 8);
        ArrayList<Double> lap1 = new ArrayList<>();
        lap1.add(1.1); lap1.add(1.05);
        Swimmer s1 = planA.createSwimmer("Bo", 2001, lap1, "AGF");
        planA.createSwimmer("Jens", 2000, new ArrayList<>(), "Vff");

        System.out.println("Svømmere på plan A: ");
        for (Swimmer s : planA.getSwimmers()){
            System.out.println(s.getName() + " fra " + s.getClub());
        }

        planA.removeSwimmer(s1);

        System.out.println();
        System.out.println("Svømmere på plan A efter fjernelse: ");
        for (Swimmer s : planA.getSwimmers()){
            System.out.println(s.getName() + " fra " + s.getClub());
        }
    }
}
