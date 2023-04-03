import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int a,b,c;
        double aln,u;
        Scanner scanner = new Scanner(System.in);
        System.out.println("a kenar uzunluğunu giriniz");
        a = scanner.nextInt();
        System.out.println("b kenar uzunluğunu giriniz");
        b = scanner.nextInt();
        System.out.println("c kenar uzunluğunu giriniz");
        c = scanner.nextInt();
        u=(a+b+c)/2;
        aln=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Ucgenin alani:"+aln);
    }
}