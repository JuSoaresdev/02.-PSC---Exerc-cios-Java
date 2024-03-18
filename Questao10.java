//A organização mundial da saúde recomenda que sejam ingeridos 35 ml de água por dia, para cada quilograma de peso. Crie um algoritmo que recebe o peso de uma pessoa e informe a quantidade recomendada de água em litros.
import java.util.Scanner;

public class CalculadoraAgua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Receber o peso da pessoa em quilogramas
        System.out.print("Digite o peso da pessoa (em quilogramas): ");
        double peso = scanner.nextDouble();
        
        // Calcular a quantidade recomendada de água em litros
        double aguaRecomendadaLitros = peso * 35 / 1000; // Convertendo de ml para litros
        
        // Exibir a quantidade recomendada de água em litros
        System.out.println("Quantidade recomendada de água por dia: " + aguaRecomendadaLitros + " litros");
        
        scanner.close();
    }
}
