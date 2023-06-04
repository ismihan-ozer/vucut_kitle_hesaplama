import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double m,kg;
        Scanner inp =new Scanner(System.in);
        System.out.print("Lütfen kilonuzu giriniz:");
        kg=inp.nextDouble();

        System.out.print("Lütfen Boyunuzu(metre cinsinden)giriniz");
        m= inp.nextDouble();

        m = m / 100.0;

        double indeks=((kg) / (m * m));
        System.out.print("Vücut kitle endeksiniz:"+ indeks);
    }
}