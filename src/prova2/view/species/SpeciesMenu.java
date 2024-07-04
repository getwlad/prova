package prova2.view.species;

import prova2.models.species.baseclass.Specie;
import prova2.services.SpecieService;
import prova2.utils.ScanValidation;

import java.util.Scanner;

public class SpeciesMenu {
    public static void show(Scanner sc) {
        while (true) {
            System.out.println("---Bem vindo ao gerenciamento de Especies---");
            System.out.println("O que você deseja fazer?");
            System.out.println("1 - Visualizar especies");
            System.out.println("2 - Retornar ao menu anterior");
            int escolha = ScanValidation.getValidIntInput(sc);
            switch (escolha) {
                case 1: {
                    for (Specie specie : SpecieService.species) {
                        System.out.println("---------");
                        specie.print();
                        System.out.println("---------");
                    }
                    break;
                }
                case 2: {
                    return;
                }
                default: {
                    System.out.println("Escolha inválida");
                }
            }
        }
    }
}
