//Incremente o programa da questão 6, para informar o valor do metro quadrado da cerâmica escolhido e o valor total a ser pago
import java.util.Scanner;
import java.lang.Math;

public class CalculadoraRevestimento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedir as medidas da área a ser revestida
        System.out.print("Digite a largura da área a ser revestida (em metros): ");
        double larguraArea = scanner.nextDouble();
        
        System.out.print("Digite o comprimento da área a ser revestida (em metros): ");
        double comprimentoArea = scanner.nextDouble();
        
        // Pedir as medidas da cerâmica escolhida
        System.out.print("Digite a largura da cerâmica escolhida (em metros): ");
        double larguraCeramica = scanner.nextDouble();
        
        System.out.print("Digite o comprimento da cerâmica escolhida (em metros): ");
        double comprimentoCeramica = scanner.nextDouble();
        
        // Pedir o preço por metro quadrado da cerâmica escolhida
        System.out.print("Digite o preço por metro quadrado da cerâmica escolhida (em reais): ");
        double precoPorMetroQuadrado = scanner.nextDouble();
        
        // Calcular a quantidade de cerâmica necessária
        double areaArea = larguraArea * comprimentoArea;
        double areaCeramica = larguraCeramica * comprimentoCeramica;
        
        // Arredondar para cima e adicionar 10% para o acabamento
        double quantidadeCeramica = Math.ceil(areaArea / areaCeramica * 1.1);
        
        // Calcular o valor total a ser pago
        double valorTotal = quantidadeCeramica * precoPorMetroQuadrado * areaCeramica;
        
        // Exibir a quantidade necessária de cerâmica e o valor total a ser pago
        System.out.println("Quantidade de cerâmica necessária: " + quantidadeCeramica + " peças");
        System.out.println("Valor total a ser pago: R$ " + valorTotal);
        
        scanner.close();
    }
}
