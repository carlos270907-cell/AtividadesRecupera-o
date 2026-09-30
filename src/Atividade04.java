import java.util.Locale;
import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double[] precos = new double[6];
        double total = 0;

        for (int i = 0; i < precos.length; i++) {
            System.out.print("Preco do produto " + (i + 1) + ": R$ ");
            precos[i] = entrada.nextDouble();
            total += precos[i];
        }

        System.out.println();
        for (int i = 0; i < precos.length; i++) {
            System.out.printf(Locale.US, "Produto %d: R$ %.2f%n", i + 1, precos[i]);
        }
        System.out.printf(Locale.US, "Total da compra: R$ %.2f%n", total);

        // Desafio extra
        System.out.print("\nQuanto dinheiro o cliente possui? R$ ");
        double dinheiro = entrada.nextDouble();

        if (dinheiro >= total) {
            System.out.printf(Locale.US, "Dinheiro suficiente! Troco: R$ %.2f%n", dinheiro - total);
        } else {
            System.out.printf(Locale.US, "Dinheiro insuficiente! Faltam R$ %.2f%n", total - dinheiro);
        }
    }
}
