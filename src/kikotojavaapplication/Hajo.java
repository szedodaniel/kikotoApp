
package kikotojavaapplication;

import java.util.ArrayList;
import java.util.List;

public class Hajo {
    
    private String nev;
    private int kapacitas;
    private String celAllomas;
    private List<Kontener> kontenerek = new ArrayList<>();

    public Hajo(String nev, int kapacitas, String celAllomas) {
        this.nev = nev;
        this.kapacitas = kapacitas;
        this.celAllomas = celAllomas;
        
    }

   
    
    
    
    public void kikot(Kikoto k){
        if(k.engedelyez(this) == true){
            System.out.println("Van engedlyed, kikötöttél!");
        }else{
            System.out.println("Nincs engedély a kikötésre!");
        }
    }
    
    public void kifut(Kikoto k){
        
    }
    
    public void kipakol(Kikoto k,String celAllomas){
        
        for (int i = 0; i < this.kontenerek.size(); i++) {
            k.getKontenerek().add(this.kontenerek.get(i));
            this.kontenerek.remove(i);
        }
        
      

        
        this.setCelAllomas(celAllomas);
        
    }
    
    public void felpakol(Kikoto k){
       
        
        for (int i = 0; i < k.getKontenerek().size(); i++) {
            if(k.getKontenerek().get(i).getCelAllomas() == this.celAllomas && this.kapacitas >= this.kontenerek.size()){
                this.kontenerek.add(k.getKontenerek().get(i));
                k.getKontenerek().remove(i);
            }
           
            
        }
        
    }
    

    public void celAllomasBeallit(String celAllomas) {
        this.celAllomas = celAllomas;
    }

    public String getNev() {
        return nev;
    }

    public int getKapacitas() {
        return kapacitas;
    }

    public String getCelAllomas() {
        return celAllomas;
    }

    public List<Kontener> getKontenerek() {
        return kontenerek;
    }

    public void setKontenerek(List<Kontener> kontenerek) {
        this.kontenerek = kontenerek;
    }

    public void setCelAllomas(String celAllomas) {
        this.celAllomas = celAllomas;
    }
    
    

    @Override
    public String toString() {
        return "A hajó neve " + nev + ", kapacitása " + kapacitas + ", celállomása " + celAllomas + ", konténerek " + kontenerek;
    }
    
    
   
}
