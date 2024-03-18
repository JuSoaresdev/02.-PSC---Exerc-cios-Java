//Pesquise o valor aproximado de dias por mês e ajuste o programa anterior para exibir o custo mensal em energia elétrica com o equipamento inserido.
import java.util.Scanner;

public class CalculadoraConsumoEnergia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Receber a potência do equipamento em Watts
        System.out.print("Digite a potência do equipamento (Watts): ");
        double potencia = scanner.nextDouble();
        
        // Receber a quantidade de horas que o equipamento fica ligado por dia
        System.out.print("Digite a quantidade de horas que o equipamento fica ligado por dia: ");
        double horasPorDia = scanner.nextDouble();
        
        // Receber o valor do kWh
        System.out.print("Digite o valor do kWh (em reais): ");
        double valorKWh = scanner.nextDouble();
        
        // Calcular a quantidade de kWh consumidos por dia
        double kWhConsumidosPorDia = (potencia * horasPorDia) / 1000; // Convertendo de Watts para kWh
        
        // Calcular o valor pago por dia
        double valorPagoPorDia = kWhConsumidosPorDia * valorKWh;
        
        // Calcular o custo mensal em energia elétrica
        double custoMensal = valorPagoPorDia * 30; // Considerando um mês de 30 dias
        
        // Exibir a quantidade de kWh consumidos pelo equipamento e o custo mensal em energia elétrica
        System.out.println("Quantidade de kWh consumidos por dia: " + kWhConsumidosPorDia + " kWh");
        System.out.println("Custo mensal em energia elétrica: R$ " + custoMensal);
        
        scanner.close();
    }
}
