import java.util.Scanner;

public class metotlarOrnek {
    public static void main(String[] args) {
        //girilen sayinin tek mi cift mi oldugunu bulma
        Scanner scan = new Scanner(System.in);
        System.out.println("Dizinin eleman sayisini giriniz:");
        int uzunluk=scan.nextInt();
        
        int sayilar [] = new int[uzunluk];

        for(int i=0;i<sayilar.length;i++){
            System.out.println("Dizinin " + i + ". indexini giriniz:");
            sayilar[i]=scan.nextInt();
        }
        for(int deger : sayilar){
            tekMiCiftMi(deger);
        }
        
        
    }

    public static void tekMiCiftMi(int sayi){

        if(sayi%2==0){
            System.out.println("Sayi cifttir.");;
        }
        else{
            System.out.println("Sayi tektir.");;
        }

    }
}
