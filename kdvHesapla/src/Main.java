import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int maliyet;

        Scanner scanner = new Scanner(System.in);
        System.out.println("maliyetinizi giriniz");
        maliyet=scanner.nextInt();
        if (maliyet>=1000){
            double kdv=maliyet+(maliyet*0.8);
            System.out.println(" maliyet: "+maliyet);
            System.out.println("kdvli fiyat: "+kdv);

        }
        else if(maliyet<1000){
        double KDV=maliyet+(maliyet*0.18);
        System.out.println("maliyer: "+maliyet);
        System.out.println("kdvli fiyat: "+KDV );
        }
    }
}