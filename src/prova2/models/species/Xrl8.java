package prova2.models.species;

import prova2.models.Planet;
import prova2.models.enums.DangerLevel;
import prova2.models.species.baseclass.Specie;

public class Xrl8 extends Specie {
    private final Long speed;

    public Xrl8(Long speed, Planet planet, DangerLevel dangerLevel) {
        super(planet, dangerLevel);
        this.speed = speed;
    }

    @Override
    public String getSpecieName() {
        return this.getClass().getSimpleName();
    }

    @Override
    public Long getDamage() {
        return speed * 100;
    }
}
