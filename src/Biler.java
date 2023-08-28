
//Lag en konstruktør med getters og setters der du legger bilene inn i en liste.

import java.util.ArrayList;


public class Biler {
    private String navn;
    private int regnr;


    public Biler(String navn, int regnr) {
        this.navn = navn;
        this.regnr = regnr;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;


    }

    ;

    public int getRegnr() {
        return regnr;
    }

    public void setRegnr(int regnr) {
        this.regnr = regnr;
    }
}




