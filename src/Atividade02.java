import java.util.Locale;
import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); // decimais com ponto (25.5)
        double[] temp = new double[7];
        double soma = 0;

        for (int i = 0; i < temp.length; i++) {
            System.out.print("Temperatura do dia " + (i + 1) + ": ");
            temp[i] = entrada.nextDouble();
            soma += temp[i];
        }

        System.out.print("Temperaturas:");
        for (int i = 0; i < temp.length; i++) {
            System.out.print(" " + temp[i] + " |");
        }
        System.out.println();

        double media = soma / temp.length;
        System.out.printf(Locale.US, "Media da semana: %.2f C%n", media);
    }
}
