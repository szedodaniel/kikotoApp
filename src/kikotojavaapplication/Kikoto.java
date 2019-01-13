
package kikotojavaapplication;

import java.util.ArrayList;
import java.util.List;

public class Kikoto {
    
    private String nev;
    private int kapacitas;
    private List<Hajo> hajok;
    private List<Kontener> kontenerek;

    public Kikoto(String nev, int kapacitas) {
        this.nev = nev;
        this.kapacitas = kapacitas;
        this.kontenerek = new ArrayList<>();
        this.kontenerek.add(new Kontener("New York"));
        this.kontenerek.add(new Kontener("New York"));
        this.kontenerek.add(new Kontener("New York"));
    
        this.hajok = new ArrayList<>();
    }
    
    public void hozzaAd(Kontener k){
       
        this.kontenerek.add(k);
    }

    public String getNev() {
        return nev;
    }

    public int getKapacitas() {
        return kapacitas;
    }

    public List<Hajo> getHajok() {
        return hajok;
    }

    public List<Kontener> getKontenerek() {
        return kontenerek;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setKapacitas(int kapacitas) {
        this.kapacitas = kapacitas;
    }

    public void setHajok(List<Hajo> hajok) {
        this.hajok = hajok;
    }

    public void setKontenerek(List<Kontener> kontenerek) {
        this.kontenerek = kontenerek;
    }

    
    
    public boolean engedelyez(Hajo h){
        boolean kikothet = false;
        if(h.getCelAllomas().equals(this.nev) && h.getKontenerek().size() < this.kapacitas){
            kikothet = true;
        }
        return kikothet;
    }
}
