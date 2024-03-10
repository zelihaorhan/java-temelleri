

/**
 * metotlar
 */
public class metotlar {

   public static void main(String[] args) {

        isimYazdir();
        topla(12, 5);
        System.out.println(carp(2, 3));
        System.out.println(isim());


   }
   //parametresiz ve geriye deger dondurmeyen metot
   public static void isimYazdir(){
    System.out.println("zeliha");
   }

   //parametreli ve geriye deger dondurmeyen metot
   public static void topla(int sayi1,int sayi2){
        System.out.println("Toplam:" + (sayi1+sayi2));
   }

   //parametreli ve geriye deger donduren metot
   public static int carp(int sayi1,int sayi2){
        return sayi1*sayi2;
   }

   //parametresiz ve geriye deger donduren metot
   public static String isim(){
        return "Zeliha";
   }
    
   
}