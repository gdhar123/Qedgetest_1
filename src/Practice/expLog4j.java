package Practice;

import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import java.io.IOException;

public class expLog4j 
{
	public void main(String[] args) throws IOException
	
	{
		Logger log = Logger.getLogger(expLog4j.class.getName());
		
		PatternLayout p = new PatternLayout("%d%C%M%m%n");
		
		FileAppender fa = new FileAppender(p,"C:\\Program Files\\Test.txt",false);
		log.addAppender(fa);
		int a = 10, b=20;
		if(a<b)
		{
			System.out.println("Test Passed");
		}else
		{
			System.out.println("test Failed: ");
		
		
		}
	}

}
