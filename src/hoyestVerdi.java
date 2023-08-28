public class hoyestVerdi {


    public static void main(String[] args) {

        int [] tall = {1,4,1,5,3,4};

        int høyest = tall[0];
        int nestHøyest = tall[1];

        for (int i = 1;i<tall.length;i++){
            int verdi = tall[i];
            if (verdi>høyest){
                høyest = verdi;
            }

        }

        System.out.println(høyest);


    }



}
