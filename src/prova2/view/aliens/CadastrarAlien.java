package prova2.view.aliens;

import prova2.models.Alien;
import prova2.models.species.baseclass.Specie;
import prova2.services.AlienService;
import prova2.services.SpecieService;
import prova2.utils.ScanValidation;

import java.time.LocalDateTime;
import java.util.Scanner;

public class CadastrarAlien {
    public static void show(Scanner sc) {
        AlienService alienService = new AlienService();
        System.out.println("Digite o nome do alien: ");
        String nome = sc.nextLine();
        System.out.println("Escolha a especie do alien: ");
        Specie specie = null;
        while (true) {
            for (int i = 0; i < SpecieService.species.size(); i++) {
                System.out.println(i + " - " + SpecieService.species.get(i).getSpecieName());
            }
            System.out.println("Digite o id da specie");
            int idSpecie = ScanValidation.getValidIntInput(sc);
            if (idSpecie > SpecieService.species.size() || SpecieService.species.get(idSpecie) == null) {
                System.out.println("Id inválido");
                continue;
            }
            specie = SpecieService.species.get(idSpecie);
            break;

        }
        LocalDateTime joinDate = LocalDateTime.now();
        Alien alien = AlienService.createAlien(nome, specie, joinDate);
        if (alienService.add(alien)) {
            System.out.println("Alien cadastrado com sucesso!");
            return;
        }
        System.out.println("Ocorreu um erro, tente novamente");

    }
}
