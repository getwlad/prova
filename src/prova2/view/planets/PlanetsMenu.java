package prova2.view.planets;

import prova2.models.Planet;
import prova2.services.PlanetService;
import prova2.utils.ScanValidation;

import java.util.Scanner;

public class PlanetsMenu {
    public static void show(Scanner sc) {
        while (true) {
            System.out.println("---Bem vindo ao gerenciamento de Planetas---");
            System.out.println("O que você deseja fazer?");
            System.out.println("1 - Visualizar planetas");
            System.out.println("2 - Retornar ao menu anterior");
            int escolha = ScanValidation.getValidIntInput(sc);
            switch (escolha) {
                case 1: {
                    for (Planet planet : PlanetService.planets) {
                        System.out.println("---------");
                        planet.print();
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
