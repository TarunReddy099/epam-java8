package task.java8;

import java.util.*;

public class Average {
	
	public static void main(String[] args)
	{
		
		Scanner input=new Scanner(System.in);
		List<Integer> numbers=new ArrayList<Integer>();
		System.out.println("Enter the number of values for which you want to find the average.");
		int count=input.nextInt();
		  System.out.println("Enter the values");
		for(int i=0;i<count;i++)
		{
			numbers.add(input.nextInt());
		}
		 numbers.stream().mapToInt(i->i).average().ifPresent(avg-> System.out.println("The average is " +avg));
		 input.close();
	}
}
