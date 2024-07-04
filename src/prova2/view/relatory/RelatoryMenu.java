package prova2.view.relatory;

import prova2.models.Alien;
import prova2.services.RelatoryService;
import prova2.utils.ScanValidation;

import java.util.Scanner;

public class RelatoryMenu {
    public static void show(Scanner sc) {
        while (true) {
            RelatoryService relatoryService = new RelatoryService();
            System.out.println("---Bem vindo ao gerenciamento de Planetas---");
            System.out.println("O que você deseja fazer?");
            System.out.println("1 - Visualizar aliens registrados nos ultimos meses");
            System.out.println("2 - Retornar ao menu anterior");
            int escolha = ScanValidation.getValidIntInput(sc);
            switch (escolha) {
                case 1: {
                    System.out.println("Digite a quantidade de meses");
                    int meses = ScanValidation.getValidIntInput(sc);
                    if (meses <= 0) {
                        System.out.println("Quantidade inválida");
                        continue;
                    }
                    for (Alien alien : relatoryService.getAliensJoinedLastMonth((long) meses)) {
                        alien.print();
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
