import java.util.Scanner;

public class mototlarOrnek2 {
    static boolean  aktif = true;
    static int  hakSayisi=3;
    public static void main(String[] args) {
        
        //KULLANICI LOGIN UYGULAMASI

        //kullanicinin uygulamaya giris yapmasini saglayalim. 3 hakki olsun.
        //3 hakkını doldurdugu zaman hesabini disable yapalim. Dogru girer ise sisteme giris yapsin.

        
        Scanner scanner=new Scanner(System.in);
        if(aktif){
            if(hakSayisi>0){
                while(aktif){
                    System.out.println("Kullanici Adiniz:");
                    String username=scanner.nextLine();

                    System.out.println("Sifreniz: ");
                    String password=scanner.nextLine();

                    boolean sonuc = login(username, password);

                    if(sonuc){
                        System.out.println("Uygulamaya basarili olarak giris yaptiniz.");
                    }
                    
                }
                if(aktif==false){
                    System.out.println("Hak sayisi dolmustur.");
                }
            }
            else{
                System.out.println("Hak sayiniz dolmustur, hesabiniz bloke oldu :/");
            }
        }
        else{
            System.out.println("Hesabiniz aktif degildir, yoneticiniz ile iletisime geciniz...");
        }

    }
    public static boolean login(String username,String password){
        //enes ---123
        if(username.equals("enes")&&password.equals("123")){
            return true; //basarili
        }
        else{
            hakSayisi--;
            System.out.println("Kullanici adi veya sifreniz hatalidir.");
            if(hakSayisi==0){
                aktif=false;
            }
            return false;
        }

    }
}
