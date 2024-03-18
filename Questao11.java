//Muitas pessoas têm dúvida sobre qual o gasto com energia de determinados equipamentos que possuem. Crie um algoritmo que receba a potência do equipamento em Watts, a quantidade de horas que ele fica ligado por dia, e o valor do KW/h. O cálculo é feito multiplicando a potência pela quantidade de horas, depois, dividindo por mil. Ao final, apresente a quantidade de KWh consumidos pelo equipamento e qual será o valor pago por eles
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
        
        // Exibir a quantidade de kWh consumidos pelo equipamento e o valor pago
        System.out.println("Quantidade de kWh consumidos por dia: " + kWhConsumidosPorDia + " kWh");
        System.out.println("Valor pago por dia: R$ " + valorPagoPorDia);
        
        scanner.close();
    }
}
