import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        // ORNEK UYGULAMA: HAFTANIN GUNLERININ HESAPLANMASI

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz: ");
        int sayi=scanner.nextInt();

        switch(sayi){
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Sali");
                break;
            case 3:
                System.out.println("Carsamba");
                break;
            case 4:
                System.out.println("Persembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Lutfen 1 ile 7 arasinda bir sayi giriniz.");
            
        }










        scanner.close();
    }
}
