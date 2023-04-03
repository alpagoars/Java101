import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner imput= new Scanner(System.in);
        double pi=3.14;
        int r,aci;
        System.out.println("yarıçapı giriniz:");
        r= imput.nextInt();
        System.out.println("aciyi giriniz:");
        aci= imput.nextInt();
        double alan=( (pi * (r*r) * aci) / 360);
        System.out.println("dairenin alanı:"+alan);
    }
}