import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int km;
       double kmb=2.20, tutar, acilis=10;
        Scanner imput=new Scanner(System.in);
       System.out.println("Gittiğiniz KM'yi giriniz");
       km= imput.nextInt();
        tutar=(km*kmb+acilis);
        if(tutar<=20){

            tutar=20;
        }
        System.out.println(tutar);

    }
}