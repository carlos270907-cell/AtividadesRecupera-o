import java.util.Locale;
import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double[] notas = new double[10];
        int aprovados = 0;
        int reprovados = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota do aluno " + (i + 1) + ": ");
            notas[i] = entrada.nextDouble();
        }

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 6) {
                aprovados++;
            } else {
                reprovados++;
            }
        }

        System.out.println("Aprovados: " + aprovados);
        System.out.println("Reprovados: " + reprovados);
    }
}
