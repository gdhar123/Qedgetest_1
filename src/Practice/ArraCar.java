package Practice;

public class ArraCar 
{

	public static void main(String[] args) 
	{
		
	String [] sMake = {"BMW","AUDI","MARUTI","ALTO","KWID"};
	
	Print_Array(sMake);
	}
	public static void Print_Array(String [] array)
	{
		for(int i=0; i<=array.length-1;i++)
		{ 
			System.out.println(array[i]);
	
		}
	}
	//int iLength = sMake.length;
	//System.out.println(+iLength);
	
	/*String a1Car = sMake[0];
	System.out.println("value of array at 0 position is: "+ a1Car);
	String aCar = sMake[iLength-1];
	System.out.println("value stored in " + aCar);
	
	for (int i=0;i<=iLength-1;i++)
	{
		System.out.println("Value stored at position :" + i + "in the sMake array is :" + sMake[i]);
		
	}*/
		
	
}
