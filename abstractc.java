import java.util.*;
abstract class demo1
{
	abstract void show();
	abstract void view();
	void display()
	{
		System.out.println("I Am Display");
	}
}
class abstractc extends demo1
{
	void show()
	{
		System.out.println("I Am Show");
	}
	void view()
	{
		System.out.println("I Am View");
	}
	public static void main(String arg[])
	{
		abstractc a = new abstractc();
		a.show();
		a.view();
		a.display();
	}
}