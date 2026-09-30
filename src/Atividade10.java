import java.util.Locale;
import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); // notas com ponto (8.5)
        final int N = 10;
        String[] nomes = new String[N];
        double[] notas = new double[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Nome do aluno " + (i + 1) + ": ");
            nomes[i] = entrada.nextLine();
            System.out.print("Nota de " + nomes[i] + ": ");
            notas[i] = entrada.nextDouble();
            entrada.nextLine(); // limpa o Enter que sobrou no buffer
        }

        double soma = 0;
        int aprovados = 0;
        int reprovados = 0;
        int posMaior = 0;
        int posMenor = 0;

        System.out.println();
        for (int i = 0; i < N; i++) {
            if (notas[i] >= 6) {
                System.out.println(nomes[i] + " - " + notas[i] + " - APROVADO");
                aprovados++;
            } else {
                System.out.println(nomes[i] + " - " + notas[i] + " - REPROVADO");
                reprovados++;
            }

            soma += notas[i];
            if (notas[i] > notas[posMaior]) posMaior = i;
            if (notas[i] < notas[posMenor]) posMenor = i;
        }

        System.out.println();
        System.out.printf(Locale.US, "Media: %.1f%n", soma / N);
        System.out.println("Maior nota: " + notas[posMaior]);
        System.out.println("Menor nota: " + notas[posMenor]);
        System.out.println("Aprovados: " + aprovados);
        System.out.println("Reprovados: " + reprovados);
        System.out.println("Aluno com maior nota: " + nomes[posMaior]);

        // Desafio extra: busca por nome
        System.out.print("\nDigite um nome para buscar: ");
        String busca = entrada.nextLine();
        boolean achou = false;

        for (int i = 0; i < N; i++) {
            if (nomes[i].equalsIgnoreCase(busca)) {
                String situacao = notas[i] >= 6 ? "APROVADO" : "REPROVADO";
                System.out.println(nomes[i] + " - nota " + notas[i] + " - " + situacao);
                achou = true;
            }
        }

        if (!achou) {
            System.out.println("Aluno nao encontrado.");
        }
    }
}
