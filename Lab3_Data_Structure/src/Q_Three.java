import java.util.Arrays;

public class Q_Three {
    public static void main ( String[] args ) {
        int [] arry1 = {20,30,40,50,60};

        int [] arry2 = {70,80,90,99,88};

        int [] arry3 = new int[arry1.length+arry2.length];

        for (int i = 0; i < arry1.length; i++)
        {
            arry3[i] = arry1[i];
        }

        for (int i = 0; i < arry2.length; i++)
        {
            arry3[(arry1.length) + i] = arry2[i];
        }

        System.out.println ( Arrays.toString ( arry3 ) );


    }
}
