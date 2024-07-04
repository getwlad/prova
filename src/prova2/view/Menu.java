package prova2.view;

import prova2.models.Alien;
import prova2.services.QuarentineService;
import prova2.utils.ScanValidation;
import prova2.view.aliens.AliensMenu;
import prova2.view.planets.PlanetsMenu;
import prova2.view.relatory.RelatoryMenu;
import prova2.view.species.SpeciesMenu;

import java.util.Scanner;

public class Menu {
    public static void show() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("---Bem vindo ao Sistema---");
            System.out.println("O que você deseja fazer hoje?");
            System.out.println(
                    """
                            1 - Gerenciar todos os aliens.
                            2 - Visualizar aliens em quarentena.
                            3 - Gerenciar espécies.
                            4 - Gerenciar planetas.
                            5 - Visualizar relatórios.
                            6 - Fechar aplicação.
                            """
            );
            int escolha = ScanValidation.getValidIntInput(sc);
            switch (escolha) {
                case 1: {
                    AliensMenu.show(sc);
                    break;
                }
                case 2: {
                    for (Alien alien : QuarentineService.quarentine.getAliens()) {
                        alien.print();
                    }
                    break;
                }
                case 3:
                    SpeciesMenu.show(sc);
                    break;
                case 4:
                    PlanetsMenu.show(sc);
                    break;
                case 5:
                    RelatoryMenu.show(sc);
                    break;
                case 6: {
                    sc.close();
                    return;
                }
                default:
                    break;
            }
        }

    }
}
