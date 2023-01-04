import java.util.Arrays;

public class Q_One {
    public static void main ( String[] args ) {

        int arr[]={10,20,30,40,50,60};
        int j=arr.length-1;
        for (int i = 0; i <j/2 ; i++) {
            arr[i]=arr[i]+arr[j-i];
            arr[j-i]=arr[i]- arr[j-i];
            arr[i]=arr[i]-arr[j-i];

        }
        System.out.println ( Arrays.toString ( arr ) );
    }
}
