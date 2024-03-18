//Escreva um programa que calcule o teorema de Pitágoras, representado pela expressão: c =a2+b2 
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
