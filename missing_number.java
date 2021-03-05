package Array;
import java.io.*;
import java.util.*;

class GFG {
 public static void main(String[] args) throws IOException {
     BufferedReader br =
         new BufferedReader(new InputStreamReader(System.in));

     int t = Integer.parseInt(br.readLine().trim());
     while (t-- > 0) {
         int n = Integer.parseInt(br.readLine().trim());
         String[] str = br.readLine().trim().split(" ");
         int[] array = new int[n - 1];
         for (int i = 0; i < n - 1; i++) {
             array[i] = Integer.parseInt(str[i]);
         }
         Solution sln = new Solution();
         System.out.println(sln.MissingNumber(array, n));
     }
 }
}// } Driver Code Ends
public class missing_number 
{
 int MissingNumber(int arr[], int n) 
 {
     int sum = 0;
     int sum1 = 0 ;
     for(int i=1;i<=n;i++)
     {
         sum = sum + i;
     }
     for(int j = 0; j<n-1;j++)
     {
         sum1 = sum1 + arr[j];
     }
     int diff = 0 ;
     diff = sum - sum1;
     return diff;
 }
 
}