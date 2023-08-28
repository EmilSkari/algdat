public class oppg5 {

    public static int[] minmaks(int[] a) {



        int max = a[0];
        int min = a[0];

        for (int i = 1;i<a.length;i++){

            int verdi = a[i];

            if (verdi>max){
                max = verdi;
            }

            if (verdi<min){
                min=verdi;
            }



        }

int [] resultat = {min,max};
        System.out.println(max);
        System.out.println(min);

        return resultat;

    }



    public static void main(String[] args) {
        int [] tallarray = {10,6};

        int [] minMaksResultat = minmaks(tallarray);

        int maks = tallarray[1];
        int mint = tallarray[0];






    }
}