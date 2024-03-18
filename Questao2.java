//Uma dúvida que sempre paira na cabeça dos motoristas é: Abastecer com etanol ou gasolina? Especialistas indicam que o consumo do carro aumenta em torno de trinta por cento, quando abastecido com etanol, logo, só vale a pena abastecer com ele se o valor estiver abaixo de setenta por cento do valor da gasolina. Para auxiliar motoristas a realizar este cálculo, crie um algoritmo que receba o preço dos dois combustíveis, e informe qual deve ser a escolha, com base no custo.
import java.util.Scanner;
public class Main{
    public static void main(String [] args){
    Double cateto1,cateto2,hipotenusa1,hipotenusa2;
    Scanner reader=new Scanner(System.in);
    System.out.println("Qual o valor do primeiro cateto?");
    cateto1=reader.nextDouble();
    System.out.println("Qual o valor do segundo cateto? ");
    cateto2=reader.nextDouble();
    hipotenusa1=(cateto1*cateto1)+(cateto2*cateto2);
    System.out.println(hipotenusa1);
    hipotenusa2=Math.sqrt(hipotenusa1);
    System.out.println("O valor da hipotenusa é: "+hipotenusa2);
    
   
    
    }
}
