public class forDongusu {
    public static void main(String[] args) {
        // 1'den 10'a kadar olan cift sayilari yazdir. (ve toplamini yazdir)
        int ciftToplam=0;
        for(int i=1;i<=10;i++){
            if(i%2==0){
                System.out.println(i);
                ciftToplam+=i;
            }
        }
        System.out.println("Ciftlerin toplami: " + ciftToplam);

        //1'den 10'a kadar olan tek sayilari yazdir. (ve toplamini yazdir)
        int tekToplam=0;
        for(int m=1;m<=10;m++){
            if(m%2!=0){
                System.out.println(m);
                tekToplam+=m;
            }
        }
        System.out.println("Teklerin toplami:" + tekToplam);

        

    }
}
