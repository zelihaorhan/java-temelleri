

/**
 * tur-donusumleri
 */
public class turDonusumu {

    public static void main(String [] args){
        
        //string'ten int'e donusum:
        String a = "5";
        int b=Integer.parseInt(a); 
        System.out.println(b);

        //int'ten string'e donusum:
        int x = 21;
        String y = String.valueOf(x);
        System.out.println(y);

        //double'dan int'e donusum:
        double f = 5.50;
        int d= (int)f;
        System.out.println(d);

        //int'ten double'a donusum:
        int m =5;
        double n= (double)m;
        System.out.println(n);

        //float tipinden long'a donusum:
        float z=5.12f;
        long t=(long)z;
        System.out.println(t);

        //long tipinden float'a donusum:
        long w=5;
        float r=(float)w;
        System.out.println(r);

        //long tipinden string'e donusum:
        long s=5;
        String h=String.valueOf(s);
        System.out.println(h);

        //float tipinden String'e donusum:
        float p=5.12f;
        String j=String.valueOf(p);
        System.out.println(j);

        //byte tipinden String'e donusum:
        byte l = 55;
        String k = Byte.toString(l);
        System.out.println(k);

        
         
    }
    
}
