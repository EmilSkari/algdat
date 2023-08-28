public class nesthøyest {

    int [] tall = {4,1,8,5,2,7};



    public static int finntall(int [] tall){
        int høyest = tall[0];
        int nest_høyest = tall[1];

        for (int i = 1;i<tall.length;i++){
            int igjennom = tall[i];

            if (høyest<igjennom){
                igjennom=høyest;

                if (nest_høyest<igjennom){

                    System.out.println(nest_høyest);
                }

            }
        }


        return høyest;
    }

    public static void main(String[] args) {

    }



}
