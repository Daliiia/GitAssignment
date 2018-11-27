import java.io.*;
import java.util.*;
import java.util.Scanner;
///////////////////////////////////////
public class MyClass {
	public MyClass() 
	{ }
	/////////////////////////
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
        ///////////////////////////////////////////////////////////////
	public static void main(String[] args) 
	{
		

	}

}
