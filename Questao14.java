//Escreva um algoritmo que recebe dois pontos no plano cartesiano, P1=(x1,y1) e P2=(x2,y2)e calcula a distância entre eles, dada por d(P1,P2)=(x1-x2)2+(y1-y2)2 
import java.util.Scanner;

public class DistanciaEntrePontos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Receber as coordenadas dos pontos P1 e P2
        System.out.println("Digite as coordenadas do ponto P1:");
        System.out.print("x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("y1: ");
        double y1 = scanner.nextDouble();
        
        System.out.println("\nDigite as coordenadas do ponto P2:");
        System.out.print("x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("y2: ");
        double y2 = scanner.nextDouble();
        
        // Calcular a distância entre os pontos
        double distancia = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        
        // Exibir a distância entre os pontos
        System.out.println("\nA distância entre os pontos P1 e P2 é: " + distancia);
        
        scanner.close();
    }
}
