import java.util.Scanner;

public class Atividade07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int LIMITE = 80;
        int[] vel = new int[10];

        for (int i = 0; i < vel.length; i++) {
            System.out.print("Velocidade do veiculo " + (i + 1) + " (km/h): ");
            vel[i] = entrada.nextInt();
        }

        int acima = 0;
        int maior = vel[0];

        System.out.println();
        for (int i = 0; i < vel.length; i++) {
            if (vel[i] > LIMITE) {
                System.out.println("Veiculo " + (i + 1) + ": " + vel[i] + " km/h - ACIMA DO LIMITE");
                acima++;
            } else {
                System.out.println("Veiculo " + (i + 1) + ": " + vel[i] + " km/h");
            }

            if (vel[i] > maior) {
                maior = vel[i];
            }
        }

        System.out.println("Total acima do limite: " + acima);
        // Desafio extra
        System.out.println("Maior velocidade registrada: " + maior + " km/h");
    }
}
