 import java.util.*;
 class Area
	{
	  int x,a;
	  
	  void display()
	  { Scanner s=new Scanner(System.in);
         a=s.nextInt();
        x=a*a;
	  System.out.println("area is"+x);

	  }
    }
class Test
{
	
    public static void main(String args[])
{
	Area a=new Area();
	a.display();
 }
}