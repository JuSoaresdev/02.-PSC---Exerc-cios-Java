//Crie um algoritmo que leia um valor de hora (HH:MM) e informe (calcule) quantos minutos se passaram desde o início do dia (00:00)
import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Double Horas,Minutos,HoraMinuto; 
        Scanner reader=new Scanner(System.in);
        System.out.println("Quantas horas se passaram? ");
        Horas=reader.nextDouble();
        System.out.println("Quanttos minutos se passaram? ");
        Minutos=reader.nextDouble();
        HoraMinuto=(Horas*60)+Minutos;
        System.out.println("Os minutos passados foram: "+HoraMinuto);
    }
}
