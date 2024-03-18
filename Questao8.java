//Faça um programa que calcule o tempo necessário para o download de um arquivo qualquer da internet. Deve-se informar o tamanho do arquivo em MB, a velocidade do link em Mbps e, retornar o tempo total em minutos
import java.util.Scanner;

public class CalculadoraDownload {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar o tamanho do arquivo em MB
        System.out.print("Digite o tamanho do arquivo em MB: ");
        double tamanhoArquivoMB = scanner.nextDouble();
        
        // Solicitar a velocidade do link em Mbps
        System.out.print("Digite a velocidade do link em Mbps: ");
        double velocidadeLinkMbps = scanner.nextDouble();
        
        // Calcular o tempo necessário para o download em minutos
        double tempoMinutos = (tamanhoArquivoMB / velocidadeLinkMbps) * (8.0 / 60.0);
        
        // Exibir o tempo necessário para o download
        System.out.println("Tempo necessário para o download: " + tempoMinutos + " minutos");
        
        scanner.close();
    }
}
