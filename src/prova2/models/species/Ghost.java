package prova2.models.species;

import prova2.models.Planet;
import prova2.models.enums.DangerLevel;
import prova2.models.species.baseclass.Specie;
import prova2.models.species.enums.DeathCause;

public class Ghost extends Specie {
    private final DeathCause deathCause;

    public Ghost(DeathCause deathCause, Planet planet, DangerLevel dangerLevel) {
        super(planet, dangerLevel);
        this.deathCause = deathCause;
    }

    @Override
    public String getSpecieName() {
        return this.getClass().getSimpleName();
    }

    @Override
    public Long getDamage() {
        return this.deathCause.getCauseValue() * 200;
    }
}
