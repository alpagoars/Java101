import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner imput= new Scanner(System.in);

        Double cm,kg;
        System.out.println("kilonuzu giriniz");
        kg= imput.nextDouble();
        System.out.println("boyunuzu giriniz");
        cm= imput.nextDouble();
        double index=(kg/(cm*cm));
        System.out.println("boy:"+cm);
        System.out.println("kilo"+kg);
        System.out.println("Vücut kütle indeksiniz:"+index);
    }
}