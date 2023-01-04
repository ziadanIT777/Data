import java.util.Arrays;

public class Q_Tow {
    public static void main ( String[] args ) {

        int arry[]={10,20,30,40,50,60};
        int arry2[]= new int [6];
        for (int i = 0; i < arry.length; i++) {
            arry2[i]=arry[i];
        }
        System.out.println ( Arrays.toString ( arry2 ) );
    }
}
