package prova2.services;

import prova2.models.enums.DangerLevel;
import prova2.models.species.Death;
import prova2.models.species.Diamond;
import prova2.models.species.Ghost;
import prova2.models.species.Xrl8;
import prova2.models.species.baseclass.Specie;
import prova2.models.species.enums.DeathCause;

import java.util.List;
import java.util.Random;

public class SpecieService {
    private static final Long counter = 0L;
    public static final List<Specie> species = List.of(
            new Death(PlanetService.planets.get(new Random().nextInt(PlanetService.planets.size())),
                    DangerLevel.CRITICO),
            new Diamond(200L, PlanetService.planets.get(new Random().nextInt(PlanetService.planets.size())),
                    DangerLevel.CRITICO),
            new Ghost(DeathCause.WORST, PlanetService.planets.get(new Random().nextInt(PlanetService.planets.size())),
                    DangerLevel.CRITICO),
            new Xrl8(300L, PlanetService.planets.get(new Random().nextInt(PlanetService.planets.size())),
                    DangerLevel.CRITICO)

    );

}
