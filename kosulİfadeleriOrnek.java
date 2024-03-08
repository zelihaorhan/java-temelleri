public class kosulİfadeleriOrnek {
    public static void main(String[] args) {
        /*
         *  Bir kuruyemisci toptancidan;
         *  12 kilo leblebiyi kilosunu 3.5 TL,
         *  25 kilo findik kilosunu 15,7 TL,
         *  40 kilo badem kilosunu 22 TL'den 
         *  almistir.
         * 
         *  Bu urunleri satarken,
         *  --> leblebinin kilosunu %50 fazlasina satmis
         *  --> findigin kilosunu %40 fazlasina satmis
         *  --> bademin kilosunu ise %60 fazlasina satmistir.
         * 
         * kuruyemisci o gunku kazandigi para ile dukkaninin kirasini odemek istemektedir.
         * 
         * kira tutari = 500 TL
         * kazandigi para 500 TL'den yuksek ise kirayi odeyebilsin, degilse odeyemesin.
         */
        
        double leblebi=3.5;
        double findik=15.7;
        double badem =22;


         double maliyetTutar=(12*3.5)+(findik*25)+(badem*40);

         double satisTutar=((leblebi*1.5)*12)+((findik*1.4)*25)+((badem*1.6)*40);

         double karTutar=satisTutar-maliyetTutar;

         if(karTutar>500){
            System.out.println("Kirayi odeyebilirsin :))");
         }
         else{
            System.out.println("Kirayi odemek icin yeterli paraniz bulunmamaktadir, lutfen daha sonra tekrar deneyiniz...");
         }

         System.out.println("Maliyet tutari: " + maliyetTutar);
         System.out.println("Satis tutari: " + satisTutar);
         System.out.println("Kazanc tutari: " + karTutar);
    }
}
