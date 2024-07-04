package prova2.services;

import prova2.models.Planet;
import prova2.services.interfaces.IDAO;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PlanetService implements IDAO<Planet> {
    private static Long counter = 0L;
    public static final List<Planet> planets = new ArrayList<>(
            List.of(
                    createPlanet("Mars"),
                    createPlanet("Venus"),
                    createPlanet("Jupiter")
            )
    );

    public static Planet createPlanet(String name) {
        return new Planet(++counter, name);
    }

    @Override
    public boolean add(Planet alien) {
        return planets.add(alien);
    }

    @Override
    public boolean remove(Long id) {
        return planets.removeIf(planets -> Objects.equals(planets.getId(), id));
    }

    @Override
    public Planet findById(Long id) {
        return planets.stream().filter(planet -> Objects.equals(planet.getId(), id)).findFirst().orElse(null);
    }
}
