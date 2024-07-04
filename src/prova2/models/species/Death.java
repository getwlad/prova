package prova2.models.species;

import prova2.models.Planet;
import prova2.models.enums.DangerLevel;
import prova2.models.species.baseclass.Specie;

public class Death extends Specie {
    public Death(Planet planet, DangerLevel dangerLevel) {
        super(planet, dangerLevel);
    }

    @Override
    public String getSpecieName() {
        return this.getClass().getSimpleName();
    }

    @Override
    public Long getDamage() {
        return Long.MAX_VALUE;
    }

}
