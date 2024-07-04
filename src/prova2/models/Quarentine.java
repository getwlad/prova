package prova2.models;

import java.util.ArrayList;
import java.util.List;

public class Quarentine {
    private List<Alien> aliens = new ArrayList<>();

    public Quarentine() {
    }

    public List<Alien> getAliens() {
        return aliens;
    }

    public void setAliens(List<Alien> aliens) {
        this.aliens = aliens;
    }
}
