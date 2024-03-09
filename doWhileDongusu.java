public class doWhileDongusu {
    public static void main(String[] args) {
        //1'den 10'a kadar olan cift sayilari ve toplamini yazdir.
        int i=1;
        int toplam=0;
        do{
            if(i%2==0){
                System.out.println(i);
                toplam+=i;
            }
            i++;
        }
        while(i<=10);


        //1'den 10'a kadar olan tek sayilari ve toplamini yazdir.
        int j=1;
        int tekToplam=0;
        do{
            if(j%2!=0){
                System.out.println(j);
                tekToplam+=j;
            }
            j++;
        }
        while(j<=10);
    }
}
