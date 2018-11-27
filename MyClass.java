import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class MyClass {
        public static double getmedian(int []arr)
        {
        Arrays.sort(arr);
        double median=0;
        if(arr.length%2==0) //even
        {
            int i=arr.length/2;
            int k=(arr.length/2)-1;
            median+=arr[k];
            median+=arr[i];
            median/=2;
        }
        else  //odd
        {
            int i=arr.length/2;
            median+=arr[i];
        }
        return median;
        }
        public static char getmedian(char []arr)
        {
        Arrays.sort(arr);
        char c;
        if(arr.length%2==0) //even
        {
            int i=arr.length/2;
            int k=(arr.length/2)-1;
            int sum=(int)arr[k];
            sum+=(int)arr[i];
            sum/=2;
            c=(char)sum;
        }
        else  //odd
        {
            int i=arr.length/2;
            c=arr[i];
        }
        return c;
        }
	public MyClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
