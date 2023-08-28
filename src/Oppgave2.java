import java.util.ArrayList;

public class Oppgave2 {
    public static void main(String[] args) {
        class Valuta {
            private String valuta;
            private Double kurs;

            public Valuta(String valuta, Double kurs) {
                this.valuta = valuta;
                this.kurs = kurs;
            }

            public String getValuta() {
                return valuta;
            }


            public Double getKurs() {
                return kurs;
            }

        }

        class ValutaKalkulator {
            private ArrayList<Valuta> valutaKurser = new ArrayList<>();

            public ValutaKalkulator(){
                Valuta usd = new Valuta("USD",8.6);
                valutaKurser.add(usd);
                Valuta dkk = new Valuta("DKK",1.3);
                valutaKurser.add(dkk);


            }

            public double beregnKurs (String valuta){
                for (Valuta kurs : valutaKurser){
                    if (kurs.getValuta().equals(valuta)){
                        return kurs.getKurs();
                    }
                }
                return 0;


            }


        }



    }



}
