public class trhow {

    public static String testlol(int x){


        if (x<3){
            throw new IllegalArgumentException("verdien må være større enn 5");
        }

        String ja = "testen gikk bra";





return ja;
    }

    public static void main(String[] args) {
        System.out.println(testlol(6));

    }


}
