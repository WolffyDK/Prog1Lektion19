package opgave04;

import java.util.ArrayList;

/**
 * Models a training plan for a Swimmer
 */
public class TrainingPlan {
    private char level;
    private int weeklyWaterHours;
    private int weeklyStrengthHours;
    //tilføjer linkattribut med navnet persons af typen ArrayList<Person>
    private final ArrayList<Swimmer> Swimmers = new ArrayList<>();

    //Retunerer alle svømmere på planen
    public ArrayList<Swimmer> getSwimmers() {
        return new ArrayList<>(Swimmers);
    }

    //Tilføjer en svømmer til traningsplan
    public Swimmer createSwimmer (String name, int yeargroup, ArrayList<Double> laptimes, String club){
        Swimmer s = new Swimmer(name, yeargroup, laptimes, club);
        Swimmers.add(s);
        return s;
    }

    public void removeSwimmer (Swimmer swimmer){
            Swimmers.remove(swimmer);
    }

    public TrainingPlan(char level, int weeklyWaterHours, int weeklyStrengthHours) {
        this.level = level;
        this.weeklyWaterHours = weeklyWaterHours;
        this.weeklyStrengthHours = weeklyStrengthHours;
    }
}