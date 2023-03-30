import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int turkce, matematik, fizik;
        double ortalama=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Türkçe Notunuzu Giriniz:");
        turkce = scanner.nextInt();

        System.out.println("Matematik Notunuzu Giriniz:");
        matematik = scanner.nextInt();


        System.out.println("Fizik Notunuzu Giriniz:");
        fizik = scanner.nextInt();


        ortalama = (matematik + fizik + turkce) /3;
        System.out.println("Ortalama : " + ortalama);
        System.out.println(ortalama>=60?"Sınıfı Geçtiniz":"Sınıfta Kaldınız");
    }
}