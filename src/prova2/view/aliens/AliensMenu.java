package prova2.view.aliens;

import prova2.models.Alien;
import prova2.services.AlienService;
import prova2.services.QuarentineService;
import prova2.utils.ScanValidation;

import java.util.Scanner;

public class AliensMenu {
    public static void show(Scanner sc) {
        AlienService alienService = new AlienService();
        QuarentineService quarentineService = new QuarentineService();
        while (true) {
            System.out.println("---Gerenciamento de Aliens---");
            System.out.println("O que você deseja fazer?");
            System.out.println(
                    """
                            1 - Cadastrar Alien.
                            2 - Visualizar todos os aliens.
                            3 - Colocar alien em quarentena.
                            4 - Retirar alien de quarentena.
                            5 - Retornar ao menu anterior.
                            """
            );
            int escolha = ScanValidation.getValidIntInput(sc);
            switch (escolha) {
                case 1: {
                    CadastrarAlien.show(sc);
                    break;
                }
                case 2: {
                    for (Alien alien : AlienService.aliens) {
                        alien.print();
                    }
                    break;
                }
                case 3: {
                    while (true) {
                        System.out.println("Digite o id do alien: ");
                        for (Alien alien : AlienService.aliens) {
                            System.out.println("ID: " + alien.getId());
                            System.out.println("Nome: " + alien.getName());
                            System.out.println("Nivel de periculosidade: " + alien.getSpecie().getDangerLevel());
                            System.out.println("Dano que pode causar: " + alien.getSpecie().getDamage());
                        }
                        int idAlien = ScanValidation.getValidIntInput(sc);
                        Alien alien = alienService.findById((long) idAlien);
                        if (alien == null) {
                            System.out.println("ID inválido, alien não encontrado");
                            continue;
                        }
                        if (QuarentineService.isAlienInQuarentine(alien)) {
                            System.out.println("Alien já está em quarentena");
                            continue;
                        }
                        quarentineService.add(alien);
                        System.out.println("Alien colocado em quarentena com sucesso");
                        break;
                    }
                    break;
                }
                case 4: {
                    while (true) {
                        System.out.println("Digite o id do alien: ");
                        for (Alien alien : QuarentineService.quarentine.getAliens()) {
                            System.out.println("ID: " + alien.getId());
                            System.out.println("Nome: " + alien.getName());
                            System.out.println("Nivel de periculosidade: " + alien.getSpecie().getDangerLevel());
                            System.out.println("Dano que pode causar: " + alien.getSpecie().getDamage());
                        }
                        int idAlien = ScanValidation.getValidIntInput(sc);
                        if (quarentineService.remove((long) idAlien)) {
                            System.out.println("Alien removido da quarentena com sucesso");
                            break;
                        }
                        System.out.println("Id inválido");
                    }
                    break;
                }
                case 5:
                    return;
                default:
                    break;
            }
        }
    }
}
