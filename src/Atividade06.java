import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.print("Qual numero deseja procurar? ");
        int procurado = sc.nextInt();
        boolean achou = false;

        // Desafio extra: mostra todas as posicoes (posicao = indice + 1)
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == procurado) {
                System.out.println("Numero encontrado na posicao " + (i + 1) + ".");
                achou = true;
            }
        }

        if (!achou) {
            System.out.println("Numero nao encontrado.");
        }
    }
}
