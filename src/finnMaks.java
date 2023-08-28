public class finnMaks {

    public static void main(String[] args) {

        int [] tabell = {2,2,40,35,6,4,6,2,346,26,3,2,12,2,6,1,3,8,7,56,2,35,34,124,16,4777,12422};

       int maksindeks = maks(tabell,23, 27);
        System.out.println(tabell[maksindeks]);

    }
public static int maks (int[] a, int fra, int til){

    if (fra<0 || til>a.length || fra>=til){

        throw new IllegalArgumentException("Funker ikke");
    }

int m = fra;
    int maksverdi =a[fra];

    for (int i = fra +1; i<til;i++){

        if (a[i]>maksverdi){

            m=i;
            maksverdi = a[m];
        }
    }


           return m;


}



}
