package Array;
import java.util.Scanner;
public class Reverse_Array
{	
	static int[] reverse(int arr[])
	{
			int n =arr.length;
			int i=0,j=n-1;
			int reverse[] = new int[n];
			while(j>=0)
			{
					reverse[j] = arr[i];
					i++;
					j--;
			}
			return reverse;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0 ;i < n ; i++ )
		{				 
			 arr[i] = sc.nextInt();
		}
		int[] v = reverse(arr);
		for(int i = 0 ;i < n ; i++ )
		{				 
			System.out.print(v[i] + " " );
		}
	}
}