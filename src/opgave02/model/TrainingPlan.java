package opgave02.model;

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
    public void addSwimmer (Swimmer swimmer){
		if (!Swimmers.contains(swimmer)){
			Swimmers.add(swimmer);
		}
	}

	public void removeSwimmer (Swimmer swimmer){
		if (!Swimmers.contains(swimmer)){
			Swimmers.remove(swimmer);
		}
	}

    public TrainingPlan(char level, int weeklyWaterHours, int weeklyStrengthHours) {
        this.level = level;
        this.weeklyWaterHours = weeklyWaterHours;
        this.weeklyStrengthHours = weeklyStrengthHours;
    }

    public char getLevel() {
        return level;
    }

    public void setLevel(char niveau) {
        this.level = niveau;
    }

    public int getWeeklyStrengthHours() {
        return weeklyStrengthHours;
    }

    public void setWeeklyStrengthHours(int weeklyStrengthHours) {
        this.weeklyStrengthHours = weeklyStrengthHours;
    }

    public int getWeeklyWaterHours() {
        return weeklyWaterHours;
    }

    public void setWeeklyWaterHours(int weeklyWaterHours) {
        this.weeklyWaterHours = weeklyWaterHours;
    }

}