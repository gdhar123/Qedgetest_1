package Practice;

public class AssOperator {
	
	static int speed = 80;
	static int dist = 20;
	static int time = 10;
	static String name = "toolsqa";
	static boolean isgood = true;
	
	
	public static void main(String[] args) 
	{
		
	System.out.println("Value stored in speer var is :" +speed);
	System.out.println("Value stored in dist var is "+dist);
	System.out.println("value stored in time var is "+time);
	System.out.println("value stored in  name is: "+name);
	System.out.println("value stored in  boolean var is: "+isgood);
	
	speed = 100;
	time = dist;
	name = "selenium qa";
	
		
	System.out.println("Value stored in speer var is :" +speed);
	System.out.println("Value stored in dist var is "+ time);
	System.out.println("value stored in name var is "+name);
	//System.out.println("value stored in  boolean var is: "+isgood);
	
	//speed=dist=0;
	//Realtion operator
	int ten= 10;
	int twenty =20;
	System.out.println("ten > twenty " + (ten > twenty));
	
	//conditional operator
	
	int ivalue, bvalue;
	ivalue = (ten==twenty)? 10: 20 ;
	System.out.println("ivalue is : " +ivalue);
	
	bvalue=(ten<twenty)?10:20;
	System.out.println(" ivalue is :" +bvalue);
	
	System.out.println();
	
	System.out.println("value stored in  speed var is: "+speed);
	
	int sum = speed + dist;
	
	System.out.println("value stored in  sum is: "+sum);
	
	}

}
