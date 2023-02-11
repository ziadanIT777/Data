import java.util.Arrays;

public class Q_Four {
    public static void main ( String[] args ) {

        int arry1 []={20,30,40,50};
        int arry2 []={60,70,80,90,100};
        boolean x = true;

        if (arry1==arry2)
        {
            System.out.println ("The Arrys equals");
        }

        else if (arry1.length == arry2.length)
        {
            for (int i = 0; i < arry1.length; i++)
            {
                if (arry1[i] != arry2[i])
                {
                    x = true;
                    break;
                }
                else
                    x = false;
            }

            if (x)
                System.out.println ("not equals");
            else
                System.out.println ("equals");

        }
     }
}
