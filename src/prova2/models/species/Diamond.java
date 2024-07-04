package prova2.models.species;

import prova2.models.Planet;
import prova2.models.enums.DangerLevel;
import prova2.models.species.baseclass.Specie;

public class Diamond extends Specie {
    private final Long diamonds;

    public Diamond(Long diamonds, Planet planet, DangerLevel dangerLevel) {
        super(planet, dangerLevel);
        this.diamonds = diamonds;
    }

    @Override
    public String getSpecieName() {
        return this.getClass().getSimpleName();
    }

    @Override
    public Long getDamage() {
        return diamonds * 500;
    }

}
