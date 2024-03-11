public class stringMetotlari {
    public static void main(String[] args) {
        
        //length() => string'in uzunlugunu dondurur.
        String str="Merhaba java";
        int uzunluk = str.length();
        System.out.println("String'in uzunlugu: " + uzunluk);

        //charAt() => belirli bir indexteki karakteri dondurur.
        String str2="Merhaba java";
        char karakter=str2.charAt(3);
        System.out.println("3.indexteki karakter: " + karakter);

        //substring() => belirli bir araliktaki alt diziyi dondurur.
        String str3="Merhaba java";
        String altDizi=str3.substring(3, 8);
        System.out.println("Alt dizi: " + altDizi);

        //toUpperCase() ve toLowerCase() => buyuk/kucuk harfe donusturme
        String str4="Merhaba java";
        String buyukHarfli=str4.toUpperCase();
        String kucukHarfli=str4.toLowerCase();
        System.out.println("Buyuk harfli:" + buyukHarfli);
        System.out.println("Kucuk harfli:" + kucukHarfli);

        //ındexOf() ve lastIndexOf() => belirli bir karakterin veya alt dizinin ilk/son indexini bulma
        String str5="Merhaba java";
        int ilkIndex=str.indexOf('a');
        int sonIndex=str.lastIndexOf('a');
        System.out.println("İlk 'a' indexi: " + ilkIndex);
        System.out.println("Son 'a' indexi:" + sonIndex); 
        

    }
}
