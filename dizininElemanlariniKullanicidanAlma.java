import java.util.Scanner;
public class dizininElemanlariniKullanicidanAlma {
    public static void main(String[] args) {
        //Dizinin elemanlarini kullanicidan alma

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dizi kac elemanli olsun: ");
        int diziUzunluk=scanner.nextInt();
        scanner.nextLine();
        String [] isimler=new String[diziUzunluk];
        for(int i=0;i<diziUzunluk;i++){
            System.out.println("Dizinin " + (i) + " . index degerini giriniz: ");
            isimler[i]=scanner.nextLine();
        }

        for(int i=0;i<isimler.length;i++){
            System.out.println(isimler[i]);
        }

    }
}
