package prova2.services;


import prova2.models.Alien;
import prova2.models.enums.DangerLevel;
import prova2.models.species.baseclass.Specie;
import prova2.services.interfaces.IDAO;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AlienService implements IDAO<Alien> {
    private static Long counter = 0L;
    public static final List<Alien> aliens = new ArrayList<>();

    public static Alien createAlien(String name, Specie specie, LocalDateTime joinDate) {
        return new Alien(++counter, name, specie, joinDate);
    }

    @Override
    public boolean add(Alien alien) {
        aliens.add(alien);
        DangerLevel alienDangerLevel = alien.getSpecie().getDangerLevel();
        if (alienDangerLevel.equals(DangerLevel.PERIGO) || alienDangerLevel.equals(DangerLevel.CRITICO)) {
            new QuarentineService().add(alien);
        }
        return true;
    }

    @Override
    public boolean remove(Long id) {
        return aliens.removeIf(alien -> Objects.equals(alien.getId(), id));
    }

    @Override
    public Alien findById(Long id) {
        return aliens.stream().filter(alien -> Objects.equals(alien.getId(), id)).findFirst().orElse(null);
    }

}
