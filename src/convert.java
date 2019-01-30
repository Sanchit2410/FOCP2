import java.util.*;
public class convert
{
	public static void main(String args[])
	{
	  try{
	  int a,b,c;
	  Scanner ob=new Scanner(System.in);
	  System.out.println("enter the number");
	  a=ob.nextInt();
	  System.out.println("enter the which you want to divide");
	  b=ob.nextInt();
      c=a/b;
	}catch(ArithmeticException e)
	{
	 System.out.println(e);
	}
   System.out.println("rest of the code...");	
 }
}