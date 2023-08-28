import java.util.Arrays;

public class oppgave1 {
    public static void main(String[] args) {


        int[] liste = {20, 34, -4, 4, 4, 5, 11, -23};

        Arrays.sort(liste);

        for (int i : liste){
if (i > 0 && i <=20){
    System.out.println(i);

}
        }




    }
}