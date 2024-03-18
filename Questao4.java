//Crie um programa para calcular a regra de três.
import java.util.Scanner;
public class Main{
    public static void main(String [] args){
    Double Denominador1,Numerador1,Denominador2,Numerador2,M1,M2,D1;
    Scanner reader=new Scanner(System.in);
    System.out.println("Digite o denominador da primeira fração: ");
    Denominador1=reader.nextDouble();
    System.out.println("Digite o numerador da primeira fração; ");
    Numerador1=reader.nextDouble();
    System.out.println("Digite o denominador da segunda fração: ");
    Denominador2=reader.nextDouble();
    System.out.println("Digite o numerador da primeira fração: ");
    Numerador2=reader.nextDouble();
    M1=Numerador1*Denominador2;
    M2=Numerador2*Denominador1;
    System.out.println(M1);
    System.out.println(M2);
    D1=M1/M2;
    System.out.println("A regra de três é " +D1);
    
    
   
    
    }
}
