//Write a program that prints out the numbers 1 to 100 (inclusive).
//If the number is divisible by 3, print "Code" instead of the number. 
//If it's divisible by 5, print "Quotient". If it's divisible by both 3 and 5, 
//print "CodeQuotient". You can use any programming language.
package placement;
import java.util.*;
public class print_number 
{
		static void Call(int i)
		{	
			if(i%3 ==0 && i%5==0)
		         System.out.println("CodeQuotient");
			else if(i%3 == 0 )
					System.out.println("Code");
			else if(i%5 == 0)
				System.out.println("Quotient");
			 else
			 System.out.println(i);
		}
		public static void main(String args[])
		{
				int i =1 ;
				while(i<=100)
				{
						Call(i);
						i++;
				}
		}
}
