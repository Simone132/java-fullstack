import java.util.Scanner;

public class calcolaPerimetroArea
{

    public static void main(String[]     args)
{
   
    Scanner input = new Scanner(System.in);// devo far si che mi chieda di inserire un dato
    double lato; // devo dichiarare u  na variabile lato
    System.out.print("inserisci la lunghezza del lato:");// stampa il tuonome
    lato = input.nextInt();//legge il prossimo intero dall' intput
    
    
    if (lato>400 || lato<1)
    {
     System.out.print(" il lato è >1");


    }

else
{
    System.out.println("perimetro="+ lato * 4); // calcolare il perimetro
    
    System.out.println("Area=" + lato  * lato); // calcolare l' area 
}
    // dev stampare il risulatato che voglio su due righe diverse                            
}
}