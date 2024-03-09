public class digerVeriTİpleriİleDiziTanimlama {
    public static void main(String[] args) {
        
        //int veri turu ile dizi tanimlama
        int[]sayilar=new int[6];
        sayilar[0]=15;
        sayilar[1]=12;
        sayilar[2]=23;
        sayilar[3]=76;
        sayilar[4]=89;
        sayilar[5]=67;
        for(int i=0;i<sayilar.length;i++){
            System.out.println(sayilar[i]);
        }

        //char veri turu ile dizi tanimlama
        char[] karakterDizi={'e','n','e','s','b','a','y','r','a','m'};
        for(int i=0;i<karakterDizi.length;i++){
            System.out.println(karakterDizi[i]);
        } 

        //double veri turu ile dizi tanimlama
        double[] doubleDizisi={12.5,13.6,3.7,8.1};
        for(int i=0;i<doubleDizisi.length;i++){
            System.out.println(doubleDizisi[i]);
        }
    }
}
