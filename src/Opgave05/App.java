package Opgave05;

import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) {
        ArrayList <String> theOfficeCast = new ArrayList<>();
        theOfficeCast.add("Michael Scott"); theOfficeCast.add("Dwight");
        Series theOffice = new Series("The Office", theOfficeCast);
        theOffice.createEpisode(1, new ArrayList<>(Collections.singleton("Jim Carrey")), 20);
        theOffice.createEpisode(2, new ArrayList<>(Collections.singleton("Will Ferral")), 40);

        System.out.println("Længden på alle episoder er: " + theOffice.totalLength());
        System.out.println("Gæsteskuespillerne på alle episoder er: " + theOffice.getGuestActors());
    }
}
