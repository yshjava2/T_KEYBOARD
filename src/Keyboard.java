import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Keyboard 
{
	public static void main(String[] args) throws IOException
	{
		while(true)
		{			
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader buff = new BufferedReader(isr);
			String result = buff.readLine();
			System.out.println(result);		
			
		}	

	}
}
