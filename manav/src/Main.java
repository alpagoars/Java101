import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armut, elma, domates,muz,patlican;
        System.out.println("Armut Kaç kilo");
        armut=input.nextDouble();
        System.out.println("elma Kaç kilo");
        elma=input.nextDouble();
        System.out.println("dometes Kaç kilo");
        domates=input.nextDouble();
        System.out.println("muz Kaç kilo");
        muz=input.nextDouble();
        System.out.println("patlıcan Kaç kilo");
        patlican=input.nextDouble();
        Double Tutar=(armut*2.14)+(elma*3.67)+(domates*1.11)+(muz*0.95)+(patlican*5.0);
        System.out.println("Toplam tutar:"+Tutar);
    }
}