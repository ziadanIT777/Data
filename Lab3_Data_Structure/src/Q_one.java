import java.util.Arrays;

public class Q_one {
    public static void main ( String[] args ) {

        int  Arry []={20,30,40,50,60};
        int Arry2 []=new int[5];

        for (int i = 0; i < Arry2.length; i++) {

            Arry2[i] = Arry[i];

        }
        System.out.println ( Arrays.toString ( Arry2 ) );
    }
}
