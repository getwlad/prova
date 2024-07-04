package prova2.models;

import prova2.models.species.baseclass.Specie;
import prova2.services.QuarentineService;

import java.time.LocalDateTime;

public class Alien {
    private Long id;
    private String name;
    private Specie specie;
    private LocalDateTime joinDate;


    public Alien(Long id, String name, Specie specie, LocalDateTime joinDate) {
        this.id = id;
        this.name = name;
        this.specie = specie;
        this.joinDate = joinDate;
    }

    public void print() {
        System.out.printf(
                """         
                        \nId: %d
                        Nome: %s
                        """, this.getId(), this.getName()
        );
        this.getSpecie().print();
        System.out.println("Está em quarentena: " + (QuarentineService.isAlienInQuarentine(this) ? "Sim" : "Não"));
        System.out.println("Data de entrada: " + this.getJoinDate());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Specie getSpecie() {
        return specie;
    }

    public void setSpecie(Specie specie) {
        this.specie = specie;
    }


    public LocalDateTime getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalDateTime joinDate) {
        this.joinDate = joinDate;
    }


}
