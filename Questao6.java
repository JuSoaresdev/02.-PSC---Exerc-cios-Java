//Faça um programa para uma loja de cerâmica que ajuda no cálculo da quantidade de revestimento necessário para uma obra. A pessoa utilizadora deve informar as medidas de largura e comprimento da área que será revestida e da cerâmica escolhida. Sempre arredonde o valor para cima, e acrescente dez por cento para o acabamento.
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
        
        // Calcular a quantidade de cerâmica necessária
        double areaArea = larguraArea * comprimentoArea;
        double areaCeramica = larguraCeramica * comprimentoCeramica;
        
        // Arredondar para cima e adicionar 10% para o acabamento
        double quantidadeCeramica = Math.ceil(areaArea / areaCeramica * 1.1);
        
        // Exibir a quantidade necessária de cerâmica
        System.out.println("Quantidade de cerâmica necessária: " + quantidadeCeramica + " peças");
        
        scanner.close();
    }
}
