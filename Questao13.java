//Escreva um programa que seja capaz de realizar a soma de duas frações, não é necessário simplificar. As entradas serão o numerador e, o denominador da primeira fração, seguidos do numerador e, o denominador da segunda fração. O resultado também deverá ser exibido em formato de fração. e.g: ⅗
import java.util.Scanner;

public class SomaFrações {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ler a primeira fração
        System.out.println("Digite a primeira fração:");
        System.out.print("Numerador: ");
        int numerador1 = scanner.nextInt();
        System.out.print("Denominador: ");
        int denominador1 = scanner.nextInt();
        
        // Ler a segunda fração
        System.out.println("\nDigite a segunda fração:");
        System.out.print("Numerador: ");
        int numerador2 = scanner.nextInt();
        System.out.print("Denominador: ");
        int denominador2 = scanner.nextInt();
        
        // Calcular o numerador e o denominador do resultado
        int numeradorResultado = numerador1 * denominador2 + numerador2 * denominador1;
        int denominadorResultado = denominador1 * denominador2;
        
        // Exibir o resultado da soma das frações
        System.out.println("\nResultado da soma das frações:");
        System.out.println(numeradorResultado + "/" + denominadorResultado);
        
        scanner.close();
    }
}
