import java.util.Scanner;


public class Main{


    public static void main(String[] args){

        Papildoma aktoriai = new Papildoma();
        aktoriai.Pasisveikinimas();
        while (true)
        {
        aktoriai.Paklausimas();
        aktoriai.Pasirinkimas();

        }
    }
}