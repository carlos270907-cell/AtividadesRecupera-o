import java.util.Scanner;

public class Atividade08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[5];
        int[] pontos = new int[5];

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Nome do jogador " + (i + 1) + ": ");
            nomes[i] = sc.nextLine();
            System.out.print("Pontuacao de " + nomes[i] + ": ");
            pontos[i] = sc.nextInt();
            sc.nextLine(); // limpa o Enter que sobrou no buffer
        }

        int posMaior = 0;

        System.out.println();
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i] + " - " + pontos[i] + " pontos");
            if (pontos[i] > pontos[posMaior]) {
                posMaior = i;
            }
        }

        System.out.println("Campeao: " + nomes[posMaior] + " - " + pontos[posMaior] + " pontos");
    }
}
