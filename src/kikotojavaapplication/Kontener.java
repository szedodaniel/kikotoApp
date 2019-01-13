
package kikotojavaapplication;


public class Kontener {

    private String celAllomas;

    public Kontener(String celAllomas) {
        this.celAllomas = celAllomas;
    }

    public void setCelAllomas(String celAllomas) {
        this.celAllomas = celAllomas;
    }

    public String getCelAllomas() {
        return celAllomas;
    }

    @Override
    public String toString() {
        return "CélÁllomás: "+celAllomas;
    }
    
    
}
