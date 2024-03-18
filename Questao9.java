//Crie um programa para calcular o IMC de uma pessoa. Ele deve receber o peso atual em quilogramas e a altura, em centímetros, e exibir o peso ideal e o peso ideal ajustado. Dica: https://eurofarma.com.br/calculadoras/calculadora-de-peso-ideal Utilize este como referência para seus testes. Obs. O IMC é apenas uma referência, um médico deve ser consultado para entender as necessidades de cada indivíduo
import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Receber o peso atual em quilogramas e a altura em centímetros
        System.out.print("Digite o peso atual (kg): ");
        double pesoAtual = scanner.nextDouble();
        
        System.out.print("Digite a altura (cm): ");
        double alturaCm = scanner.nextDouble();
        
        // Converter a altura de cm para m
        double alturaM = alturaCm / 100.0;
        
        // Calcular o IMC
        double imc = pesoAtual / (alturaM * alturaM);
        
        // Calcular o peso ideal e o peso ideal ajustado
        double pesoIdeal = 22 * alturaM * alturaM;
        double pesoIdealAjustado = 24.9 * alturaM * alturaM;
        
        // Exibir os resultados
        System.out.println("IMC: " + imc);
        System.out.println("Peso Ideal: " + pesoIdeal + " kg");
        System.out.println("Peso Ideal Ajustado: " + pesoIdealAjustado + " kg");
        
        scanner.close();
    }
}
