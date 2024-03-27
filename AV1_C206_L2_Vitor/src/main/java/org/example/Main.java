package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Arena Areninha = new Arena();
        Areninha.nome = "Arena Rap";
        Areninha.lugar = "Belo Horizonte";

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Seleciona uma opcao: \n" +
                    "1. Add Rapper\n" +
                    "2. Mostrar info Arena e Rappers\n" +
                    "3. Mostrar rappers que tem microfone dourado\n" +
                    "4. Mostrar o ranking da batalha\n" +
                    "5. Sair");
            int userInput = sc.nextInt();
            sc.nextLine();

            switch (userInput) {
                case 1:
                    Rapper novoRapper = new Rapper();

                    System.out.println("Nome: ");
                    novoRapper.nome = sc.nextLine();

                    System.out.println("Nota: ");
                    novoRapper.nota = sc.nextFloat();

                    System.out.println("Idade: ");
                    novoRapper.idade = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Material do microfone: (Dourado, madeira, plástico)");
                    novoRapper.microfone.material = sc.nextLine();

                    Areninha.addRapper(novoRapper);
                    break;
                case 2:
                    Areninha.mostrarInfos();
                    break;
                case 3:
                    Areninha.microfoneDou();
                    break;
                case 4:
                    Areninha.Ranking();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("???");
                    break;
            }
        }
    }
}
