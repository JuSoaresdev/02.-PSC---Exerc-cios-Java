//Crie um programa que calcule a área, o perímetro e a diagonal de um retângulo. O resultado deve aparecer de maneira organizada e clara para a pessoa utilizadora.
import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Double Base,Altura,Area,Perimetro,Diagonal,DG0;
        Scanner reader=new Scanner(System.in);
        System.out.println("Digite qual o valor da base: ");
        Base=reader.nextDouble();
        System.out.println("Qual o valor da altura: ");
        Altura=reader.nextDouble();
        Area=Base*Altura;
        Perimetro=2*(Base+Altura);
        Diagonal=(Base*Base)+(Altura*Altura);
        DG0=Math.sqrt(Diagonal);
        System.out.println("A area do retangulo é "+Area);
        System.out.println("o valor do perimetro é "+Perimetro);
        System.out.println("O valor da diagonal é "+Diagonal);
        
        
        

    
   
    
    }
}
