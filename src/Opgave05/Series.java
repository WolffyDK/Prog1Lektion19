package Opgave05;

import java.util.ArrayList;

public class Series {
    private String title;
    private ArrayList<String> cast;
    private final ArrayList<Episode> episodes = new ArrayList<>();


    public Series(String title, ArrayList<String> cast) {
        this.title = title;
        this.cast = cast;
    }

    public ArrayList<Episode> getEpisodes(){
        return new ArrayList<>(episodes);
    }

    public Episode createEpisode (int number, ArrayList<String> guestActors, int lengthMinutes){
        Episode episode = new Episode(number, guestActors, lengthMinutes);
        episodes.add(episode);
        return episode;
    }

    public void removeEpisode (Episode episode){
        episodes.remove(episode);
    }

    public int totalLength (){
        int total = 0;
        for (Episode episode : episodes){
            total+=episode.getLengthMinutes();
        }
        return total;
    }

    public ArrayList<String> getGuestActors(){
        ArrayList <String> allGuests = new ArrayList<>();
        for (Episode episode : episodes){
            allGuests.addAll(episode.getGuestActors());
        }
        return allGuests;
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<String> getCast() {
        return cast;
    }
}
