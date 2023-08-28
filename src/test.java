import java.util.ArrayList;

public class test {

    private String navn;
    private String etternavn;

    public test(String navn, String etternavn) {
        this.navn = navn;
        this.etternavn = etternavn;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    ArrayList<test> navneliste = new ArrayList<>();

    public String testtest() {
        test nanv = new test("emil", "skari");
        navneliste.add(nanv);

        return null;
    }
}


