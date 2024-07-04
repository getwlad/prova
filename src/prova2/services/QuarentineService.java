package prova2.services;

import prova2.models.Alien;
import prova2.models.Quarentine;
import prova2.models.enums.DangerLevel;
import prova2.services.interfaces.IDAO;

import java.util.Objects;

public class QuarentineService implements IDAO<Alien> {
    public final static Quarentine quarentine = new Quarentine();


    @Override
    public boolean add(Alien alien) {
        if (alien.getSpecie().getDangerLevel().equals(DangerLevel.PACIFICO)) {
            System.out.println("Você está colocando um alien pacífico em quarentena!!");
        }
        return quarentine.getAliens().add(alien);

    }

    @Override
    public boolean remove(Long id) {
        Alien alien = findById(id);
        if (alien == null) return false;
        if (alien.getSpecie().getDangerLevel().equals(DangerLevel.CRITICO) || alien.getSpecie().getDangerLevel().equals(DangerLevel.PERIGO)) {
            System.out.println("Este alien é perigoso demais pra ser removido da quarentena");
            return false;
        }
        return quarentine.getAliens().remove(alien);
    }

    @Override
    public Alien findById(Long id) {
        return quarentine.getAliens().stream().filter(alien -> Objects.equals(alien.getId(), id)).findFirst().orElse(null);
    }

    public static boolean isAlienInQuarentine(Alien alien) {
        return quarentine.getAliens().contains(alien);
    }
}
