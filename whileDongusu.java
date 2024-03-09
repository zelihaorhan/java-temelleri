public class whileDongusu {
    public static void main(String[] args) {
        // 1'den 10'a kadar olan sayilari ekrana yazdir.    
        int i=1;
        while(i<=10){
            System.out.println(i);
            i++;
        }

        //1 ile 10 arasindaki cift sayilari yazdirin. (ve toplamini)
        int j=1;
        int toplam=0;
        while(j<=10){
            if(j%2==0){
                System.out.println(j);
                toplam+=j;
            }
            j++;
        }
        System.out.println("Toplam: " + toplam);

        
    }
}
