
package kikotojavaapplication;

import java.util.ArrayList;
import java.util.List;

public class KikotoJavaApplication {


    public static void main(String[] args) {
            
        Kikoto k = new Kikoto("Rotterdam",10);
        Hajo h1 = new Hajo("CSCL Jupiter",3,"Rotterdam");
        Hajo h2 = new Hajo("Merry Maersk",4,"Shanghai");
        
        
        k.hozzaAd(new Kontener("Rotterdam"));
        k.hozzaAd(new Kontener("Rotterdam"));
        k.hozzaAd(new Kontener("Rotterdam"));
        
        k.hozzaAd(new Kontener("Shanghai"));
        k.hozzaAd(new Kontener("Shanghai"));
        k.hozzaAd(new Kontener("Shanghai"));
        
        k.engedelyez(h1);
        //System.out.println(k.getKapacitas());
        System.out.println(k.getKontenerek().size());
        h1.kikot(k);
        h1.kipakol(k,"New York");
        System.out.println(k.getKontenerek().size());
        h1.felpakol(k);
        
        
        //System.out.println(k.engedelyez(h1));
    }
    
}
