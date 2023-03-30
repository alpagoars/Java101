import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      int matematik, fizik, kimya, turkce, tarih, muzik;
        double ortalama=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Matematik Notunuzu Giriniz:");
        matematik = scanner.nextInt();

        System.out.println("Fizik Notunuzu Giriniz:");
        fizizk = scanner.nextInt();

        System.out.println("Turkce Notunuzu Giriniz:");
        turkce = scanner.nextInt();

        System.out.println("Kimya Notunuzu Giriniz:");
        kimya = scanner.nextInt();

        System.out.println("Tarih Notunuzu Giriniz:");
        tarih = scanner.nextInt();

        System.out.println("Muzik Notunuzu Giriniz:");
        muziik = scanner.nextInt();

        ortalama = (mat + fiz + tur + kim + tar + muz)/6;

        ortalama = (matematik + fizik + turkce + kimya + tarih + muzik)/6;
        System.out.println("Ortalama : " + ortalama);
        System.out.println(ortalama>=60?"Sınıfı Geçtiniz":"Sınıfta Kaldınız");
    }
}
