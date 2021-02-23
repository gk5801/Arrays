package ArrayL;
import java.util.*;
public class LearningArrayList 
{
	public static void main(String args[])
	{
		ArrayList<Integer> al = new ArrayList<>();
		System.out.println(al.size()); 
	//	System.out.println();
		al.add(4);
		al.add(0,5);		
		al.add(1,6);
		al.add(54);
		al.add(65);
		al.add(79);
		al.add(58);
		al.add(90);
		al.add(45);
		System.out.println(al.indexOf(65));
		System.out.println(al.set(4,50));
		for(int i=0;i<al.size();i++)
		{
			System.out.print(al.get(i) + " ");
		}
		
		al.remove(7);
           
		//	System.out.println(	al.addAll(al));
	
		System.out.println();
//		al.remove(7); //will give exception
        al.removeAll(al);
		
		System.out.println("After removing elements : ");
		for(int i=0;i<al.size();i++)
		{
	    	System.out.print(al.get(i) + " "); //empty list
		}
	}
}
