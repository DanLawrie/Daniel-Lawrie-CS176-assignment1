package danielLawrie;
import java.util.Scanner;

public class Question2 {
	
	public static void main(String[] args) {
		System.out.println("input double values");
		Scanner in = new Scanner(System.in);
		int i = 0;
		int x = 10;
		double[] array = new double[10];
		while(i< x && in.hasNextDouble())
		{
			array[i] = in.nextDouble();
		
			i++;
		}
		i = 0;
		while(i<10)
		{
			
			System.out.println(array[i]+" ");
			i = i + 2;
		}
		for(double element : array)
		{
			if(element%2 == 0)
			{
				System.out.print(element + "  ");
			}
		}
		for(double element : array)
		{
			if(element%2 != 0)
			{
				System.out.print(element+" ");
			}
		}
		System.out.println();

		for (int y = 0; y<10;y++ ) {
			 
			 System.out.print(array[9-y] + " ");
			
			
		}
		System.out.println();
		
		
		
	System.out.print(array[0]+" ");
	System.out.print(array[4]+" ");
	System.out.print(array[9]+" ");
	System.out.println();
	double large = 0;
	double small = 12;
	for(int g = 0; g<10;g++)
	{
		if(array[g]>large)
		{
			large = array[g];
		}
		if(array[g]<small)
		{
			small = array[g];
		}
		
		
	}
	System.out.println("Largest number " + large);
	System.out.println("Smallest number " + small);
	
	double total = 0;
	for(i = 0; i<10; i++)
	{
		if(i%2 == 0) {
			total = total + array[i];
		}
		if(i%2 != 0) {
			total = total - array[i];
		}
	}
	System.out.println("total" + total);
	}
}
