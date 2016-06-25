package Practice;

class toom {
	
	//int a,b,c;
	
	int a =10;
	int b =20;
	int c = 10;
	
 /*toom()
	{
		 a = 10;
		 b = 20;
	     c = 10;
	}*/
	public int area()
	{
		int d = a*b*c;
		return d;
		
	}
 public int parimeter()
 
 {
	 int d = a+b+c;
	 return d;
	 
 }
 
 public static void main (String[] args)
 {
	 toom t1 = new toom();
	 System.out.println(t1.area());
	 System.out.println(t1.parimeter());
	 
	 toom t2 = new toom();
	 	 t2.a=15;
	 	 
	 System.out.println(t2.area());
	 System.out.println(t2.parimeter());
 }
}
