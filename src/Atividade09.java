import java.util.Scanner;

public class Atividade09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] sorteados = {5, 12, 23, 31, 44, 58};
        int[] aposta = new int[6];

        for (int i = 0; i < aposta.length; i++) {
            System.out.print("Aposta " + (i + 1) + ": ");
            aposta[i] = entrada.nextInt();
        }

        System.out.print("\nNumeros apostados:");
        for (int i = 0; i < aposta.length; i++) {
            System.out.print(" " + aposta[i]);
        }
        System.out.print("\nNumeros sorteados:");
        for (int i = 0; i < sorteados.length; i++) {
            System.out.print(" " + sorteados[i]);
        }
        System.out.println();

        int acertos = 0;
        String acertados = "";

        // for dentro de for: cada numero apostado e comparado com todos os sorteados
        for (int i = 0; i < aposta.length; i++) {
            for (int j = 0; j < sorteados.length; j++) {
                if (aposta[i] == sorteados[j]) {
                    acertos++;
                    acertados += aposta[i] + " ";
                    break; // nao conta duas vezes se a aposta repetir o numero
                }
            }
        }

        System.out.println("Voce acertou " + acertos + " numeros: " + acertados.trim());
    }
}
