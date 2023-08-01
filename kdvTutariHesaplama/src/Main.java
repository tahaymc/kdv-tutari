import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double tutar, kdvTutar, kdvliTutar, kdv;

        Scanner input = new Scanner(System.in);
        System.out.println("ücret tutarını giriniz: ");
        tutar = input.nextDouble();

        boolean kdvOran=(tutar>0) && (tutar<1000);
        kdv = kdvOran ? 0.18 : 0.08;
        kdvTutar = tutar * kdv;
        kdvliTutar =  tutar + kdvTutar;

        kdvliTutar = tutar+kdvTutar;  System.out.println("KDV'siz Tutar : "+tutar);
        System.out.println("KDV Oranı : "+kdvOran);
        System.out.println("KDV Tutarı : "+kdvTutar);
        System.out.println("KDV'li Tutar : "+kdvliTutar);
    }
}