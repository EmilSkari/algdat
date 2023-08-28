public class longfak {

    public static void main(String[] args) {
        longfak hei = new longfak();
        System.out.println(hei.fak(5));

    }

long fak (int n){

        int tall = n;

   for (int i = n-1;i>0;i--){

       tall*=i;

   }

return tall;

}


}


