import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] gols = new int[8];

        for (int i = 0; i < gols.length; i++) {
            System.out.print("Gols do jogador " + (i + 1) + ": ");
            gols[i] = sc.nextInt();
        }

        int maior = gols[0];
        int jogadorMaior = 1;

        System.out.println();
        for (int i = 0; i < gols.length; i++) {
            System.out.println("Jogador " + (i + 1) + ": " + gols[i] + " gols");
            if (gols[i] > maior) {
                maior = gols[i];
                jogadorMaior = i + 1;
            }
        }

        System.out.println("Maior quantidade de gols: " + maior);
        // Desafio extra
        System.out.println("Jogador que mais marcou: " + jogadorMaior);
    }
}
