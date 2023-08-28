
//Analysere denne: Tellende operasjoner. Her prøver vi å finne ut av hva som tar tid i en analyseeeeeee
public class lavest {
    public static void main(String[] args) {
        int [] tall = {3,5,1,-5,-5,19}; // Dette er en operasjon. "=" er en assignment. denne kopiseres til "Høyest"

        int høyest = tall[0]; //2 tellende operasjoner // Dette er en operasjon. "=" er en assignment. denne kopiseres til "Høyest

        // Dette er ogsp en operasjon. "[]". Dette tar tid fordi det er indeksering og må gå inn ii adressen til "Tall"

        for (int i = 1;i<tall.length;i++){ // "=" "<" "++"// "1" + "6" + "5"

            int verdi = tall[i]; // "=" "[]" // 2 * 5

            if (verdi<høyest){ //"<" 1*5
                høyest=verdi;// "=" 1*2;
            }


        }
        System.out.println(høyest);

        //Alt dette ble 37 operasjoner for 7 tall.




    }




}
