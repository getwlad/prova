package prova2.models.species.baseclass;

import prova2.models.Planet;
import prova2.models.enums.DangerLevel;
import prova2.models.species.interfaces.SpecieAvaliation;

public abstract class Specie implements SpecieAvaliation {
    private Planet planet;
    private DangerLevel dangerLevel;

    public Specie(Planet planet, DangerLevel dangerLevel) {
        this.planet = planet;
        this.dangerLevel = dangerLevel;
    }

    public void print() {
        this.getPlanet().print();
        System.out.println("Nível de periculosidade base: " + this.getDangerLevel());
        System.out.println("Dano que pode causar:" + this.getDamage());
    }

    public Planet getPlanet() {
        return planet;
    }

    public void setPlanet(Planet planet) {
        this.planet = planet;
    }

    public DangerLevel getDangerLevel() {
        return dangerLevel;
    }

    public void setDangerLevel(DangerLevel dangerLevel) {
        this.dangerLevel = dangerLevel;
    }
}
