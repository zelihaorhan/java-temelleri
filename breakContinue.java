public class breakContinue {
    public static void main(String[] args) {
        
        //BREAK : donguyu tamamen kirar.
        int sayiyiBuldunMu;
        
        for(int i=1;i<=10;i++){
            if(i==4){
                sayiyiBuldunMu=i;
                break; 
            }
        }
        System.out.println("Donguden cikildi.");

        //CONTINUE : donguyu sadece 1 kereye mahsus kurar.

        for(int j=1;j<=10;j++){
            if(j==7 || j==8){
                continue;
            }
            System.out.println(j);
        }
    }
}
