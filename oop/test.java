package oop;

public class test {
    public static void main(String[] args) {
        //Bir sinif var. Biz bir sinifin icindeki degiskenlere erisebilmek icin o class'tan nesne turetmemiz gerekiyor. (new keywordu kullanilir)

        ogrenci ogrenci1=new ogrenci(); //ogrenci sinifindan ogrenci1 adinda bir nesne olusturduk.

        //nesnemizin field'larina deger atadik.
        ogrenci1.id=23;
        ogrenci1.isim="Zeliha";
        ogrenci1.soyisim="Orhan";

        //Constructor (yapici metot)

        System.out.println("Ogrenci Bilgileri: ");
        System.out.println("ID: " + ogrenci1.id);
        System.out.println("ISIM: " + ogrenci1.isim);
        System.out.println("SOYISIM: " + ogrenci1.soyisim);





    }
}
