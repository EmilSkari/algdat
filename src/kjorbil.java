import java.util.ArrayList;

public class kjorbil {
    public static void main(String[] args) {


            ArrayList<Biler> listeAvBiler = new ArrayList<>();
            Biler BIL1 = new Biler("BMW",46191);
            Biler BIL2 = new Biler("Volvo",84202);
            Biler BIL3 = new Biler("Wolksvagen",54747);

            listeAvBiler.add(BIL1);
            listeAvBiler.add(BIL2);
            listeAvBiler.add(BIL3);

            for (Biler i : listeAvBiler){

                System.out.println("BilNavn : " + i.getNavn());
            }

            for (Biler i : listeAvBiler){

                System.out.println("RegNr : " + i.getRegnr());



            }


        };


    };

