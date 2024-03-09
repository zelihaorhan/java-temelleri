import java.util.Scanner;

public class dizilerOrnek {
    public static void main(String[] args) {
        // dizideki elemanlarin asal olup olmadiklarini bulma

        //dizinin elemanlarini kullanicidan alalim
        //daha sonra dizinin icindeki elemanlarin asal olanlarini ve olmayanlarini ayri bir sekilde yazdiralim

        System.out.println("ASAL SAYI BULMA UYGULAMASINA HOSGELDİNİZ");
        System.out.println("**********************************");

        int asalToplam=0;
        int asalOlmayanToplam=0;

        String asalSayilar="";
        String asalOlmayanSayilar="";

        boolean asalMi=true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dizinin eleman sayisini giriniz : ");
        int diziUzunluk=scanner.nextInt();
        scanner.nextLine();

        int[] sayilar = new int[diziUzunluk];

        for(int i=0;i<sayilar.length;i++){
            System.out.println("Dizinin " + i + " .index degerini giriniz: " );
            sayilar[i]=scanner.nextInt();
            scanner.nextLine();
        }

        for(int sayi:sayilar){
            for(int j=2;j<sayi;j++){
                if(sayi%j==0){
                    asalOlmayanToplam+=1;
                    asalOlmayanSayilar+=String.valueOf(sayi)+ " ";
                    break;
                }
                else{
                    asalMi=true;
                }
            }
            if(asalMi){
                asalToplam+=1;
                asalSayilar+=String.valueOf(sayi)+ " ";
                asalMi=false;
            }
        }
        System.out.println("ASAL BILGILERİ");
        System.out.println("Asal toplam= " + asalToplam  + "Asal sayilar = " + asalSayilar );
        System.out.println("**************************************");

        System.out.println("ASAL OLMAYAN BILGILER");
        System.out.println("Asal olmayan toplam=" + asalOlmayanToplam+ "Asal olmayan sayilar =" + asalOlmayanSayilar);
    }
}
