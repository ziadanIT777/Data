import java.util.Arrays;
import java.util.Random;

public class O_Three {

    public static void main ( String[] args ) {
        String arry[]={"10","20","30","40","50","60"};

        arry= remove(arry);
        System.out.println ( Arrays.toString (arry) );
    }


     static String[]remove ( String arry[] ){
        Random t =new Random ();
        while (arry.length>0){
            String e[]=new String[arry.length-1];
            int x = t.nextInt (arry.length);
            for (int i = 0; i < x; i++) {
                e[i]=arry[i];
            }
            for (int i = x; i < arry.length-1 ; i++) {
                e[i]=arry[i+1];
            }
            arry=e;
        }
        return arry;
    }
}

