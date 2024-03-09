import java.util.Scanner;
public class dongulerOrnek {
    public static void main(String[] args) {
        // ASAL SAYİ BULMA ORNEGİ

        System.out.println("Asal sayi bulma uygulamasina hos geldiniz.");
        System.out.println("Bir sayi giriniz: ");;
        Scanner scanner = new Scanner(System.in);
        int sayi=scanner.nextInt();

        boolean asalMi=false;
        for(int i=2;i<sayi;i++){
            if(sayi%i==0){
                asalMi=false;
                break;
            }
            else{
                asalMi=true;
            }
        }
        if(asalMi){
            System.out.println("Girdiginiz " + sayi + " sayi asal degildir.");
        }
        else{
            System.out.println("Girdiginiz " + sayi + " sayi asaldir.");
        }
    }
}
