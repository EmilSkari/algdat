public class alg {
    public static void main(String[] args) {
        int [] vals = {16,3,6,1,6,4,1};

        int maksVerdi = vals[0];

        for (int i = 1;i<vals.length;i++){

int verdi = vals[i];
if (verdi>maksVerdi){
    maksVerdi=verdi;
}

        }
        System.out.println(maksVerdi);

    }
}
