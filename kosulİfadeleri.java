import java.util.Scanner;
/**
 * if-else
 */
public class kosulİfadeleri {

    public static void main(String[]args){
        //kosul yapilari ile ilgili ufak capli bir ornek

        //vize1 %30 -- vize2 %30 -- final %40
        //GECME NOTU: 60

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Adinizi giriniz: ");
        String isim=scanner.nextLine();

        System.out.println("Soyadinizi giriniz: ");
        String soyisim=scanner.nextLine();

        System.out.println("Dersi giriniz:");
        String dersIsmi=scanner.nextLine();

        System.out.println("Vize1 notunu giriniz: ");
        double vize1=scanner.nextDouble();

        System.out.println("Vize2 notunu giriniz: ");
        double vize2=scanner.nextDouble();

        System.out.println("Final notunu giriniz: ");
        double finalNot=scanner.nextDouble();

        double sonuc= (vize1*0.3)+(vize2*0.3)+(finalNot*0.4);

        if(sonuc>60){
            System.out.println(isim + " " + soyisim + " " + " adli ogrenci " + dersIsmi + " dersinden " + sonuc + " ortalamasi ile gecmistir.");
        }
        else{
            System.out.println("Dersten kaldiniz :/");
        }
        
    }
}