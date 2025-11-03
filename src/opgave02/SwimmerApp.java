package opgave02;

import opgave02.model.Swimmer;
import opgave02.model.TrainingPlan;

import java.util.ArrayList;

public class SwimmerApp {

    public static void main(String[] args) {
        //Svømmer Jan
        ArrayList<Double> lapTimeJan = new ArrayList<>();
        lapTimeJan.add(1.02); lapTimeJan.add(1.06);
        Swimmer janSvømmer = new Swimmer("Jan", 2001, lapTimeJan, "AGF");
        //Svømmer Bo
        ArrayList<Double> lapTimeBo = new ArrayList<>();
        lapTimeJan.add(1.01); lapTimeJan.add(1.03);
        Swimmer boSvømmer = new Swimmer("Bo", 2000, lapTimeJan, "VFF");
        // opretter en traningsplan
        TrainingPlan planA = new TrainingPlan('A', 10, 8);
        planA.addSwimmer(boSvømmer);
        planA.addSwimmer(janSvømmer);

        System.out.println("Svømmere i plan A:");
     for (Swimmer s: planA.getSwimmers()){
         System.out.println(s.getName() + " (" + s.getClub() + ") - Bedste tid: " + s.bestLapTime());
     }

    }

}