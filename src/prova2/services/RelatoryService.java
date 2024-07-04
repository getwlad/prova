package prova2.services;

import prova2.models.Alien;

import java.time.LocalDateTime;
import java.util.List;

public class RelatoryService {
    public List<Alien> getAliensJoinedLastMonth(Long months) {
        return AlienService.aliens.stream()
                .filter(alien -> alien.getJoinDate().isAfter(LocalDateTime.now().minusMonths(months))).toList();
    }
}
