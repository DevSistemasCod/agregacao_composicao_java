package principal;

import entidades.Automovel;
import entidades.Motor;
import entidades.Pneu;

import java.util.Scanner;

public class PrincipalTesteAuto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando array de pneus
        Pneu[] pneus = new Pneu[4]; // para um carro com 4 pneus
        for (int i = 0; i < pneus.length; i++) {
            System.out.println("Digite a marca do pneu " + (i + 1) + ":");
            String marca = scanner.nextLine();

            System.out.println("Digite a pressão do pneu " + (i + 1) + ":");
            float pressao = scanner.nextFloat();
            scanner.nextLine(); // consumir o enter

            pneus[i] = new Pneu(marca, pressao);
        }

        // Motor fixo por enquanto
        Motor motor = new Motor(42, 90);

        // Automóvel
        Automovel automovel = new Automovel("Fiat", 1000, motor, pneus);

        System.out.println("\nInformações do Automóvel:");
        System.out.println(automovel.toString());

        scanner.close();
    }
}
