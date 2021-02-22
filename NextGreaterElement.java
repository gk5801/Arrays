package Array;

import java.util.*;
import java.lang.*;
import java.io.*;

public class NextGreaterElement
{
	public static void main (String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0)
		{
		    int n = Integer.parseInt(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[n];
		    for(int i=0; i<n; i++)
		    	arr[i]=Long.parseLong(inputLine[i]);
		    long[] res = new solve().nextLargerElement(arr, n);
		    
		    for (int i = 0; i < n; i++) 
		        System.out.print(res[i] + " ");
		    
		    System.out.println();
		}
	}
}
class solve
{
    public static long[] nextLargerElement(long[] arr, int n) 
    {
       int i,j;
       long res[] = new long[n];
       long next;
       for(i=0;i<n;i++)
      {
           next = -1;
           for(j=i+1;j<n;j++)
           {
              if(arr[i]<arr[j])
              { 
                 next = arr[j];
                 break;
              }
          } 
         res[i] = next;
     }
     return res;
 } 
}